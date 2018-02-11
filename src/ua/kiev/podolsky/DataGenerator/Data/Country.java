package ua.kiev.podolsky.DataGenerator.Data;

public class Country {
	
	private final String COUNTRIES_CSV = "Afghanistan,AF,AFG,004,ISO 3166-2:AF,Asia,Southern Asia,142,034\r\n" + 
			"Åland Islands,AX,ALA,248,ISO 3166-2:AX,Europe,Northern Europe,150,154\r\n" + 
			"Albania,AL,ALB,008,ISO 3166-2:AL,Europe,Southern Europe,150,039\r\n" + 
			"Algeria,DZ,DZA,012,ISO 3166-2:DZ,Africa,Northern Africa,002,015\r\n" + 
			"American Samoa,AS,ASM,016,ISO 3166-2:AS,Oceania,Polynesia,009,061\r\n" + 
			"Andorra,AD,AND,020,ISO 3166-2:AD,Europe,Southern Europe,150,039\r\n" + 
			"Angola,AO,AGO,024,ISO 3166-2:AO,Africa,Middle Africa,002,017\r\n" + 
			"Anguilla,AI,AIA,660,ISO 3166-2:AI,Americas,Caribbean,019,029\r\n" + 
			"Antarctica,AQ,ATA,010,ISO 3166-2:AQ,,,,\r\n" + 
			"Antigua and Barbuda,AG,ATG,028,ISO 3166-2:AG,Americas,Caribbean,019,029\r\n" + 
			"Argentina,AR,ARG,032,ISO 3166-2:AR,Americas,South America,019,005\r\n" + 
			"Armenia,AM,ARM,051,ISO 3166-2:AM,Asia,Western Asia,142,145\r\n" + 
			"Aruba,AW,ABW,533,ISO 3166-2:AW,Americas,Caribbean,019,029\r\n" + 
			"Australia,AU,AUS,036,ISO 3166-2:AU,Oceania,Australia and New Zealand,009,053\r\n" + 
			"Austria,AT,AUT,040,ISO 3166-2:AT,Europe,Western Europe,150,155\r\n" + 
			"Azerbaijan,AZ,AZE,031,ISO 3166-2:AZ,Asia,Western Asia,142,145\r\n" + 
			"Bahamas,BS,BHS,044,ISO 3166-2:BS,Americas,Caribbean,019,029\r\n" + 
			"Bahrain,BH,BHR,048,ISO 3166-2:BH,Asia,Western Asia,142,145\r\n" + 
			"Bangladesh,BD,BGD,050,ISO 3166-2:BD,Asia,Southern Asia,142,034\r\n" + 
			"Barbados,BB,BRB,052,ISO 3166-2:BB,Americas,Caribbean,019,029\r\n" + 
			"Belarus,BY,BLR,112,ISO 3166-2:BY,Europe,Eastern Europe,150,151\r\n" + 
			"Belgium,BE,BEL,056,ISO 3166-2:BE,Europe,Western Europe,150,155\r\n" + 
			"Belize,BZ,BLZ,084,ISO 3166-2:BZ,Americas,Central America,019,013\r\n" + 
			"Benin,BJ,BEN,204,ISO 3166-2:BJ,Africa,Western Africa,002,011\r\n" + 
			"Bermuda,BM,BMU,060,ISO 3166-2:BM,Americas,Northern America,019,021\r\n" + 
			"Bhutan,BT,BTN,064,ISO 3166-2:BT,Asia,Southern Asia,142,034\r\n" + 
			"Bolivia (Plurinational State of),BO,BOL,068,ISO 3166-2:BO,Americas,South America,019,005\r\n" + 
			"\"Bonaire, Sint Eustatius and Saba\",BQ,BES,535,ISO 3166-2:BQ,Americas,Caribbean,019,029\r\n" + 
			"Bosnia and Herzegovina,BA,BIH,070,ISO 3166-2:BA,Europe,Southern Europe,150,039\r\n" + 
			"Botswana,BW,BWA,072,ISO 3166-2:BW,Africa,Southern Africa,002,018\r\n" + 
			"Bouvet Island,BV,BVT,074,ISO 3166-2:BV,,,,\r\n" + 
			"Brazil,BR,BRA,076,ISO 3166-2:BR,Americas,South America,019,005\r\n" + 
			"British Indian Ocean Territory,IO,IOT,086,ISO 3166-2:IO,,,,\r\n" + 
			"Brunei Darussalam,BN,BRN,096,ISO 3166-2:BN,Asia,South-Eastern Asia,142,035\r\n" + 
			"Bulgaria,BG,BGR,100,ISO 3166-2:BG,Europe,Eastern Europe,150,151\r\n" + 
			"Burkina Faso,BF,BFA,854,ISO 3166-2:BF,Africa,Western Africa,002,011\r\n" + 
			"Burundi,BI,BDI,108,ISO 3166-2:BI,Africa,Eastern Africa,002,014\r\n" + 
			"Cambodia,KH,KHM,116,ISO 3166-2:KH,Asia,South-Eastern Asia,142,035\r\n" + 
			"Cameroon,CM,CMR,120,ISO 3166-2:CM,Africa,Middle Africa,002,017\r\n" + 
			"Canada,CA,CAN,124,ISO 3166-2:CA,Americas,Northern America,019,021\r\n" + 
			"Cabo Verde,CV,CPV,132,ISO 3166-2:CV,Africa,Western Africa,002,011\r\n" + 
			"Cayman Islands,KY,CYM,136,ISO 3166-2:KY,Americas,Caribbean,019,029\r\n" + 
			"Central African Republic,CF,CAF,140,ISO 3166-2:CF,Africa,Middle Africa,002,017\r\n" + 
			"Chad,TD,TCD,148,ISO 3166-2:TD,Africa,Middle Africa,002,017\r\n" + 
			"Chile,CL,CHL,152,ISO 3166-2:CL,Americas,South America,019,005\r\n" + 
			"China,CN,CHN,156,ISO 3166-2:CN,Asia,Eastern Asia,142,030\r\n" + 
			"Christmas Island,CX,CXR,162,ISO 3166-2:CX,,,,\r\n" + 
			"Cocos (Keeling) Islands,CC,CCK,166,ISO 3166-2:CC,,,,\r\n" + 
			"Colombia,CO,COL,170,ISO 3166-2:CO,Americas,South America,019,005\r\n" + 
			"Comoros,KM,COM,174,ISO 3166-2:KM,Africa,Eastern Africa,002,014\r\n" + 
			"Congo,CG,COG,178,ISO 3166-2:CG,Africa,Middle Africa,002,017\r\n" + 
			"Congo (Democratic Republic of the),CD,COD,180,ISO 3166-2:CD,Africa,Middle Africa,002,017\r\n" + 
			"Cook Islands,CK,COK,184,ISO 3166-2:CK,Oceania,Polynesia,009,061\r\n" + 
			"Costa Rica,CR,CRI,188,ISO 3166-2:CR,Americas,Central America,019,013\r\n" + 
			"Côte d'Ivoire,CI,CIV,384,ISO 3166-2:CI,Africa,Western Africa,002,011\r\n" + 
			"Croatia,HR,HRV,191,ISO 3166-2:HR,Europe,Southern Europe,150,039\r\n" + 
			"Cuba,CU,CUB,192,ISO 3166-2:CU,Americas,Caribbean,019,029\r\n" + 
			"Curaçao,CW,CUW,531,ISO 3166-2:CW,Americas,Caribbean,019,029\r\n" + 
			"Cyprus,CY,CYP,196,ISO 3166-2:CY,Asia,Western Asia,142,145\r\n" + 
			"Czech Republic,CZ,CZE,203,ISO 3166-2:CZ,Europe,Eastern Europe,150,151\r\n" + 
			"Denmark,DK,DNK,208,ISO 3166-2:DK,Europe,Northern Europe,150,154\r\n" + 
			"Djibouti,DJ,DJI,262,ISO 3166-2:DJ,Africa,Eastern Africa,002,014\r\n" + 
			"Dominica,DM,DMA,212,ISO 3166-2:DM,Americas,Caribbean,019,029\r\n" + 
			"Dominican Republic,DO,DOM,214,ISO 3166-2:DO,Americas,Caribbean,019,029\r\n" + 
			"Ecuador,EC,ECU,218,ISO 3166-2:EC,Americas,South America,019,005\r\n" + 
			"Egypt,EG,EGY,818,ISO 3166-2:EG,Africa,Northern Africa,002,015\r\n" + 
			"El Salvador,SV,SLV,222,ISO 3166-2:SV,Americas,Central America,019,013\r\n" + 
			"Equatorial Guinea,GQ,GNQ,226,ISO 3166-2:GQ,Africa,Middle Africa,002,017\r\n" + 
			"Eritrea,ER,ERI,232,ISO 3166-2:ER,Africa,Eastern Africa,002,014\r\n" + 
			"Estonia,EE,EST,233,ISO 3166-2:EE,Europe,Northern Europe,150,154\r\n" + 
			"Ethiopia,ET,ETH,231,ISO 3166-2:ET,Africa,Eastern Africa,002,014\r\n" + 
			"Falkland Islands (Malvinas),FK,FLK,238,ISO 3166-2:FK,Americas,South America,019,005\r\n" + 
			"Faroe Islands,FO,FRO,234,ISO 3166-2:FO,Europe,Northern Europe,150,154\r\n" + 
			"Fiji,FJ,FJI,242,ISO 3166-2:FJ,Oceania,Melanesia,009,054\r\n" + 
			"Finland,FI,FIN,246,ISO 3166-2:FI,Europe,Northern Europe,150,154\r\n" + 
			"France,FR,FRA,250,ISO 3166-2:FR,Europe,Western Europe,150,155\r\n" + 
			"French Guiana,GF,GUF,254,ISO 3166-2:GF,Americas,South America,019,005\r\n" + 
			"French Polynesia,PF,PYF,258,ISO 3166-2:PF,Oceania,Polynesia,009,061\r\n" + 
			"French Southern Territories,TF,ATF,260,ISO 3166-2:TF,,,,\r\n" + 
			"Gabon,GA,GAB,266,ISO 3166-2:GA,Africa,Middle Africa,002,017\r\n" + 
			"Gambia,GM,GMB,270,ISO 3166-2:GM,Africa,Western Africa,002,011\r\n" + 
			"Georgia,GE,GEO,268,ISO 3166-2:GE,Asia,Western Asia,142,145\r\n" + 
			"Germany,DE,DEU,276,ISO 3166-2:DE,Europe,Western Europe,150,155\r\n" + 
			"Ghana,GH,GHA,288,ISO 3166-2:GH,Africa,Western Africa,002,011\r\n" + 
			"Gibraltar,GI,GIB,292,ISO 3166-2:GI,Europe,Southern Europe,150,039\r\n" + 
			"Greece,GR,GRC,300,ISO 3166-2:GR,Europe,Southern Europe,150,039\r\n" + 
			"Greenland,GL,GRL,304,ISO 3166-2:GL,Americas,Northern America,019,021\r\n" + 
			"Grenada,GD,GRD,308,ISO 3166-2:GD,Americas,Caribbean,019,029\r\n" + 
			"Guadeloupe,GP,GLP,312,ISO 3166-2:GP,Americas,Caribbean,019,029\r\n" + 
			"Guam,GU,GUM,316,ISO 3166-2:GU,Oceania,Micronesia,009,057\r\n" + 
			"Guatemala,GT,GTM,320,ISO 3166-2:GT,Americas,Central America,019,013\r\n" + 
			"Guernsey,GG,GGY,831,ISO 3166-2:GG,Europe,Northern Europe,150,154\r\n" + 
			"Guinea,GN,GIN,324,ISO 3166-2:GN,Africa,Western Africa,002,011\r\n" + 
			"Guinea-Bissau,GW,GNB,624,ISO 3166-2:GW,Africa,Western Africa,002,011\r\n" + 
			"Guyana,GY,GUY,328,ISO 3166-2:GY,Americas,South America,019,005\r\n" + 
			"Haiti,HT,HTI,332,ISO 3166-2:HT,Americas,Caribbean,019,029\r\n" + 
			"Heard Island and McDonald Islands,HM,HMD,334,ISO 3166-2:HM,,,,\r\n" + 
			"Holy See,VA,VAT,336,ISO 3166-2:VA,Europe,Southern Europe,150,039\r\n" + 
			"Honduras,HN,HND,340,ISO 3166-2:HN,Americas,Central America,019,013\r\n" + 
			"Hong Kong,HK,HKG,344,ISO 3166-2:HK,Asia,Eastern Asia,142,030\r\n" + 
			"Hungary,HU,HUN,348,ISO 3166-2:HU,Europe,Eastern Europe,150,151\r\n" + 
			"Iceland,IS,ISL,352,ISO 3166-2:IS,Europe,Northern Europe,150,154\r\n" + 
			"India,IN,IND,356,ISO 3166-2:IN,Asia,Southern Asia,142,034\r\n" + 
			"Indonesia,ID,IDN,360,ISO 3166-2:ID,Asia,South-Eastern Asia,142,035\r\n" + 
			"Iran (Islamic Republic of),IR,IRN,364,ISO 3166-2:IR,Asia,Southern Asia,142,034\r\n" + 
			"Iraq,IQ,IRQ,368,ISO 3166-2:IQ,Asia,Western Asia,142,145\r\n" + 
			"Ireland,IE,IRL,372,ISO 3166-2:IE,Europe,Northern Europe,150,154\r\n" + 
			"Isle of Man,IM,IMN,833,ISO 3166-2:IM,Europe,Northern Europe,150,154\r\n" + 
			"Israel,IL,ISR,376,ISO 3166-2:IL,Asia,Western Asia,142,145\r\n" + 
			"Italy,IT,ITA,380,ISO 3166-2:IT,Europe,Southern Europe,150,039\r\n" + 
			"Jamaica,JM,JAM,388,ISO 3166-2:JM,Americas,Caribbean,019,029\r\n" + 
			"Japan,JP,JPN,392,ISO 3166-2:JP,Asia,Eastern Asia,142,030\r\n" + 
			"Jersey,JE,JEY,832,ISO 3166-2:JE,Europe,Northern Europe,150,154\r\n" + 
			"Jordan,JO,JOR,400,ISO 3166-2:JO,Asia,Western Asia,142,145\r\n" + 
			"Kazakhstan,KZ,KAZ,398,ISO 3166-2:KZ,Asia,Central Asia,142,143\r\n" + 
			"Kenya,KE,KEN,404,ISO 3166-2:KE,Africa,Eastern Africa,002,014\r\n" + 
			"Kiribati,KI,KIR,296,ISO 3166-2:KI,Oceania,Micronesia,009,057\r\n" + 
			"Korea (Democratic People's Republic of),KP,PRK,408,ISO 3166-2:KP,Asia,Eastern Asia,142,030\r\n" + 
			"Korea (Republic of),KR,KOR,410,ISO 3166-2:KR,Asia,Eastern Asia,142,030\r\n" + 
			"Kuwait,KW,KWT,414,ISO 3166-2:KW,Asia,Western Asia,142,145\r\n" + 
			"Kyrgyzstan,KG,KGZ,417,ISO 3166-2:KG,Asia,Central Asia,142,143\r\n" + 
			"Lao People's Democratic Republic,LA,LAO,418,ISO 3166-2:LA,Asia,South-Eastern Asia,142,035\r\n" + 
			"Latvia,LV,LVA,428,ISO 3166-2:LV,Europe,Northern Europe,150,154\r\n" + 
			"Lebanon,LB,LBN,422,ISO 3166-2:LB,Asia,Western Asia,142,145\r\n" + 
			"Lesotho,LS,LSO,426,ISO 3166-2:LS,Africa,Southern Africa,002,018\r\n" + 
			"Liberia,LR,LBR,430,ISO 3166-2:LR,Africa,Western Africa,002,011\r\n" + 
			"Libya,LY,LBY,434,ISO 3166-2:LY,Africa,Northern Africa,002,015\r\n" + 
			"Liechtenstein,LI,LIE,438,ISO 3166-2:LI,Europe,Western Europe,150,155\r\n" + 
			"Lithuania,LT,LTU,440,ISO 3166-2:LT,Europe,Northern Europe,150,154\r\n" + 
			"Luxembourg,LU,LUX,442,ISO 3166-2:LU,Europe,Western Europe,150,155\r\n" + 
			"Macao,MO,MAC,446,ISO 3166-2:MO,Asia,Eastern Asia,142,030\r\n" + 
			"Macedonia (the former Yugoslav Republic of),MK,MKD,807,ISO 3166-2:MK,Europe,Southern Europe,150,039\r\n" + 
			"Madagascar,MG,MDG,450,ISO 3166-2:MG,Africa,Eastern Africa,002,014\r\n" + 
			"Malawi,MW,MWI,454,ISO 3166-2:MW,Africa,Eastern Africa,002,014\r\n" + 
			"Malaysia,MY,MYS,458,ISO 3166-2:MY,Asia,South-Eastern Asia,142,035\r\n" + 
			"Maldives,MV,MDV,462,ISO 3166-2:MV,Asia,Southern Asia,142,034\r\n" + 
			"Mali,ML,MLI,466,ISO 3166-2:ML,Africa,Western Africa,002,011\r\n" + 
			"Malta,MT,MLT,470,ISO 3166-2:MT,Europe,Southern Europe,150,039\r\n" + 
			"Marshall Islands,MH,MHL,584,ISO 3166-2:MH,Oceania,Micronesia,009,057\r\n" + 
			"Martinique,MQ,MTQ,474,ISO 3166-2:MQ,Americas,Caribbean,019,029\r\n" + 
			"Mauritania,MR,MRT,478,ISO 3166-2:MR,Africa,Western Africa,002,011\r\n" + 
			"Mauritius,MU,MUS,480,ISO 3166-2:MU,Africa,Eastern Africa,002,014\r\n" + 
			"Mayotte,YT,MYT,175,ISO 3166-2:YT,Africa,Eastern Africa,002,014\r\n" + 
			"Mexico,MX,MEX,484,ISO 3166-2:MX,Americas,Central America,019,013\r\n" + 
			"Micronesia (Federated States of),FM,FSM,583,ISO 3166-2:FM,Oceania,Micronesia,009,057\r\n" + 
			"Moldova (Republic of),MD,MDA,498,ISO 3166-2:MD,Europe,Eastern Europe,150,151\r\n" + 
			"Monaco,MC,MCO,492,ISO 3166-2:MC,Europe,Western Europe,150,155\r\n" + 
			"Mongolia,MN,MNG,496,ISO 3166-2:MN,Asia,Eastern Asia,142,030\r\n" + 
			"Montenegro,ME,MNE,499,ISO 3166-2:ME,Europe,Southern Europe,150,039\r\n" + 
			"Montserrat,MS,MSR,500,ISO 3166-2:MS,Americas,Caribbean,019,029\r\n" + 
			"Morocco,MA,MAR,504,ISO 3166-2:MA,Africa,Northern Africa,002,015\r\n" + 
			"Mozambique,MZ,MOZ,508,ISO 3166-2:MZ,Africa,Eastern Africa,002,014\r\n" + 
			"Myanmar,MM,MMR,104,ISO 3166-2:MM,Asia,South-Eastern Asia,142,035\r\n" + 
			"Namibia,NA,NAM,516,ISO 3166-2:NA,Africa,Southern Africa,002,018\r\n" + 
			"Nauru,NR,NRU,520,ISO 3166-2:NR,Oceania,Micronesia,009,057\r\n" + 
			"Nepal,NP,NPL,524,ISO 3166-2:NP,Asia,Southern Asia,142,034\r\n" + 
			"Netherlands,NL,NLD,528,ISO 3166-2:NL,Europe,Western Europe,150,155\r\n" + 
			"New Caledonia,NC,NCL,540,ISO 3166-2:NC,Oceania,Melanesia,009,054\r\n" + 
			"New Zealand,NZ,NZL,554,ISO 3166-2:NZ,Oceania,Australia and New Zealand,009,053\r\n" + 
			"Nicaragua,NI,NIC,558,ISO 3166-2:NI,Americas,Central America,019,013\r\n" + 
			"Niger,NE,NER,562,ISO 3166-2:NE,Africa,Western Africa,002,011\r\n" + 
			"Nigeria,NG,NGA,566,ISO 3166-2:NG,Africa,Western Africa,002,011\r\n" + 
			"Niue,NU,NIU,570,ISO 3166-2:NU,Oceania,Polynesia,009,061\r\n" + 
			"Norfolk Island,NF,NFK,574,ISO 3166-2:NF,Oceania,Australia and New Zealand,009,053\r\n" + 
			"Northern Mariana Islands,MP,MNP,580,ISO 3166-2:MP,Oceania,Micronesia,009,057\r\n" + 
			"Norway,NO,NOR,578,ISO 3166-2:NO,Europe,Northern Europe,150,154\r\n" + 
			"Oman,OM,OMN,512,ISO 3166-2:OM,Asia,Western Asia,142,145\r\n" + 
			"Pakistan,PK,PAK,586,ISO 3166-2:PK,Asia,Southern Asia,142,034\r\n" + 
			"Palau,PW,PLW,585,ISO 3166-2:PW,Oceania,Micronesia,009,057\r\n" + 
			"\"Palestine, State of\",PS,PSE,275,ISO 3166-2:PS,Asia,Western Asia,142,145\r\n" + 
			"Panama,PA,PAN,591,ISO 3166-2:PA,Americas,Central America,019,013\r\n" + 
			"Papua New Guinea,PG,PNG,598,ISO 3166-2:PG,Oceania,Melanesia,009,054\r\n" + 
			"Paraguay,PY,PRY,600,ISO 3166-2:PY,Americas,South America,019,005\r\n" + 
			"Peru,PE,PER,604,ISO 3166-2:PE,Americas,South America,019,005\r\n" + 
			"Philippines,PH,PHL,608,ISO 3166-2:PH,Asia,South-Eastern Asia,142,035\r\n" + 
			"Pitcairn,PN,PCN,612,ISO 3166-2:PN,Oceania,Polynesia,009,061\r\n" + 
			"Poland,PL,POL,616,ISO 3166-2:PL,Europe,Eastern Europe,150,151\r\n" + 
			"Portugal,PT,PRT,620,ISO 3166-2:PT,Europe,Southern Europe,150,039\r\n" + 
			"Puerto Rico,PR,PRI,630,ISO 3166-2:PR,Americas,Caribbean,019,029\r\n" + 
			"Qatar,QA,QAT,634,ISO 3166-2:QA,Asia,Western Asia,142,145\r\n" + 
			"Réunion,RE,REU,638,ISO 3166-2:RE,Africa,Eastern Africa,002,014\r\n" + 
			"Romania,RO,ROU,642,ISO 3166-2:RO,Europe,Eastern Europe,150,151\r\n" + 
			"Russian Federation,RU,RUS,643,ISO 3166-2:RU,Europe,Eastern Europe,150,151\r\n" + 
			"Rwanda,RW,RWA,646,ISO 3166-2:RW,Africa,Eastern Africa,002,014\r\n" + 
			"Saint Barthélemy,BL,BLM,652,ISO 3166-2:BL,Americas,Caribbean,019,029\r\n" + 
			"\"Saint Helena, Ascension and Tristan da Cunha\",SH,SHN,654,ISO 3166-2:SH,Africa,Western Africa,002,011\r\n" + 
			"Saint Kitts and Nevis,KN,KNA,659,ISO 3166-2:KN,Americas,Caribbean,019,029\r\n" + 
			"Saint Lucia,LC,LCA,662,ISO 3166-2:LC,Americas,Caribbean,019,029\r\n" + 
			"Saint Martin (French part),MF,MAF,663,ISO 3166-2:MF,Americas,Caribbean,019,029\r\n" + 
			"Saint Pierre and Miquelon,PM,SPM,666,ISO 3166-2:PM,Americas,Northern America,019,021\r\n" + 
			"Saint Vincent and the Grenadines,VC,VCT,670,ISO 3166-2:VC,Americas,Caribbean,019,029\r\n" + 
			"Samoa,WS,WSM,882,ISO 3166-2:WS,Oceania,Polynesia,009,061\r\n" + 
			"San Marino,SM,SMR,674,ISO 3166-2:SM,Europe,Southern Europe,150,039\r\n" + 
			"Sao Tome and Principe,ST,STP,678,ISO 3166-2:ST,Africa,Middle Africa,002,017\r\n" + 
			"Saudi Arabia,SA,SAU,682,ISO 3166-2:SA,Asia,Western Asia,142,145\r\n" + 
			"Senegal,SN,SEN,686,ISO 3166-2:SN,Africa,Western Africa,002,011\r\n" + 
			"Serbia,RS,SRB,688,ISO 3166-2:RS,Europe,Southern Europe,150,039\r\n" + 
			"Seychelles,SC,SYC,690,ISO 3166-2:SC,Africa,Eastern Africa,002,014\r\n" + 
			"Sierra Leone,SL,SLE,694,ISO 3166-2:SL,Africa,Western Africa,002,011\r\n" + 
			"Singapore,SG,SGP,702,ISO 3166-2:SG,Asia,South-Eastern Asia,142,035\r\n" + 
			"Sint Maarten (Dutch part),SX,SXM,534,ISO 3166-2:SX,Americas,Caribbean,019,029\r\n" + 
			"Slovakia,SK,SVK,703,ISO 3166-2:SK,Europe,Eastern Europe,150,151\r\n" + 
			"Slovenia,SI,SVN,705,ISO 3166-2:SI,Europe,Southern Europe,150,039\r\n" + 
			"Solomon Islands,SB,SLB,090,ISO 3166-2:SB,Oceania,Melanesia,009,054\r\n" + 
			"Somalia,SO,SOM,706,ISO 3166-2:SO,Africa,Eastern Africa,002,014\r\n" + 
			"South Africa,ZA,ZAF,710,ISO 3166-2:ZA,Africa,Southern Africa,002,018\r\n" + 
			"South Georgia and the South Sandwich Islands,GS,SGS,239,ISO 3166-2:GS,,,,\r\n" + 
			"South Sudan,SS,SSD,728,ISO 3166-2:SS,Africa,Eastern Africa,002,014\r\n" + 
			"Spain,ES,ESP,724,ISO 3166-2:ES,Europe,Southern Europe,150,039\r\n" + 
			"Sri Lanka,LK,LKA,144,ISO 3166-2:LK,Asia,Southern Asia,142,034\r\n" + 
			"Sudan,SD,SDN,729,ISO 3166-2:SD,Africa,Northern Africa,002,015\r\n" + 
			"Suriname,SR,SUR,740,ISO 3166-2:SR,Americas,South America,019,005\r\n" + 
			"Svalbard and Jan Mayen,SJ,SJM,744,ISO 3166-2:SJ,Europe,Northern Europe,150,154\r\n" + 
			"Swaziland,SZ,SWZ,748,ISO 3166-2:SZ,Africa,Southern Africa,002,018\r\n" + 
			"Sweden,SE,SWE,752,ISO 3166-2:SE,Europe,Northern Europe,150,154\r\n" + 
			"Switzerland,CH,CHE,756,ISO 3166-2:CH,Europe,Western Europe,150,155\r\n" + 
			"Syrian Arab Republic,SY,SYR,760,ISO 3166-2:SY,Asia,Western Asia,142,145\r\n" + 
			"\"Taiwan, Province of China\",TW,TWN,158,ISO 3166-2:TW,Asia,Eastern Asia,142,030\r\n" + 
			"Tajikistan,TJ,TJK,762,ISO 3166-2:TJ,Asia,Central Asia,142,143\r\n" + 
			"\"Tanzania, United Republic of\",TZ,TZA,834,ISO 3166-2:TZ,Africa,Eastern Africa,002,014\r\n" + 
			"Thailand,TH,THA,764,ISO 3166-2:TH,Asia,South-Eastern Asia,142,035\r\n" + 
			"Timor-Leste,TL,TLS,626,ISO 3166-2:TL,Asia,South-Eastern Asia,142,035\r\n" + 
			"Togo,TG,TGO,768,ISO 3166-2:TG,Africa,Western Africa,002,011\r\n" + 
			"Tokelau,TK,TKL,772,ISO 3166-2:TK,Oceania,Polynesia,009,061\r\n" + 
			"Tonga,TO,TON,776,ISO 3166-2:TO,Oceania,Polynesia,009,061\r\n" + 
			"Trinidad and Tobago,TT,TTO,780,ISO 3166-2:TT,Americas,Caribbean,019,029\r\n" + 
			"Tunisia,TN,TUN,788,ISO 3166-2:TN,Africa,Northern Africa,002,015\r\n" + 
			"Turkey,TR,TUR,792,ISO 3166-2:TR,Asia,Western Asia,142,145\r\n" + 
			"Turkmenistan,TM,TKM,795,ISO 3166-2:TM,Asia,Central Asia,142,143\r\n" + 
			"Turks and Caicos Islands,TC,TCA,796,ISO 3166-2:TC,Americas,Caribbean,019,029\r\n" + 
			"Tuvalu,TV,TUV,798,ISO 3166-2:TV,Oceania,Polynesia,009,061\r\n" + 
			"Uganda,UG,UGA,800,ISO 3166-2:UG,Africa,Eastern Africa,002,014\r\n" + 
			"Ukraine,UA,UKR,804,ISO 3166-2:UA,Europe,Eastern Europe,150,151\r\n" + 
			"United Arab Emirates,AE,ARE,784,ISO 3166-2:AE,Asia,Western Asia,142,145\r\n" + 
			"United Kingdom of Great Britain and Northern Ireland,GB,GBR,826,ISO 3166-2:GB,Europe,Northern Europe,150,154\r\n" + 
			"United States of America,US,USA,840,ISO 3166-2:US,Americas,Northern America,019,021\r\n" + 
			"United States Minor Outlying Islands,UM,UMI,581,ISO 3166-2:UM,,,,\r\n" + 
			"Uruguay,UY,URY,858,ISO 3166-2:UY,Americas,South America,019,005\r\n" + 
			"Uzbekistan,UZ,UZB,860,ISO 3166-2:UZ,Asia,Central Asia,142,143\r\n" + 
			"Vanuatu,VU,VUT,548,ISO 3166-2:VU,Oceania,Melanesia,009,054\r\n" + 
			"Venezuela (Bolivarian Republic of),VE,VEN,862,ISO 3166-2:VE,Americas,South America,019,005\r\n" + 
			"Viet Nam,VN,VNM,704,ISO 3166-2:VN,Asia,South-Eastern Asia,142,035\r\n" + 
			"Virgin Islands (British),VG,VGB,092,ISO 3166-2:VG,Americas,Caribbean,019,029\r\n" + 
			"Virgin Islands (U.S.),VI,VIR,850,ISO 3166-2:VI,Americas,Caribbean,019,029\r\n" + 
			"Wallis and Futuna,WF,WLF,876,ISO 3166-2:WF,Oceania,Polynesia,009,061\r\n" + 
			"Western Sahara,EH,ESH,732,ISO 3166-2:EH,Africa,Northern Africa,002,015\r\n" + 
			"Yemen,YE,YEM,887,ISO 3166-2:YE,Asia,Western Asia,142,145\r\n" + 
			"Zambia,ZM,ZMB,894,ISO 3166-2:ZM,Africa,Eastern Africa,002,014\r\n" + 
			"Zimbabwe,ZW,ZWE,716,ISO 3166-2:ZW,Africa,Eastern Africa,002,014";
	
	public final String alpha2code;
	public final String alpha3code;
	public final String numCode;
	public final String name;
	private Country(String alpha2code, String alpha3code, String numCode, String name) {
		this.alpha2code = alpha2code;
		this.alpha3code = alpha3code;
		this.numCode = numCode;
		this.name = name;
	}
}
