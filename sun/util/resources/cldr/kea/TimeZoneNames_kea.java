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

package sun.util.resources.cldr.kea;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_kea extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Africa_Central = new String[] {
               "Ora di Afrika Sentral",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "Ora Padr\u00e3u di Australia Sentru-Osidental",
               "ACWST",
               "Ora di Ver\u00e3u di Australia Sentru-Osidental",
               "ACWDT",
               "Ora di Autralia Sentru-Osidental",
               "ACWT",
            };
        final String[] Europe_Central = new String[] {
               "Ora Padr\u00e3u di Europa Sentral",
               "CEST",
               "Ora di Ver\u00e3u di Europa Sentral",
               "CEST",
               "Ora di Europa Sentral",
               "CET",
            };
        final String[] Africa_Southern = new String[] {
               "Ora di Sul di Afrika",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] Australia_Western = new String[] {
               "Ora Padr\u00e3u di Australia Osidental",
               "AWST",
               "Ora di Ver\u00e3u di Australia Osidental",
               "AWDT",
               "Ora di Australia Osidental",
               "WAT",
            };
        final String[] Australia_Central = new String[] {
               "Ora Padr\u00e3u di Australia Sentral",
               "ACST",
               "Ora di Ver\u00e3u di Australia Sentral",
               "ACDT",
               "Ora di Australia Sentral",
               "CAT",
            };
        final String[] Australia_Eastern = new String[] {
               "Ora Padr\u00e3u di Australia Oriental",
               "AEST",
               "Ora di Ver\u00e3u di Australia Oriental",
               "AEDT",
               "Ora di Australia Oriental",
               "EAT",
            };
        final String[] Africa_Eastern = new String[] {
               "Ora di Afrika Oriental",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final String[] Europe_Western = new String[] {
               "Ora Padr\u00e3u di Europa Osidental",
               "WEST",
               "Ora di Ver\u00e3u di Europa Osidental",
               "WEST",
               "Ora di Europa Osidental",
               "WET",
            };
        final String[] Europe_Eastern = new String[] {
               "Ora Padr\u00e3u di Europa Oriental",
               "EEST",
               "Ora di Ver\u00e3u di Europa Oriental",
               "EEST",
               "Ora di Europa Oriental",
               "EET",
            };
        final String[] Atlantic = new String[] {
               "Ora Padr\u00e3u di Atlantiku",
               "AST",
               "Ora di Ver\u00e3u di Atlantiku",
               "ADT",
               "Ora di Atlantiku",
               "AT",
            };
        final String[] Africa_Western = new String[] {
               "Ora Padr\u00e3u di Afrika Osidental",
               "WAST",
               "Ora di Ver\u00e3o di Afrika Osidental",
               "WAST",
               "Ora di Afrika Osidental",
               "WAT",
            };
        final Object[][] data = new Object[][] {
            { "America/Halifax", Atlantic },
            { "Europe/Paris", Europe_Central },
            { "Africa/Casablanca", Europe_Western },
            { "Europe/Bucharest", Europe_Eastern },
            { "Europe/Ljubljana", Europe_Central },
            { "America/Thule", Atlantic },
            { "Africa/Nairobi", Africa_Eastern },
            { "America/Curacao", Atlantic },
            { "Africa/Libreville", Africa_Western },
            { "America/Marigot", Atlantic },
            { "Africa/Lusaka", Africa_Central },
            { "Africa/Maputo", Africa_Central },
            { "America/Martinique", Atlantic },
            { "Europe/Berlin", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Cairo", Europe_Eastern },
            { "Africa/Mbabane", Africa_Southern },
            { "America/Aruba", Atlantic },
            { "Australia/Hobart", Australia_Eastern },
            { "Europe/Chisinau", Europe_Eastern },
            { "America/Puerto_Rico", Atlantic },
            { "Europe/Stockholm", Europe_Central },
            { "America/Tortola", Atlantic },
            { "Europe/Budapest", Europe_Central },
            { "Australia/Eucla", Australia_CentralWestern },
            { "Europe/San_Marino", Europe_Central },
            { "Europe/Zagreb", Europe_Central },
            { "America/Port_of_Spain", Atlantic },
            { "Europe/Helsinki", Europe_Eastern },
            { "Asia/Beirut", Europe_Eastern },
            { "Europe/Brussels", Europe_Central },
            { "Africa/Harare", Africa_Central },
            { "Africa/Douala", Africa_Western },
            { "Europe/Warsaw", Europe_Central },
            { "Europe/Tallinn", Europe_Eastern },
            { "Africa/Khartoum", Africa_Eastern },
            { "Africa/Johannesburg", Africa_Southern },
            { "Europe/Istanbul", Europe_Eastern },
            { "Africa/Ndjamena", Africa_Western },
            { "Asia/Damascus", Europe_Eastern },
            { "Europe/Luxembourg", Europe_Central },
            { "Africa/Bangui", Africa_Western },
            { "Europe/Belgrade", Europe_Central },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "Africa/Brazzaville", Africa_Western },
            { "Africa/Porto-Novo", Africa_Western },
            { "Africa/Juba", Africa_Eastern },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "Atlantic/Madeira", Europe_Western },
            { "America/Goose_Bay", Atlantic },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "Australia/Adelaide", Australia_Central },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "Africa/Djibouti", Africa_Eastern },
            { "Africa/Kigali", Africa_Central },
            { "Europe/Simferopol", Europe_Eastern },
            { "Europe/Sofia", Europe_Eastern },
            { "Africa/Niamey", Africa_Western },
            { "Europe/Prague", Europe_Central },
            { "America/Kralendijk", Atlantic },
            { "Africa/Tunis", Europe_Central },
            { "America/Antigua", Atlantic },
            { "Europe/Andorra", Europe_Central },
            { "Africa/Tripoli", Europe_Eastern },
            { "Indian/Comoro", Africa_Eastern },
            { "Asia/Nicosia", Europe_Eastern },
            { "America/Moncton", Atlantic },
            { "America/Blanc-Sablon", Atlantic },
            { "Africa/Gaborone", Africa_Central },
            { "Africa/Windhoek", Africa_Western },
            { "Europe/Lisbon", Europe_Western },
            { "America/St_Vincent", Atlantic },
            { "Europe/Oslo", Europe_Central },
            { "Africa/Mogadishu", Africa_Eastern },
            { "Asia/Gaza", Europe_Eastern },
            { "Australia/Perth", Australia_Western },
            { "America/Grenada", Atlantic },
            { "Australia/Darwin", Australia_Central },
            { "Atlantic/Faeroe", Europe_Western },
            { "Atlantic/Canary", Europe_Western },
            { "Europe/Bratislava", Europe_Central },
            { "Antarctica/Casey", Australia_Western },
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
            { "America/Santo_Domingo", Atlantic },
            { "America/St_Kitts", Atlantic },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Australia/Broken_Hill", Australia_Central },
            { "Europe/Minsk", Europe_Eastern },
            { "Europe/Riga", Europe_Eastern },
            { "America/Glace_Bay", Atlantic },
            { "Africa/Lagos", Africa_Western },
            { "America/Dominica", Atlantic },
            { "America/Guadeloupe", Atlantic },
            { "Europe/Kiev", Europe_Eastern },
            { "Europe/Rome", Europe_Central },
            { "Asia/Hebron", Europe_Eastern },
            { "America/St_Barthelemy", Atlantic },
            { "Africa/Luanda", Africa_Western },
            { "Australia/Currie", Australia_Eastern },
            { "Australia/Melbourne", Australia_Eastern },
            { "Africa/Algiers", Europe_Central },
            { "Europe/Mariehamn", Europe_Eastern },
            { "America/St_Thomas", Atlantic },
            { "Europe/Zurich", Europe_Central },
            { "Atlantic/Bermuda", Atlantic },
            { "America/Anguilla", Atlantic },
            { "Europe/Vilnius", Europe_Eastern },
            { "Europe/Amsterdam", Europe_Central },
            { "Europe/Vatican", Europe_Central },
            { "Africa/Maseru", Africa_Southern },
            { "Europe/Gibraltar", Europe_Central },
            { "Africa/Kinshasa", Africa_Western },
            { "Asia/Amman", Europe_Eastern },
            { "Australia/Sydney", Australia_Eastern },
            { "Africa/Lubumbashi", Africa_Central },
            { "America/St_Lucia", Atlantic },
            { "Europe/Madrid", Europe_Central },
            { "America/Montserrat", Atlantic },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Australia/Lindeman", Australia_Eastern },
            { "Europe/Vaduz", Europe_Central },
            { "Australia/Brisbane", Australia_Eastern },
            { "Indian/Mayotte", Africa_Eastern },
            { "America/Barbados", Atlantic },
            { "America/Lower_Princes", Atlantic },
            { "Europe/Athens", Europe_Eastern },
            { "Africa/Blantyre", Africa_Central },
            { "Europe/Monaco", Europe_Central },
        };
        return data;
    }
}
