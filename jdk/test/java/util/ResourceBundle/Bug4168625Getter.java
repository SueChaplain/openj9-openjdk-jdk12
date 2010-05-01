/*
 * Copyright (c) 2007 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
/*
 *
 *
 * (C) Copyright IBM Corp. 1999 - All Rights Reserved
 *
 * The original version of this source code and documentation is
 * copyrighted and owned by IBM. These materials are provided
 * under terms of a License Agreement between IBM and Sun.
 * This technology is protected by multiple US and International
 * patents. This notice and attribution to IBM may not be removed.
 *
 */

import java.util.ResourceBundle;
import java.util.Locale;

/**
 * Interface loaded by system class loader allowing
 * Bug4168625Class instances to be called by
 * test class.  This class provides a common base class
 * for classes loaded by different loaders.  Both the system
 * loader and the custom loader used by the Bug4168625Test
 * class load this same interface class using the system class
 * loader.  The custom loader then loads a subclass that is
 * then passed back to the caller.  The fact that the caller
 * and loader share a common base class allows the caller
 * to cast the object without causing a ClassCastException.
 */
public interface Bug4168625Getter {
    /** return the specified resource or null if not found */
    public ResourceBundle getResourceBundle(String resource, Locale locale);
}
