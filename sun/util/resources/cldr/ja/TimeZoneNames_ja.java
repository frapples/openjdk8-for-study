/*
 * Copyright (c) 2012, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2012 Unicode, Inc. All rights reserved. Distributed under
 * the Terms of Use in http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of the Unicode data files and any associated documentation (the "Data
 * Files") or Unicode software and any associated documentation (the
 * "Software") to deal in the Data Files or Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, and/or sell copies of the Data Files or Software, and
 * to permit persons to whom the Data Files or Software are furnished to do so,
 * provided that (a) the above copyright notice(s) and this permission notice
 * appear with all copies of the Data Files or Software, (b) both the above
 * copyright notice(s) and this permission notice appear in associated
 * documentation, and (c) there is clear notice in each modified Data File or
 * in the Software as well as in the documentation associated with the Data
 * File(s) or Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF
 * THIRD PARTY RIGHTS. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS
 * INCLUDED IN THIS NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR
 * CONSEQUENTIAL DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder shall not
 * be used in advertising or otherwise to promote the sale, use or other
 * dealings in these Data Files or Software without prior written authorization
 * of the copyright holder.
 */

package sun.util.resources.cldr.ja;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_ja extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Africa_Central = new String[] {
               "\u4e2d\u592e\u30a2\u30d5\u30ea\u30ab\u6642\u9593",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] Moscow = new String[] {
               "\u30e2\u30b9\u30af\u30ef\u6a19\u6e96\u6642",
               "MST",
               "\u30e2\u30b9\u30af\u30ef\u590f\u6642\u9593",
               "MST",
               "\u30e2\u30b9\u30af\u30ef\u6642\u9593",
               "MT",
            };
        final String[] Japan = new String[] {
               "\u65e5\u672c\u6a19\u6e96\u6642",
               "JST",
               "\u65e5\u672c\u590f\u6642\u9593",
               "JDT",
               "\u65e5\u672c\u6642\u9593",
               "JT",
            };
        final String[] Hovd = new String[] {
               "\u30db\u30d6\u30c8\u6a19\u6e96\u6642",
               "HST",
               "\u30db\u30d6\u30c8\u590f\u6642\u9593",
               "HST",
               "\u30db\u30d6\u30c8\u6642\u9593",
               "HT",
            };
        final String[] Magadan = new String[] {
               "\u30de\u30ac\u30c0\u30f3\u6a19\u6e96\u6642",
               "MST",
               "\u30de\u30ac\u30c0\u30f3\u590f\u6642\u9593",
               "MST",
               "\u30de\u30ac\u30c0\u30f3\u6642\u9593",
               "MT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u897f\u90e8\u6a19\u6e96\u6642",
               "ACWST",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u897f\u90e8\u590f\u6642\u9593",
               "ACWDT",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u897f\u90e8\u6642\u9593",
               "ACWT",
            };
        final String[] Europe_Central = new String[] {
               "\u4e2d\u592e\u30e8\u30fc\u30ed\u30c3\u30d1\u6a19\u6e96\u6642",
               "CEST",
               "\u4e2d\u592e\u30e8\u30fc\u30ed\u30c3\u30d1\u590f\u6642\u9593",
               "CEST",
               "\u4e2d\u592e\u30e8\u30fc\u30ed\u30c3\u30d1\u6642\u9593",
               "CET",
            };
        final String[] Sakhalin = new String[] {
               "\u30b5\u30cf\u30ea\u30f3\u6a19\u6e96\u6642",
               "SST",
               "\u30b5\u30cf\u30ea\u30f3\u590f\u6642\u9593",
               "SST",
               "\u30b5\u30cf\u30ea\u30f3\u6642\u9593",
               "ST",
            };
        final String[] Paraguay = new String[] {
               "\u30d1\u30e9\u30b0\u30a2\u30a4\u6a19\u6e96\u6642",
               "PST",
               "\u30d1\u30e9\u30b0\u30a2\u30a4\u590f\u6642\u9593",
               "PST",
               "\u30d1\u30e9\u30b0\u30a2\u30a4\u6642\u9593",
               "PT",
            };
        final String[] America_Eastern = new String[] {
               "\u30a2\u30e1\u30ea\u30ab\u6771\u90e8\u6a19\u6e96\u6642",
               "EST",
               "\u30a2\u30e1\u30ea\u30ab\u6771\u90e8\u590f\u6642\u9593",
               "EDT",
               "\u30a2\u30e1\u30ea\u30ab\u6771\u90e8\u6642\u9593",
               "ET",
            };
        final String[] Lord_Howe = new String[] {
               "\u30ed\u30fc\u30c9\u30cf\u30a6\u6a19\u6e96\u6642",
               "LHST",
               "\u30ed\u30fc\u30c9\u30cf\u30a6\u590f\u6642\u9593",
               "LHDT",
               "\u30ed\u30fc\u30c9\u30cf\u30a6\u6642\u9593",
               "LHT",
            };
        final String[] Indian_Ocean = new String[] {
               "\u82f1\u9818\u30a4\u30f3\u30c9\u6d0b\u5730\u57df\u6a19\u6e96\u6642",
               "IOT",
               "Indian Ocean Summer Time",
               "IOST",
               "Indian Ocean Time",
               "IOT",
            };
        final String[] Yakutsk = new String[] {
               "\u30e4\u30af\u30fc\u30c4\u30af\u6a19\u6e96\u6642",
               "YST",
               "\u30e4\u30af\u30fc\u30c4\u30af\u590f\u6642\u9593",
               "YST",
               "\u30e4\u30af\u30fc\u30c4\u30af\u6642\u9593",
               "YT",
            };
        final String[] Mauritius = new String[] {
               "\u30e2\u30fc\u30ea\u30b7\u30e3\u30b9\u6a19\u6e96\u6642",
               "MST",
               "\u30e2\u30fc\u30ea\u30b7\u30e3\u30b9\u590f\u6642\u9593",
               "MST",
               "\u30e2\u30fc\u30ea\u30b7\u30e3\u30b9\u6642\u9593",
               "MT",
            };
        final String[] Africa_Eastern = new String[] {
               "\u6771\u30a2\u30d5\u30ea\u30ab\u6642\u9593",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final String[] East_Timor = new String[] {
               "\u6771\u30c6\u30a3\u30e2\u30fc\u30eb\u6a19\u6e96\u6642",
               "ETT",
               "East Timor Summer Time",
               "ETST",
               "East Timor Time",
               "ETT",
            };
        final String[] Europe_Eastern = new String[] {
               "\u6771\u30e8\u30fc\u30ed\u30c3\u30d1\u6a19\u6e96\u6642",
               "EEST",
               "\u6771\u30e8\u30fc\u30ed\u30c3\u30d1\u590f\u6642\u9593",
               "EEST",
               "\u6771\u30e8\u30fc\u30ed\u30c3\u30d1\u6642\u9593",
               "EET",
            };
        final String[] Newfoundland = new String[] {
               "\u30cb\u30e5\u30fc\u30d5\u30a1\u30f3\u30c9\u30e9\u30f3\u30c9\u5cf6\u6a19\u6e96\u6642",
               "NST",
               "\u30cb\u30e5\u30fc\u30d5\u30a1\u30f3\u30c9\u30e9\u30f3\u30c9\u5cf6\u590f\u6642\u9593",
               "NDT",
               "\u30cb\u30e5\u30fc\u30d5\u30a1\u30f3\u30c9\u30e9\u30f3\u30c9\u5cf6\u6642\u9593",
               "NT",
            };
        final String[] Afghanistan = new String[] {
               "\u30a2\u30d5\u30ac\u30cb\u30b9\u30bf\u30f3\u6a19\u6e96\u6642",
               "AT",
               "Afghanistan Summer Time",
               "AST",
               "Afghanistan Time",
               "AT",
            };
        final String[] Hong_Kong = new String[] {
               "\u9999\u6e2f\u6a19\u6e96\u6642",
               "HKST",
               "\u9999\u6e2f\u590f\u6642\u9593",
               "HKST",
               "\u9999\u6e2f\u6642\u9593",
               "HKT",
            };
        final String[] Argentina_Western = new String[] {
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u897f\u90e8\u6a19\u6e96\u6642",
               "WAST",
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u897f\u90e8\u590f\u6642\u9593",
               "WAST",
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u897f\u90e8\u6642\u9593",
               "WAT",
            };
        final String[] Atlantic = new String[] {
               "\u5927\u897f\u6d0b\u6a19\u6e96\u6642",
               "AST",
               "\u5927\u897f\u6d0b\u590f\u6642\u9593",
               "ADT",
               "\u5927\u897f\u6d0b\u6642\u9593",
               "AT",
            };
        final String[] Bolivia = new String[] {
               "\u30dc\u30ea\u30d3\u30a2\u6a19\u6e96\u6642",
               "BT",
               "Bolivia Summer Time",
               "BST",
               "Bolivia Time",
               "BT",
            };
        final String[] Indochina = new String[] {
               "\u30a4\u30f3\u30c9\u30b7\u30ca\u6a19\u6e96\u6642",
               "IT",
               "Indochina Summer Time",
               "IST",
               "Indochina Time",
               "IT",
            };
        final String[] Yekaterinburg = new String[] {
               "\u30a8\u30ab\u30c6\u30ea\u30f3\u30d6\u30eb\u30b0\u6a19\u6e96\u6642",
               "YST",
               "\u30a8\u30ab\u30c6\u30ea\u30f3\u30d6\u30eb\u30b0\u590f\u6642\u9593",
               "YST",
               "\u30a8\u30ab\u30c6\u30ea\u30f3\u30d6\u30eb\u30b0\u6642\u9593",
               "YT",
            };
        final String[] Maldives = new String[] {
               "\u30e2\u30eb\u30c7\u30a3\u30d6\u6a19\u6e96\u6642",
               "MT",
               "Maldives Summer Time",
               "MST",
               "Maldives Time",
               "MT",
            };
        final String[] Israel = new String[] {
               "\u30a4\u30b9\u30e9\u30a8\u30eb\u6a19\u6e96\u6642",
               "IST",
               "\u30a4\u30b9\u30e9\u30a8\u30eb\u590f\u6642\u9593",
               "IDT",
               "\u30a4\u30b9\u30e9\u30a8\u30eb\u6642\u9593",
               "IT",
            };
        final String[] Indonesia_Central = new String[] {
               "\u30a4\u30f3\u30c9\u30cd\u30b7\u30a2\u4e2d\u90e8\u6642\u9593",
               "CIT",
               "Central Indonesia Summer Time",
               "CIST",
               "Central Indonesia Time",
               "CIT",
            };
        final String[] Africa_Southern = new String[] {
               "\u5357\u30a2\u30d5\u30ea\u30ab\u6642\u9593",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] Syowa = new String[] {
               "\u662d\u548c\u57fa\u5730\u6642\u9593",
               "ST",
               "Syowa Summer Time",
               "SST",
               "Syowa Time",
               "ST",
            };
        final String[] Omsk = new String[] {
               "\u30aa\u30e0\u30b9\u30af\u6a19\u6e96\u6642",
               "OST",
               "\u30aa\u30e0\u30b9\u30af\u590f\u6642\u9593",
               "OST",
               "\u30aa\u30e0\u30b9\u30af\u6642\u9593",
               "OT",
            };
        final String[] Seychelles = new String[] {
               "\u30bb\u30fc\u30b7\u30a7\u30eb\u6a19\u6e96\u6642",
               "ST",
               "Seychelles Summer Time",
               "SST",
               "Seychelles Time",
               "ST",
            };
        final String[] Uruguay = new String[] {
               "\u30a6\u30eb\u30b0\u30a2\u30a4\u6a19\u6e96\u6642",
               "UST",
               "\u30a6\u30eb\u30b0\u30a2\u30a4\u590f\u6642\u9593",
               "UST",
               "\u30a6\u30eb\u30b0\u30a2\u30a4\u6642\u9593",
               "UT",
            };
        final String[] Mongolia = new String[] {
               "\u30a6\u30e9\u30f3\u30d0\u30fc\u30c8\u30eb\u6a19\u6e96\u6642",
               "UBST",
               "\u30a6\u30e9\u30f3\u30d0\u30fc\u30c8\u30eb\u590f\u6642\u9593",
               "UBST",
               "\u30a6\u30e9\u30f3\u30d0\u30fc\u30c8\u30eb\u6642\u9593",
               "UBT",
            };
        final String[] America_Central = new String[] {
               "\u30a2\u30e1\u30ea\u30ab\u4e2d\u90e8\u6a19\u6e96\u6642",
               "CST",
               "\u30a2\u30e1\u30ea\u30ab\u4e2d\u90e8\u590f\u6642\u9593",
               "CDT",
               "\u30a2\u30e1\u30ea\u30ab\u4e2d\u90e8\u6642\u9593",
               "CT",
            };
        final String[] Falkland = new String[] {
               "\u30d5\u30a9\u30fc\u30af\u30e9\u30f3\u30c9\u8af8\u5cf6\u6a19\u6e96\u6642",
               "FIST",
               "\u30d5\u30a9\u30fc\u30af\u30e9\u30f3\u30c9\u8af8\u5cf6\u590f\u6642\u9593",
               "FIST",
               "\u30d5\u30a9\u30fc\u30af\u30e9\u30f3\u30c9\u8af8\u5cf6\u6642\u9593",
               "FIT",
            };
        final String[] Novosibirsk = new String[] {
               "\u30ce\u30dc\u30b7\u30d3\u30eb\u30b9\u30af\u6a19\u6e96\u6642",
               "NST",
               "\u30ce\u30dc\u30b7\u30d3\u30eb\u30b9\u30af\u590f\u6642\u9593",
               "NST",
               "\u30ce\u30dc\u30b7\u30d3\u30eb\u30b9\u30af\u6642\u9593",
               "NT",
            };
        final String[] Azores = new String[] {
               "\u30a2\u30be\u30ec\u30b9\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30be\u30ec\u30b9\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30be\u30ec\u30b9\u6642\u9593",
               "AT",
            };
        final String[] Bhutan = new String[] {
               "\u30d6\u30fc\u30bf\u30f3\u6a19\u6e96\u6642",
               "BT",
               "Bhutan Summer Time",
               "BST",
               "Bhutan Time",
               "BT",
            };
        final String[] Suriname = new String[] {
               "\u30b9\u30ea\u30ca\u30e0\u6a19\u6e96\u6642",
               "ST",
               "Suriname Summer Time",
               "SST",
               "Suriname Time",
               "ST",
            };
        final String[] Krasnoyarsk = new String[] {
               "\u30af\u30e9\u30b9\u30ce\u30e4\u30eb\u30b9\u30af\u6a19\u6e96\u6642",
               "KST",
               "\u30af\u30e9\u30b9\u30ce\u30e4\u30eb\u30b9\u30af\u590f\u6642\u9593",
               "KST",
               "\u30af\u30e9\u30b9\u30ce\u30e4\u30eb\u30b9\u30af\u6642\u9593",
               "KT",
            };
        final String[] Kazakhstan_Western = new String[] {
               "\u30ab\u30b6\u30d5\u30b9\u30bf\u30f3\u897f\u90e8\u6642\u9593",
               "WKT",
               "West Kazakhstan Summer Time",
               "WKST",
               "West Kazakhstan Time",
               "WKT",
            };
        final String[] Christmas = new String[] {
               "\u30af\u30ea\u30b9\u30de\u30b9\u5cf6\u6a19\u6e96\u6642",
               "CIT",
               "Christmas Island Summer Time",
               "CIST",
               "Christmas Island Time",
               "CIT",
            };
        final String[] Amazon = new String[] {
               "\u30a2\u30de\u30be\u30f3\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30de\u30be\u30f3\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30de\u30be\u30f3\u6642\u9593",
               "AT",
            };
        final String[] Kazakhstan_Eastern = new String[] {
               "\u30ab\u30b6\u30d5\u30b9\u30bf\u30f3\u6771\u90e8\u6642\u9593",
               "EKT",
               "East Kazakhstan Summer Time",
               "EKST",
               "East Kazakhstan Time",
               "EKT",
            };
        final String[] Reunion = new String[] {
               "\u30ec\u30e6\u30cb\u30aa\u30f3\u6a19\u6e96\u6642",
               "RT",
               "Reunion Summer Time",
               "RST",
               "Reunion Time",
               "RT",
            };
        final String[] Cocos = new String[] {
               "\u30b3\u30b3\u30b9\u8af8\u5cf6\u6a19\u6e96\u6642",
               "CIT",
               "Cocos Islands Summer Time",
               "CIST",
               "Cocos Islands Time",
               "CIT",
            };
        final String[] Vostok = new String[] {
               "\u30dc\u30b9\u30c8\u30fc\u30af\u57fa\u5730\u6642\u9593",
               "VT",
               "Vostok Summer Time",
               "VST",
               "Vostok Time",
               "VT",
            };
        final String[] Argentina = new String[] {
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3\u6642\u9593",
               "AT",
            };
        final String[] Macquarie = new String[] {
               "\u30de\u30c3\u30b3\u30fc\u30ea\u30fc\u6642\u9593",
               "MIT",
               "Macquarie Island Summer Time",
               "MIST",
               "Macquarie Island Time",
               "MIT",
            };
        final String[] Venezuela = new String[] {
               "\u30d9\u30cd\u30ba\u30a8\u30e9\u6a19\u6e96\u6642",
               "VT",
               "Venezuela Summer Time",
               "VST",
               "Venezuela Time",
               "VT",
            };
        final String[] Hawaii_Aleutian = new String[] {
               "\u30cf\u30ef\u30a4\u2212\u30a2\u30ea\u30e5\u30fc\u30b7\u30e3\u30f3\u6a19\u6e96\u6642",
               "HAST",
               "\u30cf\u30ef\u30a4\u2212\u30a2\u30ea\u30e5\u30fc\u30b7\u30e3\u30f3\u590f\u6642\u9593",
               "HADT",
               "\u30cf\u30ef\u30a4 \u30a2\u30ea\u30e5\u30fc\u30b7\u30e3\u30f3\u6642\u9593",
               "HAT",
            };
        final String[] Australia_Central = new String[] {
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u90e8\u6a19\u6e96\u6642",
               "ACST",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u90e8\u590f\u6642\u9593",
               "ACDT",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u4e2d\u90e8\u6642\u9593",
               "CAT",
            };
        final String[] America_Pacific = new String[] {
               "\u30a2\u30e1\u30ea\u30ab\u592a\u5e73\u6d0b\u6a19\u6e96\u6642",
               "PST",
               "\u30a2\u30e1\u30ea\u30ab\u592a\u5e73\u6d0b\u590f\u6642\u9593",
               "PDT",
               "\u30a2\u30e1\u30ea\u30ab\u592a\u5e73\u6d0b\u6642\u9593",
               "PT",
            };
        final String[] Europe_Western = new String[] {
               "\u897f\u30e8\u30fc\u30ed\u30c3\u30d1\u6a19\u6e96\u6642",
               "WEST",
               "\u897f\u30e8\u30fc\u30ed\u30c3\u30d1\u590f\u6642\u9593",
               "WEST",
               "\u897f\u30e8\u30fc\u30ed\u30c3\u30d1\u6642\u9593",
               "WET",
            };
        final String[] Cape_Verde = new String[] {
               "\u30ab\u30fc\u30dc\u30d9\u30eb\u30c7\u6a19\u6e96\u6642",
               "CVST",
               "\u30ab\u30fc\u30dc\u30d9\u30eb\u30c7\u590f\u6642\u9593",
               "CVST",
               "\u30ab\u30fc\u30dc\u30d9\u30eb\u30c7\u6642\u9593",
               "CVT",
            };
        final String[] Norfolk = new String[] {
               "\u30ce\u30fc\u30d5\u30a9\u30fc\u30af\u8af8\u5cf6\u6642\u9593",
               "NIT",
               "Norfolk Islands Summer Time",
               "NIST",
               "Norfolk Islands Time",
               "NIT",
            };
        final String[] Guyana = new String[] {
               "\u30ae\u30a2\u30ca\u6a19\u6e96\u6642",
               "GT",
               "Guyana Summer Time",
               "GST",
               "Guyana Time",
               "GT",
            };
        final String[] Rothera = new String[] {
               "\u30ed\u30bc\u30e9\u7814\u7a76\u57fa\u5730\u6642\u9593",
               "RT",
               "Rothera Summer Time",
               "RST",
               "Rothera Time",
               "RT",
            };
        final String[] Azerbaijan = new String[] {
               "\u30a2\u30bc\u30eb\u30d0\u30a4\u30b8\u30e3\u30f3\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30bc\u30eb\u30d0\u30a4\u30b8\u30e3\u30f3\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30bc\u30eb\u30d0\u30a4\u30b8\u30e3\u30f3\u6642\u9593",
               "AT",
            };
        final String[] Mawson = new String[] {
               "\u30e2\u30fc\u30bd\u30f3\u57fa\u5730\u6642\u9593",
               "MT",
               "Mawson Summer Time",
               "MST",
               "Mawson Time",
               "MT",
            };
        final String[] Davis = new String[] {
               "\u30c7\u30fc\u30d3\u30b9\u57fa\u5730\u6642\u9593",
               "DT",
               "Davis Summer Time",
               "DST",
               "Davis Time",
               "DT",
            };
        final String[] Cuba = new String[] {
               "\u30ad\u30e5\u30fc\u30d0\u6a19\u6e96\u6642",
               "CST",
               "\u30ad\u30e5\u30fc\u30d0\u590f\u6642\u9593",
               "CDT",
               "\u30ad\u30e5\u30fc\u30d0\u6642\u9593",
               "CT",
            };
        final String[] Africa_Western = new String[] {
               "\u897f\u30a2\u30d5\u30ea\u30ab\u6a19\u6e96\u6642",
               "WAST",
               "\u897f\u30a2\u30d5\u30ea\u30ab\u590f\u6642\u9593",
               "WAST",
               "\u897f\u30a2\u30d5\u30ea\u30ab\u6642\u9593",
               "WAT",
            };
        final String[] GMT = new String[] {
               "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642",
               "GMT",
               "Greenwich Summer Time",
               "GST",
               "Greenwich Time",
               "GT",
            };
        final String[] French_Southern = new String[] {
               "\u30d5\u30e9\u30f3\u30b9\u9818\u5357\u65b9\u30fb\u5357\u6975\u5730\u57df\u6a19\u6e96\u6642",
               "FSAT",
               "French Southern and Antarctic Summer Time",
               "FSAST",
               "French Southern and Antarctic Time",
               "FSAT",
            };
        final String[] South_Georgia = new String[] {
               "\u30b5\u30a6\u30b9\u30b8\u30e7\u30fc\u30b8\u30a2\u6a19\u6e96\u6642",
               "SGT",
               "South Georgia Summer Time",
               "SGST",
               "South Georgia Time",
               "SGT",
            };
        final String[] Volgograd = new String[] {
               "\u30dc\u30eb\u30b4\u30b0\u30e9\u30fc\u30c9\u6a19\u6e96\u6642",
               "VST",
               "\u30dc\u30eb\u30b4\u30b0\u30e9\u30fc\u30c9\u590f\u6642\u9593",
               "VST",
               "\u30dc\u30eb\u30b4\u30b0\u30e9\u30fc\u30c9\u6642\u9593",
               "VT",
            };
        final String[] Brunei = new String[] {
               "\u30d6\u30eb\u30cd\u30a4\u30fb\u30c0\u30eb\u30b5\u30e9\u30fc\u30e0\u6a19\u6e96\u6642",
               "BDT",
               "Brunei Darussalam Summer Time",
               "BDST",
               "Brunei Darussalam Time",
               "BDT",
            };
        final String[] Iran = new String[] {
               "\u30a4\u30e9\u30f3\u6a19\u6e96\u6642",
               "IST",
               "\u30a4\u30e9\u30f3\u590f\u6642\u9593",
               "IDT",
               "\u30a4\u30e9\u30f3\u6642\u9593",
               "IT",
            };
        final String[] DumontDUrville = new String[] {
               "\u30c7\u30e5\u30e2\u30f3\u30fb\u30c7\u30e5\u30eb\u30f4\u30a3\u30eb\u57fa\u5730\u6642\u9593",
               "DT",
               "Dumont-d\u2019Urville Summer Time",
               "DST",
               "Dumont-d\u2019Urville Time",
               "DT",
            };
        final String[] Bangladesh = new String[] {
               "\u30d0\u30f3\u30b0\u30e9\u30c7\u30b7\u30e5\u6a19\u6e96\u6642",
               "BST",
               "\u30d0\u30f3\u30b0\u30e9\u30c7\u30b7\u30e5\u590f\u6642\u9593",
               "BST",
               "\u30d0\u30f3\u30b0\u30e9\u30c7\u30b7\u30e5\u6642\u9593",
               "BT",
            };
        final String[] Peru = new String[] {
               "\u30da\u30eb\u30fc\u6a19\u6e96\u6642",
               "PST",
               "\u30da\u30eb\u30fc\u590f\u6642\u9593",
               "PST",
               "\u30da\u30eb\u30fc\u6642\u9593",
               "PT",
            };
        final String[] Greenland_Western = new String[] {
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u897f\u90e8\u6a19\u6e96\u6642",
               "WGST",
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u897f\u90e8\u590f\u6642\u9593",
               "WGST",
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u897f\u90e8\u6642\u9593",
               "WGT",
            };
        final String[] Ecuador = new String[] {
               "\u30a8\u30af\u30a2\u30c9\u30eb\u6a19\u6e96\u6642",
               "ET",
               "Ecuador Summer Time",
               "EST",
               "Ecuador Time",
               "ET",
            };
        final String[] Greenland_Eastern = new String[] {
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u6771\u90e8\u6a19\u6e96\u6642",
               "EGST",
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u6771\u90e8\u590f\u6642\u9593",
               "EGST",
               "\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9\u6771\u90e8\u6642\u9593",
               "EGT",
            };
        final String[] Gulf = new String[] {
               "\u6e7e\u5cb8\u6642\u9593",
               "GST",
               "Gulf Daylight Time",
               "GDT",
               "Gulf Time",
               "GT",
            };
        final String[] Indonesia_Eastern = new String[] {
               "\u30a4\u30f3\u30c9\u30cd\u30b7\u30a2\u6771\u90e8\u6642\u9593",
               "EIT",
               "Eastern Indonesia Summer Time",
               "EIST",
               "Eastern Indonesia Time",
               "EIT",
            };
        final String[] Korea = new String[] {
               "\u97d3\u56fd\u6a19\u6e96\u6642",
               "KST",
               "\u97d3\u56fd\u590f\u6642\u9593",
               "KDT",
               "\u97d3\u56fd\u6642\u9593",
               "KT",
            };
        final String[] Australia_Western = new String[] {
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u897f\u90e8\u6a19\u6e96\u6642",
               "AWST",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u897f\u90e8\u590f\u6642\u9593",
               "AWDT",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u897f\u90e8\u6642\u9593",
               "WAT",
            };
        final String[] Indonesia_Western = new String[] {
               "\u30a4\u30f3\u30c9\u30cd\u30b7\u30a2\u897f\u90e8\u6642\u9593",
               "WIT",
               "Western Indonesia Summer Time",
               "WIST",
               "Western Indonesia Time",
               "WIT",
            };
        final String[] Australia_Eastern = new String[] {
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u6771\u90e8\u6a19\u6e96\u6642",
               "AEST",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u6771\u90e8\u590f\u6642\u9593",
               "AEDT",
               "\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u6771\u90e8\u6642\u9593",
               "EAT",
            };
        final String[] French_Guiana = new String[] {
               "\u4ecf\u9818\u30ae\u30a2\u30ca\u6a19\u6e96\u6642",
               "FGT",
               "French Guiana Summer Time",
               "FGST",
               "French Guiana Time",
               "FGT",
            };
        final String[] Colombia = new String[] {
               "\u30b3\u30ed\u30f3\u30d3\u30a2\u6a19\u6e96\u6642",
               "CST",
               "\u30b3\u30ed\u30f3\u30d3\u30a2\u590f\u6642\u9593",
               "CST",
               "\u30b3\u30ed\u30f3\u30d3\u30a2\u6642\u9593",
               "CT",
            };
        final String[] Chile = new String[] {
               "\u30c1\u30ea\u6a19\u6e96\u6642",
               "CST",
               "\u30c1\u30ea\u590f\u6642\u9593",
               "CST",
               "\u30c1\u30ea\u6642\u9593",
               "CT",
            };
        final String[] America_Mountain = new String[] {
               "\u30a2\u30e1\u30ea\u30ab\u5c71\u5730\u6a19\u6e96\u6642",
               "MST",
               "\u30a2\u30e1\u30ea\u30ab\u5c71\u5730\u590f\u6642\u9593",
               "MDT",
               "\u30a2\u30e1\u30ea\u30ab\u5c71\u5730\u6642\u9593",
               "MT",
            };
        final String[] Arabian = new String[] {
               "\u30a2\u30e9\u30d6\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30e9\u30d6\u590f\u6642\u9593",
               "ADT",
               "\u30a2\u30e9\u30d6\u6642\u9593",
               "AT",
            };
        final String[] Alaska = new String[] {
               "\u30a2\u30e9\u30b9\u30ab\u6a19\u6e96\u6642",
               "AKST",
               "\u30a2\u30e9\u30b9\u30ab\u590f\u6642\u9593",
               "AKDT",
               "\u30a2\u30e9\u30b9\u30ab\u6642\u9593",
               "AKT",
            };
        final String[] Vladivostok = new String[] {
               "\u30a6\u30e9\u30b8\u30aa\u30b9\u30c8\u30af\u6a19\u6e96\u6642",
               "VST",
               "\u30a6\u30e9\u30b8\u30aa\u30b9\u30c8\u30af\u590f\u6642\u9593",
               "VST",
               "\u30a6\u30e9\u30b8\u30aa\u30b9\u30c8\u30af\u6642\u9593",
               "VT",
            };
        final String[] Chamorro = new String[] {
               "\u30c1\u30e3\u30e2\u30ed\u6642\u9593",
               "CST",
               "Chamorro Daylight Time",
               "CDT",
               "Chamorro Time",
               "CT",
            };
        final String[] Irkutsk = new String[] {
               "\u30a4\u30eb\u30af\u30fc\u30c4\u30af\u6a19\u6e96\u6642",
               "IST",
               "\u30a4\u30eb\u30af\u30fc\u30c4\u30af\u590f\u6642\u9593",
               "IST",
               "\u30a4\u30eb\u30af\u30fc\u30c4\u30af\u6642\u9593",
               "IT",
            };
        final String[] Georgia = new String[] {
               "\u30b0\u30eb\u30b8\u30a2\u6a19\u6e96\u6642",
               "GST",
               "\u30b0\u30eb\u30b8\u30a2\u590f\u6642\u9593",
               "GST",
               "\u30b0\u30eb\u30b8\u30a2\u6642\u9593",
               "GT",
            };
        final String[] Noronha = new String[] {
               "\u30d5\u30a7\u30eb\u30ca\u30f3\u30c9 \u30c9 \u30ce\u30ed\u30fc\u30cb\u30e3\u6a19\u6e96\u6642",
               "FNST",
               "\u30d5\u30a7\u30eb\u30ca\u30f3\u30c9 \u30c9 \u30ce\u30ed\u30fc\u30cb\u30e3\u590f\u6642\u9593",
               "FNST",
               "\u30d5\u30a7\u30eb\u30ca\u30f3\u30c9 \u30c9 \u30ce\u30ed\u30fc\u30cb\u30e3\u6642\u9593",
               "FNT",
            };
        final String[] Choibalsan = new String[] {
               "\u30c1\u30e7\u30a4\u30d0\u30eb\u30b5\u30f3\u6a19\u6e96\u6642",
               "CST",
               "\u30c1\u30e7\u30a4\u30d0\u30eb\u30b5\u30f3\u590f\u6642\u9593",
               "CST",
               "\u30c1\u30e7\u30a4\u30d0\u30eb\u30b5\u30f3\u6642\u9593",
               "CT",
            };
        final String[] Brasilia = new String[] {
               "\u30d6\u30e9\u30b8\u30ea\u30a2\u6a19\u6e96\u6642",
               "BST",
               "\u30d6\u30e9\u30b8\u30ea\u30a2\u590f\u6642\u9593",
               "BST",
               "\u30d6\u30e9\u30b8\u30ea\u30a2\u6642\u9593",
               "BT",
            };
        final String[] China = new String[] {
               "\u4e2d\u56fd\u6a19\u6e96\u6642",
               "CST",
               "\u4e2d\u56fd\u590f\u6642\u9593",
               "CDT",
               "\u4e2d\u56fd\u6642\u9593",
               "CT",
            };
        final String[] Armenia = new String[] {
               "\u30a2\u30eb\u30e1\u30cb\u30a2\u6a19\u6e96\u6642",
               "AST",
               "\u30a2\u30eb\u30e1\u30cb\u30a2\u590f\u6642\u9593",
               "AST",
               "\u30a2\u30eb\u30e1\u30cb\u30a2\u6642\u9593",
               "AT",
            };
        final String[] India = new String[] {
               "\u30a4\u30f3\u30c9\u6a19\u6e96\u6642",
               "IST",
               "India Daylight Time",
               "IDT",
               "India Time",
               "IT",
            };
        final Object[][] data = new Object[][] {
            { "America/Los_Angeles", America_Pacific },
            { "America/Denver", America_Mountain },
            { "America/Phoenix", America_Mountain },
            { "America/Chicago", America_Central },
            { "America/New_York", America_Eastern },
            { "America/Indianapolis", America_Eastern },
            { "Pacific/Honolulu", Hawaii_Aleutian },
            { "America/Anchorage", Alaska },
            { "America/Halifax", Atlantic },
            { "America/Sitka", Alaska },
            { "America/St_Johns", Newfoundland },
            { "Europe/Paris", Europe_Central },
            { "GMT", GMT },
            { "Africa/Casablanca", Europe_Western },
            { "Asia/Jerusalem", Israel },
            { "Asia/Tokyo", Japan },
            { "Europe/Bucharest", Europe_Eastern },
            { "Asia/Shanghai", China },
            { "Asia/Aden", Arabian },
            { "America/Cuiaba", Amazon },
            { "Africa/Nairobi", Africa_Eastern },
            { "America/Marigot", Atlantic },
            { "Asia/Aqtau", Kazakhstan_Western },
            { "America/El_Salvador", America_Central },
            { "Asia/Pontianak", Indonesia_Western },
            { "Africa/Cairo", Europe_Eastern },
            { "Africa/Mbabane", Africa_Southern },
            { "America/Guatemala", America_Central },
            { "Australia/Hobart", Australia_Eastern },
            { "Europe/London", GMT },
            { "America/Belize", America_Central },
            { "America/Panama", America_Eastern },
            { "America/Managua", America_Central },
            { "America/Indiana/Petersburg", America_Eastern },
            { "Asia/Yerevan", Armenia },
            { "Europe/Brussels", Europe_Central },
            { "Europe/Warsaw", Europe_Central },
            { "Asia/Kashgar", China },
            { "Europe/Jersey", GMT },
            { "America/Tegucigalpa", America_Central },
            { "Europe/Istanbul", Europe_Eastern },
            { "America/Eirunepe", Amazon },
            { "Europe/Luxembourg", Europe_Central },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Atlantic/St_Helena", GMT },
            { "Europe/Guernsey", GMT },
            { "America/Grand_Turk", America_Eastern },
            { "Asia/Phnom_Penh", Indochina },
            { "Africa/Kigali", Africa_Central },
            { "Asia/Almaty", Kazakhstan_Eastern },
            { "Asia/Dubai", Gulf },
            { "Europe/Isle_of_Man", GMT },
            { "America/Araguaina", Brasilia },
            { "Asia/Novosibirsk", Novosibirsk },
            { "America/Argentina/Salta", Argentina },
            { "Africa/Tunis", Europe_Central },
            { "Africa/Tripoli", Europe_Eastern },
            { "Africa/Banjul", GMT },
            { "Indian/Comoro", Africa_Eastern },
            { "Antarctica/Syowa", Syowa },
            { "Indian/Reunion", Reunion },
            { "Europe/Kaliningrad", GMT },
            { "America/Montevideo", Uruguay },
            { "Africa/Windhoek", Africa_Western },
            { "Africa/Mogadishu", Africa_Eastern },
            { "Australia/Perth", Australia_Western },
            { "Antarctica/Davis", Davis },
            { "America/Manaus", Amazon },
            { "Africa/Freetown", GMT },
            { "Asia/Macau", China },
            { "Europe/Malta", Europe_Central },
            { "Africa/Asmera", Africa_Eastern },
            { "America/Argentina/Rio_Gallegos", Argentina },
            { "Africa/Malabo", Africa_Western },
            { "Europe/Skopje", Europe_Central },
            { "America/Catamarca", Argentina },
            { "America/Godthab", Greenland_Western },
            { "Europe/Sarajevo", Europe_Central },
            { "Africa/Lagos", Africa_Western },
            { "America/Cordoba", Argentina },
            { "Europe/Rome", Europe_Central },
            { "Indian/Mauritius", Mauritius },
            { "America/Regina", America_Central },
            { "America/Dawson_Creek", America_Mountain },
            { "Africa/Algiers", Europe_Central },
            { "Europe/Mariehamn", Europe_Eastern },
            { "America/St_Thomas", Atlantic },
            { "Europe/Zurich", Europe_Central },
            { "America/Anguilla", Atlantic },
            { "Asia/Dili", East_Timor },
            { "Africa/Bamako", GMT },
            { "Europe/Gibraltar", Europe_Central },
            { "Africa/Conakry", GMT },
            { "Africa/Lubumbashi", Africa_Central },
            { "America/Havana", Cuba },
            { "Asia/Choibalsan", Choibalsan },
            { "Asia/Omsk", Omsk },
            { "Europe/Vaduz", Europe_Central },
            { "Asia/Dhaka", Bangladesh },
            { "America/Barbados", Atlantic },
            { "Atlantic/Cape_Verde", Cape_Verde },
            { "Asia/Yekaterinburg", Yekaterinburg },
            { "America/Louisville", America_Eastern },
            { "Pacific/Johnston", Hawaii_Aleutian },
            { "Europe/Ljubljana", Europe_Central },
            { "America/Sao_Paulo", Brasilia },
            { "Asia/Jayapura", Indonesia_Eastern },
            { "America/Curacao", Atlantic },
            { "America/Guyana", Guyana },
            { "America/Guayaquil", Ecuador },
            { "America/Martinique", Atlantic },
            { "Europe/Berlin", Europe_Central },
            { "Europe/Moscow", Moscow },
            { "Europe/Chisinau", Europe_Eastern },
            { "America/Puerto_Rico", Atlantic },
            { "America/Rankin_Inlet", America_Central },
            { "Europe/Stockholm", Europe_Central },
            { "Europe/Budapest", Europe_Central },
            { "Australia/Eucla", Australia_CentralWestern },
            { "Europe/Zagreb", Europe_Central },
            { "America/Port_of_Spain", Atlantic },
            { "Europe/Helsinki", Europe_Eastern },
            { "Asia/Beirut", Europe_Eastern },
            { "Africa/Sao_Tome", GMT },
            { "Indian/Chagos", Indian_Ocean },
            { "America/Cayenne", French_Guiana },
            { "Asia/Yakutsk", Yakutsk },
            { "Africa/Ndjamena", Africa_Western },
            { "America/Rainy_River", America_Central },
            { "Indian/Maldives", Maldives },
            { "Asia/Oral", Kazakhstan_Western },
            { "America/Yellowknife", America_Mountain },
            { "America/Juneau", Alaska },
            { "America/Indiana/Vevay", America_Eastern },
            { "Asia/Jakarta", Indonesia_Western },
            { "Africa/Ceuta", Europe_Central },
            { "America/Recife", Brasilia },
            { "America/Buenos_Aires", Argentina },
            { "America/Noronha", Noronha },
            { "America/Swift_Current", America_Central },
            { "Australia/Adelaide", Australia_Central },
            { "America/Metlakatla", America_Pacific },
            { "Africa/Djibouti", Africa_Eastern },
            { "America/Paramaribo", Suriname },
            { "Europe/Simferopol", Europe_Eastern },
            { "Europe/Sofia", Europe_Eastern },
            { "Africa/Nouakchott", GMT },
            { "Europe/Prague", Europe_Central },
            { "America/Indiana/Vincennes", America_Eastern },
            { "Antarctica/Mawson", Mawson },
            { "America/Kralendijk", Atlantic },
            { "Europe/Samara", Moscow },
            { "Indian/Christmas", Christmas },
            { "America/Antigua", Atlantic },
            { "America/Inuvik", America_Mountain },
            { "America/Iqaluit", America_Eastern },
            { "Antarctica/Macquarie", Macquarie },
            { "America/Moncton", Atlantic },
            { "Africa/Gaborone", Africa_Central },
            { "Asia/Pyongyang", Korea },
            { "America/St_Vincent", Atlantic },
            { "Asia/Gaza", Europe_Eastern },
            { "PST8PDT", America_Pacific },
            { "Atlantic/Faeroe", Europe_Western },
            { "Asia/Qyzylorda", Kazakhstan_Eastern },
            { "America/Yakutat", Alaska },
            { "Antarctica/Casey", Australia_Western },
            { "Europe/Copenhagen", Europe_Central },
            { "Atlantic/Azores", Azores },
            { "Europe/Vienna", Europe_Central },
            { "America/Mazatlan", America_Mountain },
            { "Europe/Tirane", Europe_Central },
            { "Australia/Broken_Hill", Australia_Central },
            { "Europe/Riga", Europe_Eastern },
            { "America/Dominica", Atlantic },
            { "Africa/Abidjan", GMT },
            { "America/Mendoza", Argentina },
            { "America/Santarem", Brasilia },
            { "America/Asuncion", Paraguay },
            { "America/Boise", America_Mountain },
            { "Australia/Currie", Australia_Eastern },
            { "EST5EDT", America_Eastern },
            { "Pacific/Guam", Chamorro },
            { "Atlantic/Bermuda", Atlantic },
            { "America/Costa_Rica", America_Central },
            { "America/Dawson", America_Pacific },
            { "Asia/Chongqing", China },
            { "Europe/Amsterdam", Europe_Central },
            { "America/Indiana/Knox", America_Central },
            { "America/North_Dakota/Beulah", America_Central },
            { "Africa/Accra", GMT },
            { "America/Maceio", Brasilia },
            { "Australia/Lord_Howe", Lord_Howe },
            { "Europe/Dublin", GMT },
            { "MST7MDT", America_Mountain },
            { "America/Monterrey", America_Central },
            { "America/Nassau", America_Eastern },
            { "America/Jamaica", America_Eastern },
            { "Atlantic/Stanley", Falkland },
            { "Indian/Mahe", Seychelles },
            { "Asia/Aqtobe", Kazakhstan_Western },
            { "Asia/Vladivostok", Vladivostok },
            { "Africa/Libreville", Africa_Western },
            { "Africa/Maputo", Africa_Central },
            { "America/Kentucky/Monticello", America_Eastern },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Ouagadougou", GMT },
            { "America/Coral_Harbour", America_Eastern },
            { "America/Aruba", Atlantic },
            { "America/North_Dakota/Center", America_Central },
            { "America/Cayman", America_Eastern },
            { "Asia/Ulaanbaatar", Mongolia },
            { "Asia/Baghdad", Arabian },
            { "Europe/San_Marino", Europe_Central },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Tijuana", America_Pacific },
            { "Pacific/Saipan", Chamorro },
            { "Africa/Douala", Africa_Western },
            { "America/Chihuahua", America_Mountain },
            { "America/Ojinaga", America_Mountain },
            { "Asia/Hovd", Hovd },
            { "Antarctica/Rothera", Rothera },
            { "Asia/Damascus", Europe_Eastern },
            { "America/Argentina/San_Luis", Argentina_Western },
            { "America/Santiago", Chile },
            { "Asia/Baku", Azerbaijan },
            { "America/Argentina/Ushuaia", Argentina },
            { "Atlantic/Reykjavik", GMT },
            { "Africa/Brazzaville", Africa_Western },
            { "Africa/Porto-Novo", Africa_Western },
            { "America/La_Paz", Bolivia },
            { "Antarctica/DumontDUrville", DumontDUrville },
            { "Asia/Bangkok", Indochina },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "Atlantic/Madeira", Europe_Western },
            { "Antarctica/Palmer", Chile },
            { "America/Thunder_Bay", America_Eastern },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "America/Indiana/Marengo", America_Eastern },
            { "America/Creston", America_Mountain },
            { "America/Mexico_City", America_Central },
            { "Antarctica/Vostok", Vostok },
            { "Europe/Andorra", Europe_Central },
            { "Asia/Vientiane", Indochina },
            { "America/Matamoros", America_Central },
            { "America/Blanc-Sablon", Atlantic },
            { "Asia/Riyadh", Arabian },
            { "Atlantic/South_Georgia", South_Georgia },
            { "Europe/Lisbon", Europe_Western },
            { "Asia/Harbin", China },
            { "Europe/Oslo", Europe_Central },
            { "Asia/Novokuznetsk", Novosibirsk },
            { "CST6CDT", America_Central },
            { "Atlantic/Canary", Europe_Western },
            { "Asia/Kuwait", Arabian },
            { "Africa/Lome", GMT },
            { "America/Bogota", Colombia },
            { "America/Menominee", America_Central },
            { "America/Adak", Hawaii_Aleutian },
            { "Pacific/Norfolk", Norfolk },
            { "America/Resolute", America_Central },
            { "Africa/Kampala", Africa_Eastern },
            { "Asia/Krasnoyarsk", Krasnoyarsk },
            { "America/Edmonton", America_Mountain },
            { "Europe/Podgorica", Europe_Central },
            { "Africa/Bujumbura", Africa_Central },
            { "America/Santo_Domingo", Atlantic },
            { "Europe/Minsk", Europe_Eastern },
            { "America/Glace_Bay", Atlantic },
            { "Asia/Qatar", Arabian },
            { "Europe/Kiev", Europe_Eastern },
            { "Asia/Magadan", Magadan },
            { "America/Port-au-Prince", America_Eastern },
            { "America/St_Barthelemy", Atlantic },
            { "Africa/Luanda", Africa_Western },
            { "America/Nipigon", America_Eastern },
            { "Asia/Muscat", Gulf },
            { "Asia/Bahrain", Arabian },
            { "Europe/Vilnius", Europe_Eastern },
            { "America/Fortaleza", Brasilia },
            { "America/Hermosillo", America_Mountain },
            { "America/Cancun", America_Central },
            { "Africa/Maseru", Africa_Southern },
            { "Africa/Kinshasa", Africa_Western },
            { "Asia/Seoul", Korea },
            { "Australia/Sydney", Australia_Eastern },
            { "America/Lima", Peru },
            { "America/St_Lucia", Atlantic },
            { "Europe/Madrid", Europe_Central },
            { "America/Bahia_Banderas", America_Central },
            { "America/Montserrat", Atlantic },
            { "Asia/Brunei", Brunei },
            { "America/Santa_Isabel", America_Pacific },
            { "America/Cambridge_Bay", America_Mountain },
            { "Asia/Colombo", India },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Australia/Brisbane", Australia_Eastern },
            { "Indian/Mayotte", Africa_Eastern },
            { "Asia/Urumqi", China },
            { "Europe/Volgograd", Volgograd },
            { "America/Lower_Princes", Atlantic },
            { "America/Vancouver", America_Pacific },
            { "Africa/Blantyre", Africa_Central },
            { "America/Rio_Branco", Amazon },
            { "America/Danmarkshavn", GMT },
            { "America/Detroit", America_Eastern },
            { "America/Thule", Atlantic },
            { "Africa/Lusaka", Africa_Central },
            { "Asia/Hong_Kong", Hong_Kong },
            { "America/Argentina/La_Rioja", Argentina },
            { "Africa/Dakar", GMT },
            { "America/Tortola", Atlantic },
            { "America/Porto_Velho", Amazon },
            { "Asia/Sakhalin", Sakhalin },
            { "America/Scoresbysund", Greenland_Eastern },
            { "Asia/Kamchatka", Magadan },
            { "Africa/Harare", Africa_Central },
            { "America/Nome", Alaska },
            { "Europe/Tallinn", Europe_Eastern },
            { "Africa/Khartoum", Africa_Eastern },
            { "Africa/Johannesburg", Africa_Southern },
            { "Africa/Bangui", Africa_Western },
            { "Europe/Belgrade", Europe_Central },
            { "Africa/Bissau", GMT },
            { "Asia/Tehran", Iran },
            { "Africa/Juba", Africa_Eastern },
            { "America/Campo_Grande", Amazon },
            { "America/Belem", Brasilia },
            { "Asia/Saigon", Indochina },
            { "America/Jujuy", Argentina },
            { "America/Bahia", Brasilia },
            { "America/Goose_Bay", Atlantic },
            { "America/Pangnirtung", America_Eastern },
            { "Africa/Niamey", Africa_Western },
            { "America/Whitehorse", America_Pacific },
            { "Asia/Tbilisi", Georgia },
            { "America/Montreal", America_Eastern },
            { "Asia/Makassar", Indonesia_Central },
            { "America/Argentina/San_Juan", Argentina },
            { "Asia/Nicosia", Europe_Eastern },
            { "America/Indiana/Winamac", America_Eastern },
            { "America/Boa_Vista", Amazon },
            { "America/Grenada", Atlantic },
            { "Australia/Darwin", Australia_Central },
            { "Asia/Thimphu", Bhutan },
            { "Europe/Bratislava", Europe_Central },
            { "Asia/Calcutta", India },
            { "America/Argentina/Tucuman", Argentina },
            { "Asia/Kabul", Afghanistan },
            { "Indian/Cocos", Cocos },
            { "America/Merida", America_Central },
            { "America/St_Kitts", Atlantic },
            { "Arctic/Longyearbyen", Europe_Central },
            { "America/Caracas", Venezuela },
            { "America/Guadeloupe", Atlantic },
            { "Asia/Hebron", Europe_Eastern },
            { "Indian/Kerguelen", French_Southern },
            { "Africa/Monrovia", GMT },
            { "America/North_Dakota/New_Salem", America_Central },
            { "Asia/Anadyr", Magadan },
            { "Australia/Melbourne", Australia_Eastern },
            { "Asia/Irkutsk", Irkutsk },
            { "America/Shiprock", America_Mountain },
            { "America/Winnipeg", America_Central },
            { "Europe/Vatican", Europe_Central },
            { "Asia/Amman", Europe_Eastern },
            { "America/Toronto", America_Eastern },
            { "Australia/Lindeman", Australia_Eastern },
            { "Europe/Athens", Europe_Eastern },
            { "Europe/Monaco", Europe_Central },
        };
        return data;
    }
}
