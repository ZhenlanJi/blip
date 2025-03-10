// /////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2001, Eric D. Friedman All Rights Reserved.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
// /////////////////////////////////////////////////////////////////////////////

package ch.idsia.blip.core.utils.data.map;


/**
 * Interface for functions that accept and return one Object reference.
 * <p/>
 * Created: Mon Nov  5 22:19:36 2001
 *
 * @author Eric D. Friedman
 * @version $Id: TObjectFunction.java,v 1.1.2.1 2009/09/06 17:02:19 upholderoftruth Exp $
 */

public interface TObjectFunction<T, R> {

    /**
     * Execute this function with <tt>value</tt>
     *
     * @param value an <code>Object</code> input
     * @return an <code>Object</code> result
     */
    public R execute(T value);
}// TObjectFunction
