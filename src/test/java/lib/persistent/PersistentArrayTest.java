/* Copyright (C) 2017  Intel Corporation
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 only, as published by the Free Software Foundation.
 * This file has been designated as subject to the "Classpath"
 * exception as provided in the LICENSE file that accompanied
 * this code.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License version 2 for more details (a copy
 * is included in the LICENSE file that accompanied this code).
 *
 * You should have received a copy of the GNU General Public License
 * version 2 along with this program; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 */

package lib.persistent;

import java.util.*;

public class PersistentArrayTest {

    public static void main(String[] args) {
        System.out.println("****************PersistentArray Tests****************");
        testGetSet();
        testEmptyArray();
        testOutOfBounds();
    }

    public static void testGetSet() {
        System.out.println("****************Testing array get/set****************");

        PersistentArray<PersistentString> arr = new PersistentArray<>(5);
        PersistentString[] jarr = new PersistentString[5];
        for (int i = 0; i < 5; i++) {
            PersistentString str = new PersistentString("hi"+i);
            arr.set(i, str);
            jarr[i] = str;
        }
        for (int i = 0; i < 5; i++) {
            assert(arr.get(i).equals(jarr[i]));
        }
        int i = 0;
        Iterator<PersistentString> it = arr.iterator();
        while (it.hasNext()) {
            assert(it.next().equals(jarr[i]));
            i++;
        }

        assert(arr.size() == 5L);
    }

    public static void testEmptyArray() {
        System.out.println("****************Testing empty array****************");

        PersistentArray<PersistentLong> arr = new PersistentArray<>(0);
        assert(arr.size() == 0L);

        boolean caught = false;
        try {
            arr.set(0, new PersistentLong(0L));
        } catch (ArrayIndexOutOfBoundsException e) {
            caught = true;
        }
        assert(caught);
        PersistentArray<PersistentLong> arr2 = new PersistentArray<>(0);
    }

    public static void testOutOfBounds() {
        System.out.println("****************Testing array out of bounds****************");

        PersistentArray<PersistentLong> arr = new PersistentArray<>(5);
        assert(arr.size() == 5L);

        arr.set(0, new PersistentLong(0L));
        arr.set(4, new PersistentLong(0L));
        boolean caught = false;
        try {
            arr.set(5, new PersistentLong(0L));
        } catch (ArrayIndexOutOfBoundsException e) {
            caught = true;
        }
        assert(caught);

        caught = false;
        try {
            arr.set(-1, new PersistentLong(0L));
        } catch (ArrayIndexOutOfBoundsException e) {
            caught = true;
        }
        assert(caught);
    }
}
