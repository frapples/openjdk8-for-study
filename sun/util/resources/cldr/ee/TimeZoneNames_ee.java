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

package sun.util.resources.cldr.ee;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_ee extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Africa_Central = new String[] {
               "Titina Afrika ga\u0192o\u0192ome",
               "CAT",
               "Central Africa Summer Time",
               "CAST",
               "Central Africa Time",
               "CAT",
            };
        final String[] Africa_Southern = new String[] {
               "Anyiehe Afrika ga\u0192o\u0192ome",
               "SAST",
               "South Africa Daylight Time",
               "SADT",
               "South Africa Time",
               "SAT",
            };
        final String[] America_Eastern = new String[] {
               "\u0194edze\u0192e Amerika ga\u0192o\u0192o\u0256oanyime",
               "EST",
               "\u0194edze\u0192e Amerika \u014bkekeme ga\u0192o\u0192ome",
               "EDT",
               "\u0194edze\u0192e Amerika ga\u0192o\u0192ome",
               "ET",
            };
        final String[] America_Central = new String[] {
               "Titina Amerika ga\u0192o\u0192o\u0256oanyime",
               "CST",
               "Titina Amerika \u014bkekeme ga\u0192o\u0192ome",
               "CDT",
               "Titina Amerika ga\u0192o\u0192ome",
               "CT",
            };
        final String[] America_Mountain = new String[] {
               "Amerika Todziduk\u0254wo \u0192e ga\u0192o\u0192o\u0256oanyime",
               "MST",
               "Amerika Todziduk\u0254wo \u0192e \u014bkekme ga\u0192o\u0192ome",
               "MDT",
               "Amerika Todziduk\u0254wo \u0192e ga\u0192o\u0192ome",
               "MT",
            };
        final String[] America_Pacific = new String[] {
               "Amerika Pasifik ga\u0192o\u0192o\u0256oanyime",
               "PST",
               "Amerika Pasifik \u014bkekeme ga\u0192o\u0192ome",
               "PDT",
               "Amerika Pasifik ga\u0192o\u0192ome",
               "PT",
            };
        final String[] Africa_Eastern = new String[] {
               "\u0194edze\u0192e Afrika ga\u0192o\u0192ome",
               "EAT",
               "East Africa Summer Time",
               "EAST",
               "East Africa Time",
               "EAT",
            };
        final String[] Atlantic = new String[] {
               "Atlantic ga\u0192o\u0192o\u0256oanyime",
               "AST",
               "Atlantic \u014bkekeme ga\u0192o\u0192ome",
               "ADT",
               "Atlantic ga\u0192o\u0192ome",
               "AT",
            };
        final String[] Africa_Western = new String[] {
               "\u0194eto\u0256o\u0192e Afrika ga\u0192o\u0192o\u0256oanyime",
               "WAT",
               "\u0194eto\u0256o\u0192e Afrika dzome\u014b\u0254li ga\u0192o\u0192ome",
               "WAST",
               "\u0194eto\u0256o\u0192e Afrika ga\u0192o\u0192ome",
               "WAT",
            };
        final Object[][] data = new Object[][] {
            { "America/Los_Angeles", America_Pacific },
            { "America/Denver", America_Mountain },
            { "America/Phoenix", America_Mountain },
            { "America/Chicago", America_Central },
            { "America/New_York", America_Eastern },
            { "America/Indianapolis", America_Eastern },
            { "America/Halifax", Atlantic },
            { "America/Thule", Atlantic },
            { "Africa/Nairobi", Africa_Eastern },
            { "America/Curacao", Atlantic },
            { "Africa/Libreville", Africa_Western },
            { "America/Marigot", Atlantic },
            { "Africa/Lusaka", Africa_Central },
            { "Africa/Maputo", Africa_Central },
            { "America/Martinique", Atlantic },
            { "America/El_Salvador", America_Central },
            { "America/Kentucky/Monticello", America_Eastern },
            { "America/Coral_Harbour", America_Eastern },
            { "Africa/Mbabane", Africa_Southern },
            { "America/Aruba", Atlantic },
            { "America/North_Dakota/Center", America_Central },
            { "America/Guatemala", America_Central },
            { "America/Puerto_Rico", Atlantic },
            { "America/Rankin_Inlet", America_Central },
            { "America/Cayman", America_Eastern },
            { "America/Belize", America_Central },
            { "America/Panama", America_Eastern },
            { "America/Tortola", Atlantic },
            { "America/Indiana/Tell_City", America_Central },
            { "America/Tijuana", America_Pacific },
            { "America/Port_of_Spain", Atlantic },
            { "America/Managua", America_Central },
            { "America/Indiana/Petersburg", America_Eastern },
            { "Africa/Harare", Africa_Central },
            { "Africa/Douala", Africa_Western },
            { "America/Chihuahua", America_Mountain },
            { "America/Ojinaga", America_Mountain },
            { "Africa/Khartoum", Africa_Eastern },
            { "Africa/Johannesburg", Africa_Southern },
            { "America/Tegucigalpa", America_Central },
            { "Africa/Ndjamena", Africa_Western },
            { "America/Rainy_River", America_Central },
            { "Africa/Bangui", Africa_Western },
            { "America/Yellowknife", America_Mountain },
            { "Africa/Brazzaville", Africa_Western },
            { "Africa/Porto-Novo", Africa_Western },
            { "America/Indiana/Vevay", America_Eastern },
            { "Africa/Juba", Africa_Eastern },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "America/Goose_Bay", Atlantic },
            { "America/Thunder_Bay", America_Eastern },
            { "America/Swift_Current", America_Central },
            { "America/Grand_Turk", America_Eastern },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "America/Metlakatla", America_Pacific },
            { "America/Pangnirtung", America_Eastern },
            { "Africa/Djibouti", Africa_Eastern },
            { "America/Indiana/Marengo", America_Eastern },
            { "Africa/Kigali", Africa_Central },
            { "America/Creston", America_Mountain },
            { "Africa/Niamey", Africa_Western },
            { "America/Indiana/Vincennes", America_Eastern },
            { "America/Whitehorse", America_Pacific },
            { "America/Kralendijk", Atlantic },
            { "America/Mexico_City", America_Central },
            { "America/Antigua", Atlantic },
            { "America/Montreal", America_Eastern },
            { "Indian/Comoro", Africa_Eastern },
            { "America/Inuvik", America_Mountain },
            { "America/Iqaluit", America_Eastern },
            { "America/Matamoros", America_Central },
            { "America/Moncton", Atlantic },
            { "America/Blanc-Sablon", Atlantic },
            { "Africa/Gaborone", Africa_Central },
            { "America/Indiana/Winamac", America_Eastern },
            { "Africa/Windhoek", Africa_Western },
            { "America/St_Vincent", Atlantic },
            { "Africa/Mogadishu", Africa_Eastern },
            { "PST8PDT", America_Pacific },
            { "America/Grenada", Atlantic },
            { "CST6CDT", America_Central },
            { "America/Menominee", America_Central },
            { "America/Resolute", America_Central },
            { "Africa/Asmera", Africa_Eastern },
            { "Africa/Kampala", Africa_Eastern },
            { "America/Merida", America_Central },
            { "Africa/Malabo", Africa_Western },
            { "America/Mazatlan", America_Mountain },
            { "America/Edmonton", America_Mountain },
            { "Africa/Bujumbura", Africa_Central },
            { "America/Santo_Domingo", Atlantic },
            { "America/St_Kitts", Atlantic },
            { "America/Glace_Bay", Atlantic },
            { "Africa/Lagos", Africa_Western },
            { "America/Dominica", Atlantic },
            { "America/Guadeloupe", Atlantic },
            { "America/Port-au-Prince", America_Eastern },
            { "America/St_Barthelemy", Atlantic },
            { "Africa/Luanda", Africa_Western },
            { "America/Nipigon", America_Eastern },
            { "America/Regina", America_Central },
            { "America/Boise", America_Mountain },
            { "EST5EDT", America_Eastern },
            { "America/North_Dakota/New_Salem", America_Central },
            { "America/Dawson_Creek", America_Mountain },
            { "America/St_Thomas", Atlantic },
            { "Atlantic/Bermuda", Atlantic },
            { "America/Anguilla", Atlantic },
            { "America/Costa_Rica", America_Central },
            { "America/Dawson", America_Pacific },
            { "America/Shiprock", America_Mountain },
            { "America/Winnipeg", America_Central },
            { "America/Hermosillo", America_Mountain },
            { "America/Indiana/Knox", America_Central },
            { "America/Cancun", America_Central },
            { "America/North_Dakota/Beulah", America_Central },
            { "Africa/Maseru", Africa_Southern },
            { "Africa/Kinshasa", Africa_Western },
            { "Africa/Lubumbashi", Africa_Central },
            { "America/St_Lucia", Atlantic },
            { "America/Bahia_Banderas", America_Central },
            { "America/Montserrat", Atlantic },
            { "America/Santa_Isabel", America_Pacific },
            { "America/Cambridge_Bay", America_Mountain },
            { "America/Toronto", America_Eastern },
            { "Indian/Antananarivo", Africa_Eastern },
            { "MST7MDT", America_Mountain },
            { "Indian/Mayotte", Africa_Eastern },
            { "America/Barbados", Atlantic },
            { "America/Monterrey", America_Central },
            { "America/Nassau", America_Eastern },
            { "America/Jamaica", America_Eastern },
            { "America/Louisville", America_Eastern },
            { "America/Lower_Princes", Atlantic },
            { "America/Vancouver", America_Pacific },
            { "Africa/Blantyre", Africa_Central },
            { "America/Detroit", America_Eastern },
        };
        return data;
    }
}
