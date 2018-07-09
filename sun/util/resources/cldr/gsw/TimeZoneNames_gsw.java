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

package sun.util.resources.cldr.gsw;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_gsw extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Africa_Central = new String[] {
               "Zentralafrikanischi Ziit",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] Moscow = new String[] {
               "Moskauer Schtandardziit",
               "MST",
               "Moskauer Summerziit",
               "MST",
               "Moskauer Ziit",
               "MT",
            };
        final String[] Europe_Central = new String[] {
               "Mitteleurop\u00e4ischi Schtandardziit",
               "MEZ",
               "Mitteleurop\u00e4ischi Summerziit",
               "MESZ",
               "Mitteleurop\u00e4ischi Ziit",
               "MEZ",
            };
        final String[] Africa_Southern = new String[] {
               "S\u00fc\u00fcdafrikanischi ziit",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] Africa_Eastern = new String[] {
               "Oschtafrikanischi Ziit",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final String[] Alaska = new String[] {
               "Alaska-Schtandardziit",
               "AKST",
               "Alaska-Summerziit",
               "AKDT",
               "Alaska-Ziit",
               "AKT",
            };
        final String[] Europe_Western = new String[] {
               "Weschteurop\u00e4ischi Schtandardziit",
               "WEZ",
               "Weschteurop\u00e4ischi Summerziit",
               "WESZ",
               "Weschteurop\u00e4ischi Ziit",
               "WEZ",
            };
        final String[] Europe_Eastern = new String[] {
               "Oschteurop\u00e4ischi Schtandardziit",
               "OEZ",
               "Oschteurop\u00e4ischi Summerziit",
               "OESZ",
               "Oschteurop\u00e4ischi Ziit",
               "OEZ",
            };
        final String[] Afghanistan = new String[] {
               "Afghanischtan-Ziit",
               "AT",
               "Afghanistan Summer Time",
               "AST",
               "Afghanistan Time",
               "AT",
            };
        final String[] Africa_Western = new String[] {
               "Weschtafrikanischi Schtandardziit",
               "WAST",
               "Weschtafrikanischi Summerziit",
               "WAST",
               "Weschtafrikanischi Ziit",
               "WAT",
            };
        final String[] Amazon = new String[] {
               "Amazonas-Schtandardziit",
               "AST",
               "Amazonas-Summerziit",
               "AST",
               "Amazonas-Ziit",
               "AT",
            };
        final Object[][] data = new Object[][] {
            { "America/Anchorage", Alaska },
            { "America/Sitka", Alaska },
            { "Europe/Paris", Europe_Central },
            { "Africa/Casablanca", Europe_Western },
            { "Europe/Bucharest", Europe_Eastern },
            { "America/Cuiaba", Amazon },
            { "Europe/Ljubljana", Europe_Central },
            { "Africa/Nairobi", Africa_Eastern },
            { "Africa/Libreville", Africa_Western },
            { "Africa/Lusaka", Africa_Central },
            { "Africa/Maputo", Africa_Central },
            { "Europe/Berlin", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Cairo", Europe_Eastern },
            { "Europe/Moscow", Moscow },
            { "Africa/Mbabane", Africa_Southern },
            { "Europe/Chisinau", Europe_Eastern },
            { "Europe/Stockholm", Europe_Central },
            { "Europe/Budapest", Europe_Central },
            { "America/Porto_Velho", Amazon },
            { "Europe/San_Marino", Europe_Central },
            { "Europe/Zagreb", Europe_Central },
            { "Europe/Helsinki", Europe_Eastern },
            { "Asia/Beirut", Europe_Eastern },
            { "Europe/Brussels", Europe_Central },
            { "Africa/Harare", Africa_Central },
            { "Africa/Douala", Africa_Western },
            { "America/Nome", Alaska },
            { "Europe/Warsaw", Europe_Central },
            { "Europe/Tallinn", Europe_Eastern },
            { "Africa/Khartoum", Africa_Eastern },
            { "Africa/Johannesburg", Africa_Southern },
            { "Europe/Istanbul", Europe_Eastern },
            { "Africa/Ndjamena", Africa_Western },
            { "Asia/Damascus", Europe_Eastern },
            { "America/Eirunepe", Amazon },
            { "Europe/Luxembourg", Europe_Central },
            { "Africa/Bangui", Africa_Western },
            { "Europe/Belgrade", Europe_Central },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Africa/Brazzaville", Africa_Western },
            { "America/Juneau", Alaska },
            { "Africa/Porto-Novo", Africa_Western },
            { "Africa/Juba", Africa_Eastern },
            { "America/Campo_Grande", Amazon },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "Atlantic/Madeira", Europe_Western },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "Africa/Djibouti", Africa_Eastern },
            { "Africa/Kigali", Africa_Central },
            { "Europe/Simferopol", Europe_Eastern },
            { "Europe/Sofia", Europe_Eastern },
            { "Africa/Niamey", Africa_Western },
            { "Europe/Prague", Europe_Central },
            { "Europe/Samara", Moscow },
            { "Africa/Tunis", Europe_Central },
            { "Europe/Andorra", Europe_Central },
            { "Africa/Tripoli", Europe_Eastern },
            { "Indian/Comoro", Africa_Eastern },
            { "Asia/Nicosia", Europe_Eastern },
            { "Africa/Gaborone", Africa_Central },
            { "Africa/Windhoek", Africa_Western },
            { "Europe/Lisbon", Europe_Western },
            { "America/Boa_Vista", Amazon },
            { "Europe/Oslo", Europe_Central },
            { "Africa/Mogadishu", Africa_Eastern },
            { "Asia/Gaza", Europe_Eastern },
            { "Atlantic/Faeroe", Europe_Western },
            { "Atlantic/Canary", Europe_Western },
            { "Europe/Bratislava", Europe_Central },
            { "America/Manaus", Amazon },
            { "America/Yakutat", Alaska },
            { "Asia/Kabul", Afghanistan },
            { "Europe/Copenhagen", Europe_Central },
            { "Europe/Malta", Europe_Central },
            { "Europe/Vienna", Europe_Central },
            { "Africa/Asmera", Africa_Eastern },
            { "Africa/Kampala", Africa_Eastern },
            { "Africa/Malabo", Africa_Western },
            { "Europe/Skopje", Europe_Central },
            { "Europe/Podgorica", Europe_Central },
            { "Europe/Sarajevo", Europe_Central },
            { "Europe/Tirane", Europe_Central },
            { "Africa/Bujumbura", Africa_Central },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Europe/Minsk", Europe_Eastern },
            { "Europe/Riga", Europe_Eastern },
            { "Africa/Lagos", Africa_Western },
            { "Europe/Kiev", Europe_Eastern },
            { "Europe/Rome", Europe_Central },
            { "Asia/Hebron", Europe_Eastern },
            { "Africa/Luanda", Africa_Western },
            { "Africa/Algiers", Europe_Central },
            { "Europe/Mariehamn", Europe_Eastern },
            { "Europe/Zurich", Europe_Central },
            { "Europe/Vilnius", Europe_Eastern },
            { "Europe/Amsterdam", Europe_Central },
            { "Europe/Vatican", Europe_Central },
            { "Africa/Maseru", Africa_Southern },
            { "Europe/Gibraltar", Europe_Central },
            { "Africa/Kinshasa", Africa_Western },
            { "Asia/Amman", Europe_Eastern },
            { "Africa/Lubumbashi", Africa_Central },
            { "Europe/Madrid", Europe_Central },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Europe/Vaduz", Europe_Central },
            { "Indian/Mayotte", Africa_Eastern },
            { "Europe/Athens", Europe_Eastern },
            { "Africa/Blantyre", Africa_Central },
            { "America/Rio_Branco", Amazon },
            { "Europe/Monaco", Europe_Central },
        };
        return data;
    }
}
