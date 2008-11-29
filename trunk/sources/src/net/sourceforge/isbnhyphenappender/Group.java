/*
 *   Copyright © 2008 Francisco Sariego Rodríguez
 *
 *   $Id$
 *
 *   This file is part of ISBNHyphenAppender.
 *
 *   ISBNHyphenAppender is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   ISBNHyphenAppender is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with ISBNHyphenAppender.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.isbnhyphenappender;

/**
 * Represents an ISBN group.
 * <p>
 * Each group is based in the information on
 * http://www.isbn-international.org/converter/ranges.htm
 * @author Francisco Sariego Rodríguez
 * @version $Revision$ $Date$
 */
public enum Group {

    /**
     * Group: 0. English speaking area.
     */
    _0(0, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"900000", "949999"},
{"9500000", "9999999"}
}, 7),
    /**
     * Group: 1. English speaking area.
     */
    _1(1, new String[][]{
{"00", "09"},
{"100", "399"},
{"4000", "5499"},
{"55000", "86979"},
{"869800", "998999"}
}, 6),
    /**
     * Group: 2. French speaking area.
     */
    _2(2, new String[][]{
{"00", "19"},
{"200", "349"},
{"35000", "39999"},
{"400", "699"},
{"7000", "8399"},
{"84000", "89999"},
{"900000", "949999"},
{"9500000", "9999999"}
}, 7),
    /**
     * Group: 3. German speaking area.
     */
    _3(3, new String[][]{
{"00", "02"},
{"030", "033"},
{"0340", "0369"},
{"03700", "03999"},
{"04", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"900000", "949999"},
{"9500000", "9539999"},
{"95400", "96999"},
{"9700000", "9899999"},
{"99000", "99499"},
{"99500", "99999"}
}, 7),
    /**
     * Group: 4. Japan.
     */
    _4(4, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"900000", "949999"},
{"9500000", "9999999"}
}, 7),
    /**
     * Group: 5. Russian Federation.
     */
    _5(5, new String[][]{
{"00", "19"},
{"200", "420"},
{"4210", "4299"},
{"430", "430"},
{"4310", "4399"},
{"440", "440"},
{"4410", "4499"},
{"450", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"900000", "909999"},
{"91000", "91999"},
{"9200", "9299"},
{"93000", "94999"},
{"9500", "9799"},
{"98000", "98999"},
{"9900000", "9909999"},
{"9910", "9999"}
}, 7),
    /**
     * Group: 600. Iran.
     */
    _600(600, new String[][]{
{"00", "09"},
{"100", "499"},
{"5000", "8999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 601. Kazakhstan.
     */
    _601(601, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "7999"},
{"80000", "84999"},
{"85", "99"}
}, 5),
    /**
     * Group: 602. Indonesia.
     */
    _602(602, new String[][]{
{"00", "19"},
{"200", "799"},
{"8000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 603. Saudi Arabia.
     */
    _603(603, new String[][]{
{"00", "04"},
{"500", "799"},
{"8000", "8999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 604. Vietnam.
     */
    _604(604, new String[][]{
{"0", "4"},
{"50", "89"},
{"900", "979"},
{"9800", "9999"}
}, 4),
    /**
     * Group: 605. Turkey.
     */
    _605(605, new String[][]{
{"00", "09"},
{"100", "399"},
{"4000", "5999"},
{"60000", "89999"}
}, 5),
    /**
     * Group: 606. Romania.
     */
    _606(606, new String[][]{
{"0", "0"},
{"10", "49"},
{"500", "799"},
{"8000", "9199"},
{"92000", "99999"}
}, 5),
    /**
     * Group: 607. Mexico.
     */
    _607(607, new String[][]{
{"00", "39"},
{"400", "749"},
{"7500", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 608. Macedonia.
     */
    _608(608, new String[][]{
{"0", "0"},
{"10", "19"},
{"200", "449"},
{"4500", "6499"},
{"65000", "69999"},
{"7", "9"}
}, 5),
    /**
     * Group: 609. Lithuania.
     */
    _609(609, new String[][]{
{"00", "39"},
{"400", "799"},
{"8000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 610. Thailand.
     */
    _610(610, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 611. Ukraine.
     */
    _611(611, new String[][]{
{"00", "49"},
{"500", "699"},
{"7000", "8999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 7. China, People's Republic.
     */
    _7(7, new String[][]{
{"00", "09"},
{"100", "499"},
{"5000", "7999"},
{"80000", "89999"},
{"900000", "999999"}
}, 6),
    /**
     * Group: 80. Czech Republic  Slovakia.
     */
    _80(80, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"900000", "999999"}
}, 6),
    /**
     * Group: 81. India.
     */
    _81(81, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"900000", "999999"}
}, 6),
    /**
     * Group: 82. Norway.
     */
    _82(82, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8999"},
{"90000", "98999"},
{"990000", "999999"}
}, 6),
    /**
     * Group: 83. Poland.
     */
    _83(83, new String[][]{
{"00", "19"},
{"200", "599"},
{"60000", "69999"},
{"7000", "8499"},
{"85000", "89999"},
{"900000", "999999"}
}, 6),
    /**
     * Group: 84. Spain.
     */
    _84(84, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"9000", "9199"},
{"920000", "923999"},
{"92400", "92999"},
{"930000", "949999"},
{"95000", "96999"},
{"9700", "9999"}
}, 6),
    /**
     * Group: 85. Brazil.
     */
    _85(85, new String[][]{
{"00", "19"},
{"200", "599"},
{"60000", "69999"},
{"7000", "8499"},
{"85000", "89999"},
{"900000", "979999"},
{"98000", "99999"}
}, 6),
    /**
     * Group: 86. Serbia and Montenegro.
     */
    _86(86, new String[][]{
{"00", "29"},
{"300", "599"},
{"6000", "7999"},
{"80000", "89999"},
{"900000", "999999"}
}, 6),
    /**
     * Group: 87. Denmark.
     */
    _87(87, new String[][]{
{"00", "29"},
{"400", "649"},
{"7000", "7999"},
{"85000", "94999"},
{"970000", "999999"}
}, 6),
    /**
     * Group: 88. Italian speaking area.
     */
    _88(88, new String[][]{
{"00", "19"},
{"200", "599"},
{"6000", "8499"},
{"85000", "89999"},
{"900000", "949999"},
{"95000", "99999"}
}, 6),
    /**
     * Group: 89. Korea.
     */
    _89(89, new String[][]{
{"00", "24"},
{"250", "549"},
{"5500", "8499"},
{"85000", "94999"},
{"950000", "999999"}
}, 6),
    /**
     * Group: 90. Netherlands, Belgium (Flemish).
     */
    _90(90, new String[][]{
{"00", "19"},
{"200", "499"},
{"5000", "6999"},
{"70000", "79999"},
{"800000", "849999"},
{"8500", "8999"},
{"900000", "909999"},
{"940000", "949999"}
}, 6),
    /**
     * Group: 91. Sweden.
     */
    _91(91, new String[][]{
{"0", "1"},
{"20", "49"},
{"500", "649"},
{"7000", "7999"},
{"85000", "94999"},
{"970000", "999999"}
}, 6),
    /**
     * Group: 92. International Publishers (Unesco, EU), European Community Organizations.
     */
    _92(92, new String[][]{
{"0", "5"},
{"60", "79"},
{"800", "899"},
{"9000", "9499"},
{"95000", "98999"},
{"990000", "999999"}
}, 6),
    /**
     * Group: 93. India.
     */
    _93(93, new String[][]{
{"00", "09"},
{"100", "499"},
{"5000", "7999"},
{"80000", "94999"},
{"950000", "999999"}
}, 6),
    /**
     * Group: 94. Netherlands.
     */
    _94(94, new String[][]{
{"000", "599"},
{"6000", "8999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 950. Argentina.
     */
    _950(950, new String[][]{
{"00", "49"},
{"500", "899"},
{"9000", "9899"},
{"99000", "99999"}
}, 5),
    /**
     * Group: 951. Finland.
     */
    _951(951, new String[][]{
{"0", "1"},
{"20", "54"},
{"550", "889"},
{"8900", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 952. Finland.
     */
    _952(952, new String[][]{
{"00", "19"},
{"200", "499"},
{"5000", "5999"},
{"60", "65"},
{"6600", "6699"},
{"67000", "69999"},
{"7000", "7999"},
{"80", "94"},
{"9500", "9899"},
{"99000", "99999"}
}, 5),
    /**
     * Group: 953. Croatia.
     */
    _953(953, new String[][]{
{"0", "0"},
{"10", "14"},
{"150", "549"},
{"55000", "59999"},
{"6000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 954. Bulgaria.
     */
    _954(954, new String[][]{
{"00", "29"},
{"300", "799"},
{"8000", "8999"},
{"90000", "92999"},
{"9300", "9999"}
}, 5),
    /**
     * Group: 955. Sri Lanka.
     */
    _955(955, new String[][]{
{"0000", "0999"},
{"1000", "1999"},
{"20", "54"},
{"550", "799"},
{"8000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 956. Chile.
     */
    _956(956, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "9999"}
}, 4),
    /**
     * Group: 957. Taiwan, China.
     */
    _957(957, new String[][]{
{"00", "02"},
{"0300", "0499"},
{"05", "19"},
{"2000", "2099"},
{"21", "27"},
{"28000", "30999"},
{"31", "43"},
{"440", "819"},
{"8200", "9699"},
{"97000", "99999"}
}, 5),
    /**
     * Group: 958. Colombia.
     */
    _958(958, new String[][]{
{"00", "56"},
{"57000", "59999"},
{"600", "799"},
{"8000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 959. Cuba.
     */
    _959(959, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"}
}, 4),
    /**
     * Group: 960. Greece.
     */
    _960(960, new String[][]{
{"00", "19"},
{"200", "659"},
{"6600", "6899"},
{"690", "699"},
{"7000", "8499"},
{"85000", "99999"}
}, 5),
    /**
     * Group: 961. Slovenia.
     */
    _961(961, new String[][]{
{"00", "19"},
{"200", "599"},
{"6000", "8999"},
{"90000", "94999"}
}, 5),
    /**
     * Group: 962. Hong Kong.
     */
    _962(962, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "86999"},
{"8700", "8999"},
{"900", "999"}
}, 5),
    /**
     * Group: 963. Hungary.
     */
    _963(963, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"9000", "9999"}
}, 5),
    /**
     * Group: 964. Iran.
     */
    _964(964, new String[][]{
{"00", "14"},
{"150", "249"},
{"2500", "2999"},
{"300", "549"},
{"5500", "8999"},
{"90000", "96999"},
{"970", "989"},
{"9900", "9999"}
}, 5),
    /**
     * Group: 965. Israel.
     */
    _965(965, new String[][]{
{"00", "19"},
{"200", "599"},
{"7000", "7999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 966. Ukraine.
     */
    _966(966, new String[][]{
{"00", "14"},
{"1500", "1699"},
{"170", "199"},
{"2000", "2999"},
{"300", "699"},
{"7000", "8999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 967. Malaysia.
     */
    _967(967, new String[][]{
{"00", "29"},
{"300", "499"},
{"5000", "5999"},
{"60", "89"},
{"900", "989"},
{"9900", "9989"},
{"99900", "99999"}
}, 5),
    /**
     * Group: 968. Mexico.
     */
    _968(968, new String[][]{
{"01", "39"},
{"400", "499"},
{"5000", "7999"},
{"800", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 969. Pakistan.
     */
    _969(969, new String[][]{
{"0", "1"},
{"20", "39"},
{"400", "799"},
{"8000", "9999"}
}, 4),
    /**
     * Group: 970. Mexico.
     */
    _970(970, new String[][]{
{"01", "59"},
{"600", "899"},
{"9000", "9099"},
{"91000", "96999"},
{"9700", "9999"}
}, 5),
    /**
     * Group: 971. Philippines.
     */
    _971(971, new String[][]{
{"000", "019"},
{"02", "02"},
{"0300", "0599"},
{"06", "09"},
{"10", "49"},
{"500", "849"},
{"8500", "9099"},
{"91000", "99999"}
}, 5),
    /**
     * Group: 972. Portugal.
     */
    _972(972, new String[][]{
{"0", "1"},
{"20", "54"},
{"550", "799"},
{"8000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 973. Romania.
     */
    _973(973, new String[][]{
{"0", "0"},
{"100", "169"},
{"1700", "1999"},
{"20", "54"},
{"550", "759"},
{"7600", "8499"},
{"85000", "88999"},
{"8900", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 974. Thailand.
     */
    _974(974, new String[][]{
{"00", "19"},
{"200", "699"},
{"7000", "8499"},
{"85000", "89999"},
{"90000", "94999"},
{"9500", "9999"}
}, 5),
    /**
     * Group: 975. Turkey.
     */
    _975(975, new String[][]{
{"00000", "00999"},
{"01", "24"},
{"250", "599"},
{"6000", "9199"},
{"92000", "98999"},
{"990", "999"}
}, 5),
    /**
     * Group: 976. Caribbean Community.
     */
    _976(976, new String[][]{
{"0", "3"},
{"40", "59"},
{"600", "799"},
{"8000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 977. Egypr.
     */
    _977(977, new String[][]{
{"00", "19"},
{"200", "499"},
{"5000", "6999"},
{"700", "999"}
}, 4),
    /**
     * Group: 978. Nigeria.
     */
    _978(978, new String[][]{
{"000", "199"},
{"2000", "2999"},
{"30000", "79999"},
{"8000", "8999"},
{"900", "999"}
}, 5),
    /**
     * Group: 979. Indonesia.
     */
    _979(979, new String[][]{
{"000", "099"},
{"1000", "1499"},
{"15000", "19999"},
{"20", "29"},
{"3000", "3999"},
{"400", "799"},
{"8000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 980. Venezuela.
     */
    _980(980, new String[][]{
{"00", "19"},
{"200", "599"},
{"6000", "9999"}
}, 4),
    /**
     * Group: 981. Singapore.
     */
    _981(981, new String[][]{
{"00", "11"},
{"120", "299"},
{"3000", "9999"}
}, 4),
    /**
     * Group: 982. South Pacific.
     */
    _982(982, new String[][]{
{"00", "09"},
{"100", "699"},
{"70", "89"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 983. Malaysia.
     */
    _983(983, new String[][]{
{"00", "01"},
{"020", "199"},
{"2000", "3999"},
{"40000", "44999"},
{"45", "49"},
{"50", "79"},
{"800", "899"},
{"9000", "9899"},
{"99000", "99999"}
}, 5),
    /**
     * Group: 984. Bangladesh.
     */
    _984(984, new String[][]{
{"00", "39"},
{"400", "799"},
{"8000", "8999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 985. Belarus.
     */
    _985(985, new String[][]{
{"00", "39"},
{"400", "599"},
{"6000", "8999"},
{"90000", "99999"}
}, 5),
    /**
     * Group: 986. Taiwan, China.
     */
    _986(986, new String[][]{
{"00", "11"},
{"120", "559"},
{"5600", "7999"},
{"80000", "99999"}
}, 5),
    /**
     * Group: 987. Argentina.
     */
    _987(987, new String[][]{
{"00", "09"},
{"1000", "1999"},
{"20000", "29999"},
{"30", "49"},
{"500", "899"},
{"9000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 988. Hongkong.
     */
    _988(988, new String[][]{
{"00", "16"},
{"17000", "19999"},
{"200", "799"},
{"8000", "9699"},
{"97000", "99999"}
}, 5),
    /**
     * Group: 989. Portugal.
     */
    _989(989, new String[][]{
{"0", "1"},
{"20", "54"},
{"550", "799"},
{"8000", "9499"},
{"95000", "99999"}
}, 5),
    /**
     * Group: 9933. Syria.
     */
    _9933(9933, new String[][]{
{"0", "0"},
{"10", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9934. Latvia.
     */
    _9934(9934, new String[][]{
{"0", "0"},
{"10", "49"},
{"500", "799"},
{"8000", "9999"}
}, 4),
    /**
     * Group: 9935. Iceland.
     */
    _9935(9935, new String[][]{
{"0", "0"},
{"10", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9936. Afghanistan.
     */
    _9936(9936, new String[][]{
{"0", "1"},
{"20", "39"},
{"400", "799"},
{"8000", "9999"}
}, 4),
    /**
     * Group: 9937. Nepal.
     */
    _9937(9937, new String[][]{
{"0", "2"},
{"30", "49"},
{"500", "799"},
{"8000", "9999"}
}, 4),
    /**
     * Group: 9938. Tunisia.
     */
    _9938(9938, new String[][]{
{"00", "79"},
{"800", "949"},
{"9500", "9999"}
}, 4),
    /**
     * Group: 9939. Armenia.
     */
    _9939(9939, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9940. Montenegro.
     */
    _9940(9940, new String[][]{
{"0", "1"},
{"20", "49"},
{"500", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9941. Georgia.
     */
    _9941(9941, new String[][]{
{"0", "0"},
{"10", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9942. Ecuador.
     */
    _9942(9942, new String[][]{
{"00", "89"},
{"900", "994"},
{"9950", "9999"}
}, 4),
    /**
     * Group: 9943. Uzbekistan.
     */
    _9943(9943, new String[][]{
{"00", "29"},
{"300", "399"},
{"4000", "9999"}
}, 4),
    /**
     * Group: 9944. Turkey.
     */
    _9944(9944, new String[][]{
{"0", "2"},
{"300", "499"},
{"5000", "5999"},
{"60", "89"},
{"900", "999"}
}, 4),
    /**
     * Group: 9945. Dominican Republic.
     */
    _9945(9945, new String[][]{
{"00", "00"},
{"010", "079"},
{"08", "39"},
{"400", "569"},
{"57", "57"},
{"580", "849"},
{"8500", "9999"}
}, 4),
    /**
     * Group: 9946. Korea, P.D.R..
     */
    _9946(9946, new String[][]{
{"0", "1"},
{"20", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9947. Algeria.
     */
    _9947(9947, new String[][]{
{"0", "1"},
{"20", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 9948. United Arab Emirates.
     */
    _9948(9948, new String[][]{
{"00", "39"},
{"400", "849"},
{"8500", "9999"}
}, 4),
    /**
     * Group: 9949. Estonia.
     */
    _9949(9949, new String[][]{
{"0", "0"},
{"10", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9950. Palestine.
     */
    _9950(9950, new String[][]{
{"00", "29"},
{"300", "840"},
{"8500", "9999"}
}, 4),
    /**
     * Group: 9951. Kosova.
     */
    _9951(9951, new String[][]{
{"00", "39"},
{"400", "849"},
{"8500", "9999"}
}, 4),
    /**
     * Group: 9952. Azerbaijan.
     */
    _9952(9952, new String[][]{
{"0", "1"},
{"20", "39"},
{"400", "799"},
{"8000", "9999"}
}, 4),
    /**
     * Group: 9953. Lebanon.
     */
    _9953(9953, new String[][]{
{"0", "0"},
{"10", "39"},
{"400", "599"},
{"60", "89"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9954. Morocco.
     */
    _9954(9954, new String[][]{
{"0", "1"},
{"20", "39"},
{"400", "799"},
{"8000", "9999"}
}, 4),
    /**
     * Group: 9955. Lithuania.
     */
    _9955(9955, new String[][]{
{"00", "39"},
{"400", "929"},
{"9300", "9999"}
}, 4),
    /**
     * Group: 9956. Cameroon.
     */
    _9956(9956, new String[][]{
{"0", "0"},
{"10", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9957. Jordan.
     */
    _9957(9957, new String[][]{
{"00", "39"},
{"400", "699"},
{"70", "84"},
{"8500", "9999"}
}, 4),
    /**
     * Group: 9958. Bosnia and Herzegovina.
     */
    _9958(9958, new String[][]{
{"0", "0"},
{"10", "49"},
{"500", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9959. Libya.
     */
    _9959(9959, new String[][]{
{"0", "1"},
{"20", "79"},
{"800", "949"},
{"9500", "9999"}
}, 4),
    /**
     * Group: 9960. Saudi Arabia.
     */
    _9960(9960, new String[][]{
{"00", "59"},
{"600", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9961. Algeria.
     */
    _9961(9961, new String[][]{
{"0", "2"},
{"30", "69"},
{"700", "949"},
{"9500", "9999"}
}, 4),
    /**
     * Group: 9962. Panama.
     */
    _9962(9962, new String[][]{
{"00", "54"},
{"5500", "5599"},
{"56", "59"},
{"600", "849"},
{"8500", "9999"}
}, 4),
    /**
     * Group: 9963. Cyprus.
     */
    _9963(9963, new String[][]{
{"0", "2"},
{"30", "54"},
{"550", "749"},
{"7500", "9999"}
}, 4),
    /**
     * Group: 9964. Ghana.
     */
    _9964(9964, new String[][]{
{"0", "6"},
{"70", "94"},
{"950", "999"}
}, 3),
    /**
     * Group: 9965. Kazakhstan.
     */
    _9965(9965, new String[][]{
{"00", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9966. Kenya.
     */
    _9966(9966, new String[][]{
{"000", "199"},
{"20", "69"},
{"7000", "7499"},
{"750", "959"},
{"9600", "9999"}
}, 4),
    /**
     * Group: 9967. Kyrgyzstan.
     */
    _9967(9967, new String[][]{
{"00", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9968. Costa Rica.
     */
    _9968(9968, new String[][]{
{"00", "49"},
{"500", "939"},
{"9400", "9999"}
}, 4),
    /**
     * Group: 9970. Uganda.
     */
    _9970(9970, new String[][]{
{"00", "39"},
{"400", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9971. Singapore.
     */
    _9971(9971, new String[][]{
{"0", "5"},
{"60", "89"},
{"900", "989"},
{"9900", "9999"}
}, 4),
    /**
     * Group: 9972. Peru.
     */
    _9972(9972, new String[][]{
{"00", "09"},
{"1", "1"},
{"200", "249"},
{"2500", "2999"},
{"30", "59"},
{"600", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9973. Tunisia.
     */
    _9973(9973, new String[][]{
{"00", "05"},
{"060", "089"},
{"0900", "0999"},
{"10", "69"},
{"700", "969"},
{"9700", "9999"}
}, 4),
    /**
     * Group: 9974. Uruguay.
     */
    _9974(9974, new String[][]{
{"0", "2"},
{"30", "54"},
{"550", "749"},
{"7500", "9499"},
{"95", "99"}
}, 4),
    /**
     * Group: 9975. Moldova.
     */
    _9975(9975, new String[][]{
{"0", "0"},
{"100", "399"},
{"4000", "4499"},
{"45", "89"},
{"900", "949"},
{"9500", "9999"}
}, 4),
    /**
     * Group: 9976. Tanzania.
     */
    _9976(9976, new String[][]{
{"0", "5"},
{"60", "89"},
{"900", "989"},
{"9990", "9999"}
}, 4),
    /**
     * Group: 9977. Costa Rica.
     */
    _9977(9977, new String[][]{
{"00", "89"},
{"900", "989"},
{"9900", "9999"}
}, 4),
    /**
     * Group: 9978. Ecuador.
     */
    _9978(9978, new String[][]{
{"00", "29"},
{"300", "399"},
{"40", "94"},
{"950", "989"},
{"9900", "9999"}
}, 4),
    /**
     * Group: 9979. Iceland.
     */
    _9979(9979, new String[][]{
{"0", "4"},
{"50", "64"},
{"650", "659"},
{"66", "75"},
{"760", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9980. Papua New Guinea.
     */
    _9980(9980, new String[][]{
{"0", "3"},
{"40", "89"},
{"900", "989"},
{"9900", "9999"}
}, 4),
    /**
     * Group: 9981. Morocco.
     */
    _9981(9981, new String[][]{
{"00", "09"},
{"100", "159"},
{"1600", "1999"},
{"20", "79"},
{"800", "949"},
{"9500", "9999"}
}, 4),
    /**
     * Group: 9982. Zambia.
     */
    _9982(9982, new String[][]{
{"00", "79"},
{"800", "989"},
{"9900", "9999"}
}, 4),
    /**
     * Group: 9983. Gambia.
     */
    _9983(9983, new String[][]{
{"80", "94"},
{"950", "989"},
{"9900", "9999"}
}, 4),
    /**
     * Group: 9984. Latvia.
     */
    _9984(9984, new String[][]{
{"00", "49"},
{"500", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9985. Estonia.
     */
    _9985(9985, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "899"},
{"9000", "9999"}
}, 4),
    /**
     * Group: 9986. Lithuania.
     */
    _9986(9986, new String[][]{
{"00", "39"},
{"400", "899"},
{"9000", "9399"},
{"940", "969"},
{"97", "99"}
}, 4),
    /**
     * Group: 9987. Tanzania.
     */
    _9987(9987, new String[][]{
{"00", "39"},
{"400", "879"},
{"8800", "9999"}
}, 4),
    /**
     * Group: 9988. Ghana.
     */
    _9988(9988, new String[][]{
{"0", "2"},
{"30", "54"},
{"550", "749"},
{"7500", "9999"}
}, 4),
    /**
     * Group: 9989. Macedonia.
     */
    _9989(9989, new String[][]{
{"0", "0"},
{"100", "199"},
{"2000", "2999"},
{"30", "59"},
{"600", "949"},
{"9500", "9999"}
}, 4),
    /**
     * Group: 99901. Bahrain.
     */
    _99901(99901, new String[][]{
{"00", "49"},
{"500", "799"},
{"80", "99"}
}, 3),
    /**
     * Group: 99902. Gabon - no ranges fixed yet.
     */
    _99902(99902, null, 0),
    /**
     * Group: 99903. Mauritius.
     */
    _99903(99903, new String[][]{
{"0", "1"},
{"20", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99904. Netherlands Antilles  Aruba, Neth. Ant.
     */
    _99904(99904, new String[][]{
{"0", "5"},
{"60", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99905. Bolivia.
     */
    _99905(99905, new String[][]{
{"0", "3"},
{"40", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99906. Kuwait.
     */
    _99906(99906, new String[][]{
{"0", "2"},
{"30", "59"},
{"600", "699"},
{"70", "89"},
{"9", "9"}
}, 3),
    /**
     * Group: 99908. Malawi.
     */
    _99908(99908, new String[][]{
{"0", "0"},
{"10", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99909. Malta.
     */
    _99909(99909, new String[][]{
{"0", "3"},
{"40", "94"},
{"950", "999"}
}, 3),
    /**
     * Group: 99910. Sierra Leone.
     */
    _99910(99910, new String[][]{
{"0", "2"},
{"30", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99911. Lesotho.
     */
    _99911(99911, new String[][]{
{"00", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99912. Botswana.
     */
    _99912(99912, new String[][]{
{"0", "3"},
{"400", "599"},
{"60", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99913. Andorra.
     */
    _99913(99913, new String[][]{
{"0", "2"},
{"30", "35"},
{"600", "604"}
}, 3),
    /**
     * Group: 99914. Suriname.
     */
    _99914(99914, new String[][]{
{"0", "4"},
{"50", "89"},
{"900", "949"}
}, 3),
    /**
     * Group: 99915. Maldives.
     */
    _99915(99915, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99916. Namibia.
     */
    _99916(99916, new String[][]{
{"0", "2"},
{"30", "69"},
{"700", "999"}
}, 3),
    /**
     * Group: 99917. Brunei Darussalam.
     */
    _99917(99917, new String[][]{
{"0", "2"},
{"30", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99918. Faroe Islands.
     */
    _99918(99918, new String[][]{
{"0", "3"},
{"40", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99919. Benin.
     */
    _99919(99919, new String[][]{
{"0", "2"},
{"300", "399"},
{"40", "69"},
{"900", "999"}
}, 3),
    /**
     * Group: 99920. Andorra.
     */
    _99920(99920, new String[][]{
{"0", "4"},
{"50", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99921. Qatar.
     */
    _99921(99921, new String[][]{
{"0", "1"},
{"20", "69"},
{"700", "799"},
{"8", "8"},
{"90", "99"}
}, 3),
    /**
     * Group: 99922. Guatemala.
     */
    _99922(99922, new String[][]{
{"0", "3"},
{"40", "69"},
{"700", "999"}
}, 3),
    /**
     * Group: 99923. El Salvador.
     */
    _99923(99923, new String[][]{
{"0", "1"},
{"20", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99924. Nicaragua.
     */
    _99924(99924, new String[][]{
{"0", "1"},
{"20", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99925. Paraguay.
     */
    _99925(99925, new String[][]{
{"0", "3"},
{"40", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99926. Honduras.
     */
    _99926(99926, new String[][]{
{"0", "0"},
{"10", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99927. Albania.
     */
    _99927(99927, new String[][]{
{"0", "2"},
{"30", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99928. Georgia.
     */
    _99928(99928, new String[][]{
{"0", "0"},
{"10", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99929. Mongolia.
     */
    _99929(99929, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99930. Armenia.
     */
    _99930(99930, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99931. Seychelles.
     */
    _99931(99931, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99932. Malta.
     */
    _99932(99932, new String[][]{
{"0", "0"},
{"10", "59"},
{"600", "699"},
{"7", "7"},
{"80", "99"}
}, 3),
    /**
     * Group: 99933. Nepal.
     */
    _99933(99933, new String[][]{
{"0", "2"},
{"30", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99934. Dominican Republic.
     */
    _99934(99934, new String[][]{
{"0", "1"},
{"20", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99935. Haiti.
     */
    _99935(99935, new String[][]{
{"0", "2"},
{"7", "8"},
{"30", "59"},
{"600", "699"},
{"90", "99"}
}, 3),
    /**
     * Group: 99936. Bhutan.
     */
    _99936(99936, new String[][]{
{"0", "0"},
{"10", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99937. Macau.
     */
    _99937(99937, new String[][]{
{"0", "1"},
{"20", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99938. Srpska.
     */
    _99938(99938, new String[][]{
{"0", "1"},
{"20", "59"},
{"600", "899"},
{"90", "99"}
}, 3),
    /**
     * Group: 99939. Guatemala.
     */
    _99939(99939, new String[][]{
{"0", "5"},
{"60", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99940. Georgia.
     */
    _99940(99940, new String[][]{
{"0", "0"},
{"10", "69"},
{"700", "999"}
}, 3),
    /**
     * Group: 99941. Armenia.
     */
    _99941(99941, new String[][]{
{"0", "2"},
{"30", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99942. Sudan.
     */
    _99942(99942, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99943. Alsbania.
     */
    _99943(99943, new String[][]{
{"0", "2"},
{"30", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99944. Ethiopia.
     */
    _99944(99944, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99945. Namibia.
     */
    _99945(99945, new String[][]{
{"0", "5"},
{"60", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99946. Nepal.
     */
    _99946(99946, new String[][]{
{"0", "2"},
{"30", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99947. Tajikistan.
     */
    _99947(99947, new String[][]{
{"0", "2"},
{"30", "69"},
{"700", "999"}
}, 3),
    /**
     * Group: 99948. Eritrea.
     */
    _99948(99948, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99949. Mauritius.
     */
    _99949(99949, new String[][]{
{"0", "1"},
{"20", "89"},
{"900", "999"}
}, 3),
    /**
     * Group: 99950. Cambodia.
     */
    _99950(99950, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99951. Congo - no ranges fixed yet.
     */
    _99951(99951, null, 0),
    /**
     * Group: 99952. Mali.
     */
    _99952(99952, new String[][]{
{"0", "4"},
{"50", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99953. Paraguay.
     */
    _99953(99953, new String[][]{
{"0", "2"},
{"30", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99954. Bolivia.
     */
    _99954(99954, new String[][]{
{"0", "2"},
{"30", "69"},
{"700", "999"}
}, 3),
    /**
     * Group: 99955. Srpska.
     */
    _99955(99955, new String[][]{
{"0", "1"},
{"20", "59"},
{"600", "899"},
{"90", "99"}
}, 3),
    /**
     * Group: 99956. Albania.
     */
    _99956(99956, new String[][]{
{"00", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99957. Malta.
     */
    _99957(99957, new String[][]{
{"0", "1"},
{"20", "79"},
{"800", "999"}
}, 3),
    /**
     * Group: 99958. Bahrain.
     */
    _99958(99958, new String[][]{
{"0", "4"},
{"50", "94"},
{"950", "999"}
}, 3),
    /**
     * Group: 99959. Luxembourg.
     */
    _99959(99959, new String[][]{
{"0", "2"},
{"30", "59"},
{"600", "999"}
}, 3),
    /**
     * Group: 99960. Malawi.
     */
    _99960(99960, new String[][]{
{"0", "0"},
{"10", "94"},
{"950", "999"}
}, 3),
    /**
     * Group: 99961. El Salvador.
     */
    _99961(99961, new String[][]{
{"0", "3"},
{"40", "89"},
{"900", "999"}
}, 3);

    /**
     * Number of the group.
     */
    private final int number;

    /**
     * Ranges of valid publisher numbers for the group.
     */
    private final String[][] validPublisherNumbers;

    /**
     * Maximum length of a valid publisher number of the group.
     */
    private final int maximumPublisherNumberLength;

    /**
     * Initializes the group attributes.
     * @param number number of the group
     * @param validPublisherNumbers valid publisher numbers for the group
     * @param maximumPublisherNumberLength maximum publisher number length
     */
    private Group(int number, String[][] validPublisherNumbers,
            int maximumPublisherNumberLength) {
        this.number = number;
        this.validPublisherNumbers = validPublisherNumbers;
        this.maximumPublisherNumberLength = maximumPublisherNumberLength;
    }

    /**
     * Returns the group of the specified ISBN.
     * @param ISBN ISBN for the group wants to get.
     * @return the group of the specified ISBN or {@code null} if the ISBN
     * is not from any group.
     */
    public static Group getGroup(String ISBN) {
        Group result = null;

        int length = ISBN.length();
        int i = 1;

        while (result == null && i < length) {
            try {
                result = Group.valueOf('_' + ISBN.substring(0, i));
            } catch (IllegalArgumentException ex) {
            }

            i++;
        }

        return result;
    }

    /**
     * Returns the number of the group.
     * @return the number of the group
     */
    public int getNumber() {
        return number;
    }

    /**
     * Returns the valid publisher numbers for the group.
     * @return the valid publisher numbers for the group
     */
    public String[][] getValidPublisherNumbers() {
        return validPublisherNumbers;
    }

    /**
     * Returns the maximum publisher number length.
     * @return the maximum publisher number length
     */
    public int getMaximumPublisherNumberLength() {
        return maximumPublisherNumberLength;
    }
}
