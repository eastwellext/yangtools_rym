/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yangtools.yang.model.api.stmt;

import static com.google.common.base.Verify.verifyNotNull;

import java.util.Collection;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.model.api.stmt.SchemaNodeIdentifier.Descendant;

public interface RefineStatement extends ConfigStatementAwareDeclaredStatement<Descendant>,
        DocumentedDeclaredStatement<Descendant>, IfFeatureAwareDeclaredStatement<Descendant>,
        MandatoryStatementAwareDeclaredStatement<Descendant>,
        MustStatementAwareDeclaredStatement<Descendant> {
    default @NonNull String getTargetNode() {
        // FIXME: YANGTOOLS-908: verifyNotNull() should not be needed here
        return verifyNotNull(rawArgument());
    }

    default @NonNull Collection<? extends DefaultStatement> getDefaults() {
        return declaredSubstatements(DefaultStatement.class);
    }

    default @Nullable PresenceStatement getPresence() {
        final Optional<PresenceStatement> opt = findFirstDeclaredSubstatement(PresenceStatement.class);
        return opt.isPresent() ? opt.get() : null;
    }

    default @Nullable MinElementsStatement getMinElements() {
        final Optional<MinElementsStatement> opt = findFirstDeclaredSubstatement(MinElementsStatement.class);
        return opt.isPresent() ? opt.get() : null;
    }

    default @Nullable MaxElementsStatement getMaxElements() {
        final Optional<MaxElementsStatement> opt = findFirstDeclaredSubstatement(MaxElementsStatement.class);
        return opt.isPresent() ? opt.get() : null;
    }
}
