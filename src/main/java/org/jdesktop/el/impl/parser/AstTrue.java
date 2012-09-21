/*
 * Copyright (C) 2007 Sun Microsystems, Inc. All rights reserved. Use is
 * subject to license terms.
 *
 *//* Generated By:JJTree: Do not edit this line. AstTrue.java */

package org.jdesktop.el.impl.parser;

import org.jdesktop.el.ELException;

import org.jdesktop.el.impl.lang.EvaluationContext;

/**
 * @author Jacob Hookom [jacob@hookom.net]
 * @version $Change: 181177 $$DateTime: 2001/06/26 08:45:09 $$Author: spuhl $
 */
public final class AstTrue extends BooleanNode {
    public AstTrue(int id) {
        super(id);
    }

    public Object getValue(EvaluationContext ctx)
            throws ELException {
        return Boolean.TRUE;
    }
}
