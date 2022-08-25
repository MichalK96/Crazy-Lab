package com.example.crazylab.map;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Tiles {


    public static int TILE_WIDTH = 32;


    public static class Tile {
        public final int x, y, w, h;

        Tile(int i, int j) {
            x = i * (TILE_WIDTH + 2);
            y = j * (TILE_WIDTH + 2);
            w = TILE_WIDTH;
            h = TILE_WIDTH;
        }

    }


//return tile as png
    //zczytac mape z txt
    //wrzucucic na grida

    public BufferedImage getImage(String tileName) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/hospitalDesign.png")));
        return switch (tileName) {
            case "0" -> bufferedImage.getSubimage(0, 0, TILE_WIDTH, TILE_WIDTH);
            case "1" -> bufferedImage.getSubimage(32, 0, TILE_WIDTH, TILE_WIDTH);
            case "2" -> bufferedImage.getSubimage(64, 0, TILE_WIDTH, TILE_WIDTH);
            case "3" -> bufferedImage.getSubimage(96, 0, TILE_WIDTH, TILE_WIDTH);
            case "4" -> bufferedImage.getSubimage(128, 0, TILE_WIDTH, TILE_WIDTH);
            case "5" -> bufferedImage.getSubimage(160, 0, TILE_WIDTH, TILE_WIDTH);
            case "6" -> bufferedImage.getSubimage(192, 0, TILE_WIDTH, TILE_WIDTH);
            case "7" -> bufferedImage.getSubimage(224, 0, TILE_WIDTH, TILE_WIDTH);
            case "8" -> bufferedImage.getSubimage(256, 0, TILE_WIDTH, TILE_WIDTH);
            case "9" -> bufferedImage.getSubimage(288, 0, TILE_WIDTH, TILE_WIDTH);
            case "10" -> bufferedImage.getSubimage(320, 0, TILE_WIDTH, TILE_WIDTH);
            case "11" -> bufferedImage.getSubimage(352, 0, TILE_WIDTH, TILE_WIDTH);
            case "12" -> bufferedImage.getSubimage(384, 0, TILE_WIDTH, TILE_WIDTH);
            case "13" -> bufferedImage.getSubimage(416, 0, TILE_WIDTH, TILE_WIDTH);
            case "14" -> bufferedImage.getSubimage(448, 0, TILE_WIDTH, TILE_WIDTH);

            case "15" -> bufferedImage.getSubimage(0, 32, TILE_WIDTH, TILE_WIDTH);
            case "16" -> bufferedImage.getSubimage(32, 32, TILE_WIDTH, TILE_WIDTH);
            case "17" -> bufferedImage.getSubimage(64, 32, TILE_WIDTH, TILE_WIDTH);
            case "18" -> bufferedImage.getSubimage(96, 32, TILE_WIDTH, TILE_WIDTH);
            case "19" -> bufferedImage.getSubimage(128, 32, TILE_WIDTH, TILE_WIDTH);
            case "20" -> bufferedImage.getSubimage(160, 32, TILE_WIDTH, TILE_WIDTH);
            case "21" -> bufferedImage.getSubimage(192, 32, TILE_WIDTH, TILE_WIDTH);
            case "22" -> bufferedImage.getSubimage(224, 32, TILE_WIDTH, TILE_WIDTH);
            case "23" -> bufferedImage.getSubimage(256, 32, TILE_WIDTH, TILE_WIDTH);
            case "24" -> bufferedImage.getSubimage(288, 32, TILE_WIDTH, TILE_WIDTH);
            case "25" -> bufferedImage.getSubimage(320, 32, TILE_WIDTH, TILE_WIDTH);
            case "26" -> bufferedImage.getSubimage(352, 32, TILE_WIDTH, TILE_WIDTH);
            case "27" -> bufferedImage.getSubimage(384, 32, TILE_WIDTH, TILE_WIDTH);
            case "28" -> bufferedImage.getSubimage(416, 32, TILE_WIDTH, TILE_WIDTH);
            case "29" -> bufferedImage.getSubimage(448, 32, TILE_WIDTH, TILE_WIDTH);

            case "30" -> bufferedImage.getSubimage(0, 64, TILE_WIDTH, TILE_WIDTH);
            case "31" -> bufferedImage.getSubimage(32, 64, TILE_WIDTH, TILE_WIDTH);
            case "32" -> bufferedImage.getSubimage(64, 64, TILE_WIDTH, TILE_WIDTH);
            case "33" -> bufferedImage.getSubimage(96, 64, TILE_WIDTH, TILE_WIDTH);
            case "34" -> bufferedImage.getSubimage(128, 64, TILE_WIDTH, TILE_WIDTH);
            case "35" -> bufferedImage.getSubimage(160, 64, TILE_WIDTH, TILE_WIDTH);
            case "36" -> bufferedImage.getSubimage(192, 64, TILE_WIDTH, TILE_WIDTH);
            case "37" -> bufferedImage.getSubimage(224, 64, TILE_WIDTH, TILE_WIDTH);
            case "38" -> bufferedImage.getSubimage(256, 64, TILE_WIDTH, TILE_WIDTH);
            case "39" -> bufferedImage.getSubimage(288, 64, TILE_WIDTH, TILE_WIDTH);
            case "40" -> bufferedImage.getSubimage(320, 64, TILE_WIDTH, TILE_WIDTH);
            case "41" -> bufferedImage.getSubimage(352, 64, TILE_WIDTH, TILE_WIDTH);
            case "42" -> bufferedImage.getSubimage(384, 64, TILE_WIDTH, TILE_WIDTH);
            case "43" -> bufferedImage.getSubimage(416, 64, TILE_WIDTH, TILE_WIDTH);
            case "44" -> bufferedImage.getSubimage(448, 64, TILE_WIDTH, TILE_WIDTH);

            case "45" -> bufferedImage.getSubimage(0, 96, TILE_WIDTH, TILE_WIDTH);
            case "46" -> bufferedImage.getSubimage(32, 96, TILE_WIDTH, TILE_WIDTH);
            case "47" -> bufferedImage.getSubimage(64, 96, TILE_WIDTH, TILE_WIDTH);
            case "48" -> bufferedImage.getSubimage(96, 96, TILE_WIDTH, TILE_WIDTH);
            case "49" -> bufferedImage.getSubimage(128,96, TILE_WIDTH, TILE_WIDTH);
            case "50" -> bufferedImage.getSubimage(160,96, TILE_WIDTH, TILE_WIDTH);
            case "51" -> bufferedImage.getSubimage(192, 96, TILE_WIDTH, TILE_WIDTH);
            case "52" -> bufferedImage.getSubimage(224, 96, TILE_WIDTH, TILE_WIDTH);
            case "53" -> bufferedImage.getSubimage(256, 96, TILE_WIDTH, TILE_WIDTH);
            case "54" -> bufferedImage.getSubimage(288, 96, TILE_WIDTH, TILE_WIDTH);
            case "55" -> bufferedImage.getSubimage(320, 96, TILE_WIDTH, TILE_WIDTH);
            case "56" -> bufferedImage.getSubimage(352, 96, TILE_WIDTH, TILE_WIDTH);
            case "57" -> bufferedImage.getSubimage(384, 96, TILE_WIDTH, TILE_WIDTH);
            case "58" -> bufferedImage.getSubimage(416, 96, TILE_WIDTH, TILE_WIDTH);
            case "59" -> bufferedImage.getSubimage(448, 96, TILE_WIDTH, TILE_WIDTH);

            case "60" -> bufferedImage.getSubimage(0, 128, TILE_WIDTH, TILE_WIDTH);
            case "61" -> bufferedImage.getSubimage(32, 128, TILE_WIDTH, TILE_WIDTH);
            case "62" -> bufferedImage.getSubimage(64, 128, TILE_WIDTH, TILE_WIDTH);
            case "63" -> bufferedImage.getSubimage(96, 128, TILE_WIDTH, TILE_WIDTH);
            case "64" -> bufferedImage.getSubimage(128, 128, TILE_WIDTH, TILE_WIDTH);
            case "65" -> bufferedImage.getSubimage(160, 128, TILE_WIDTH, TILE_WIDTH);
            case "66" -> bufferedImage.getSubimage(192, 128, TILE_WIDTH, TILE_WIDTH);
            case "67" -> bufferedImage.getSubimage(224, 128, TILE_WIDTH, TILE_WIDTH);
            case "68" -> bufferedImage.getSubimage(256, 128, TILE_WIDTH, TILE_WIDTH);
            case "69" -> bufferedImage.getSubimage(288, 128, TILE_WIDTH, TILE_WIDTH);
            case "70" -> bufferedImage.getSubimage(320, 128, TILE_WIDTH, TILE_WIDTH);
            case "71" -> bufferedImage.getSubimage(352, 128, TILE_WIDTH, TILE_WIDTH);
            case "72" -> bufferedImage.getSubimage(384, 128, TILE_WIDTH, TILE_WIDTH);
            case "73" -> bufferedImage.getSubimage(416, 128, TILE_WIDTH, TILE_WIDTH);
            case "74" -> bufferedImage.getSubimage(448, 128, TILE_WIDTH, TILE_WIDTH);

            case "75" -> bufferedImage.getSubimage(0, 160, TILE_WIDTH, TILE_WIDTH);
            case "76" -> bufferedImage.getSubimage(32, 160, TILE_WIDTH, TILE_WIDTH);
            case "77" -> bufferedImage.getSubimage(64, 160, TILE_WIDTH, TILE_WIDTH);
            case "78" -> bufferedImage.getSubimage(96,160, TILE_WIDTH, TILE_WIDTH);
            case "79" -> bufferedImage.getSubimage(128,160, TILE_WIDTH, TILE_WIDTH);
            case "80" -> bufferedImage.getSubimage(160,160, TILE_WIDTH, TILE_WIDTH);
            case "81" -> bufferedImage.getSubimage(192,160, TILE_WIDTH, TILE_WIDTH);
            case "82" -> bufferedImage.getSubimage(224,160, TILE_WIDTH, TILE_WIDTH);
            case "83" -> bufferedImage.getSubimage(256,160, TILE_WIDTH, TILE_WIDTH);
            case "84" -> bufferedImage.getSubimage(288,160, TILE_WIDTH, TILE_WIDTH);
            case "85" -> bufferedImage.getSubimage(320,160, TILE_WIDTH, TILE_WIDTH);
            case "86" -> bufferedImage.getSubimage(352,160, TILE_WIDTH, TILE_WIDTH);
            case "87" -> bufferedImage.getSubimage(384,160, TILE_WIDTH, TILE_WIDTH);
            case "88" -> bufferedImage.getSubimage(416,160, TILE_WIDTH, TILE_WIDTH);
            case "89" -> bufferedImage.getSubimage(448,160, TILE_WIDTH, TILE_WIDTH);

            case "90" -> bufferedImage.getSubimage(0,   192, TILE_WIDTH, TILE_WIDTH);
            case "91" -> bufferedImage.getSubimage(32,  192, TILE_WIDTH, TILE_WIDTH);
            case "92" -> bufferedImage.getSubimage(64,  192, TILE_WIDTH, TILE_WIDTH);
            case "93" -> bufferedImage.getSubimage(96,  192, TILE_WIDTH, TILE_WIDTH);
            case "94" -> bufferedImage.getSubimage(128, 192, TILE_WIDTH, TILE_WIDTH);
            case "95" -> bufferedImage.getSubimage(160, 192, TILE_WIDTH, TILE_WIDTH);
            case "96" -> bufferedImage.getSubimage(192, 192, TILE_WIDTH, TILE_WIDTH);
            case "97" -> bufferedImage.getSubimage(224, 192, TILE_WIDTH, TILE_WIDTH);
            case "98" -> bufferedImage.getSubimage(256, 192, TILE_WIDTH, TILE_WIDTH);
            case "99" -> bufferedImage.getSubimage(288, 192, TILE_WIDTH, TILE_WIDTH);
            case "100" -> bufferedImage.getSubimage(320, 192, TILE_WIDTH, TILE_WIDTH);
            case "101" -> bufferedImage.getSubimage(352, 192, TILE_WIDTH, TILE_WIDTH);
            case "102" -> bufferedImage.getSubimage(384, 192, TILE_WIDTH, TILE_WIDTH);
            case "103" -> bufferedImage.getSubimage(416, 192, TILE_WIDTH, TILE_WIDTH);
            case "104" -> bufferedImage.getSubimage(448, 192, TILE_WIDTH, TILE_WIDTH);

            case "105" -> bufferedImage.getSubimage(0,  224, TILE_WIDTH, TILE_WIDTH);
            case "106" -> bufferedImage.getSubimage(32, 224, TILE_WIDTH, TILE_WIDTH);
            case "107" -> bufferedImage.getSubimage(64, 224, TILE_WIDTH, TILE_WIDTH);
            case "108" -> bufferedImage.getSubimage(96, 224, TILE_WIDTH, TILE_WIDTH);
            case "109" -> bufferedImage.getSubimage(128,224, TILE_WIDTH, TILE_WIDTH);
            case "110" -> bufferedImage.getSubimage(160,224, TILE_WIDTH, TILE_WIDTH);
            case "111" -> bufferedImage.getSubimage(192,224, TILE_WIDTH, TILE_WIDTH);
            case "112" -> bufferedImage.getSubimage(224,224, TILE_WIDTH, TILE_WIDTH);
            case "113" -> bufferedImage.getSubimage(256,224, TILE_WIDTH, TILE_WIDTH);
            case "114" -> bufferedImage.getSubimage(288,224, TILE_WIDTH, TILE_WIDTH);
            case "115" -> bufferedImage.getSubimage(320,224, TILE_WIDTH, TILE_WIDTH);
            case "116" -> bufferedImage.getSubimage(352,224, TILE_WIDTH, TILE_WIDTH);
            case "117" -> bufferedImage.getSubimage(384,224, TILE_WIDTH, TILE_WIDTH);
            case "118" -> bufferedImage.getSubimage(416,224, TILE_WIDTH, TILE_WIDTH);
            case "119" -> bufferedImage.getSubimage(448,224, TILE_WIDTH, TILE_WIDTH);

            case "120" -> bufferedImage.getSubimage(0,   256, TILE_WIDTH, TILE_WIDTH);
            case "121" -> bufferedImage.getSubimage(32,  256, TILE_WIDTH, TILE_WIDTH);
            case "122" -> bufferedImage.getSubimage(64,  256, TILE_WIDTH, TILE_WIDTH);
            case "123" -> bufferedImage.getSubimage(96,  256, TILE_WIDTH, TILE_WIDTH);
            case "124" -> bufferedImage.getSubimage(128, 256, TILE_WIDTH, TILE_WIDTH);
            case "125" -> bufferedImage.getSubimage(160, 256, TILE_WIDTH, TILE_WIDTH);
            case "126" -> bufferedImage.getSubimage(192, 256, TILE_WIDTH, TILE_WIDTH);
            case "127" -> bufferedImage.getSubimage(224, 256, TILE_WIDTH, TILE_WIDTH);
            case "128" -> bufferedImage.getSubimage(256, 256, TILE_WIDTH, TILE_WIDTH);
            case "129" -> bufferedImage.getSubimage(288, 256, TILE_WIDTH, TILE_WIDTH);
            case "130" -> bufferedImage.getSubimage(320, 256, TILE_WIDTH, TILE_WIDTH);
            case "131" -> bufferedImage.getSubimage(352, 256, TILE_WIDTH, TILE_WIDTH);
            case "132" -> bufferedImage.getSubimage(384, 256, TILE_WIDTH, TILE_WIDTH);
            case "133" -> bufferedImage.getSubimage(416, 256, TILE_WIDTH, TILE_WIDTH);
            case "134" -> bufferedImage.getSubimage(448, 256, TILE_WIDTH, TILE_WIDTH);

            case "135" -> bufferedImage.getSubimage(0,  288, TILE_WIDTH, TILE_WIDTH);
            case "136" -> bufferedImage.getSubimage(32, 288, TILE_WIDTH, TILE_WIDTH);
            case "137" -> bufferedImage.getSubimage(64, 288, TILE_WIDTH, TILE_WIDTH);
            case "138" -> bufferedImage.getSubimage(96, 288, TILE_WIDTH, TILE_WIDTH);
            case "139" -> bufferedImage.getSubimage(128,288, TILE_WIDTH, TILE_WIDTH);
            case "140" -> bufferedImage.getSubimage(160,288, TILE_WIDTH, TILE_WIDTH);
            case "141" -> bufferedImage.getSubimage(192,288, TILE_WIDTH, TILE_WIDTH);
            case "142" -> bufferedImage.getSubimage(224,288, TILE_WIDTH, TILE_WIDTH);
            case "143" -> bufferedImage.getSubimage(256,288, TILE_WIDTH, TILE_WIDTH);
            case "144" -> bufferedImage.getSubimage(288,288, TILE_WIDTH, TILE_WIDTH);
            case "145" -> bufferedImage.getSubimage(320,288, TILE_WIDTH, TILE_WIDTH);
            case "146" -> bufferedImage.getSubimage(352,288, TILE_WIDTH, TILE_WIDTH);
            case "147" -> bufferedImage.getSubimage(384,288, TILE_WIDTH, TILE_WIDTH);
            case "148" -> bufferedImage.getSubimage(416,288, TILE_WIDTH, TILE_WIDTH);
            case "149" -> bufferedImage.getSubimage(448,288, TILE_WIDTH, TILE_WIDTH);

            case "150" -> bufferedImage.getSubimage(0,   320, TILE_WIDTH, TILE_WIDTH);
            case "151" -> bufferedImage.getSubimage(32,  320, TILE_WIDTH, TILE_WIDTH);
            case "152" -> bufferedImage.getSubimage(64,  320, TILE_WIDTH, TILE_WIDTH);
            case "153" -> bufferedImage.getSubimage(96,  320, TILE_WIDTH, TILE_WIDTH);
            case "154" -> bufferedImage.getSubimage(128, 320, TILE_WIDTH, TILE_WIDTH);
            case "155" -> bufferedImage.getSubimage(160, 320, TILE_WIDTH, TILE_WIDTH);
            case "156" -> bufferedImage.getSubimage(192, 320, TILE_WIDTH, TILE_WIDTH);
            case "157" -> bufferedImage.getSubimage(224, 320, TILE_WIDTH, TILE_WIDTH);
            case "158" -> bufferedImage.getSubimage(256, 320, TILE_WIDTH, TILE_WIDTH);
            case "159" -> bufferedImage.getSubimage(288, 320, TILE_WIDTH, TILE_WIDTH);
            case "160" -> bufferedImage.getSubimage(320, 320, TILE_WIDTH, TILE_WIDTH);
            case "161" -> bufferedImage.getSubimage(352, 320, TILE_WIDTH, TILE_WIDTH);
            case "162" -> bufferedImage.getSubimage(384, 320, TILE_WIDTH, TILE_WIDTH);
            case "163" -> bufferedImage.getSubimage(416, 320, TILE_WIDTH, TILE_WIDTH);
            case "164" -> bufferedImage.getSubimage(448, 320, TILE_WIDTH, TILE_WIDTH);


            case "165" -> bufferedImage.getSubimage(0,  352, TILE_WIDTH, TILE_WIDTH);
            case "166" -> bufferedImage.getSubimage(32, 352, TILE_WIDTH, TILE_WIDTH);
            case "167" -> bufferedImage.getSubimage(64, 352, TILE_WIDTH, TILE_WIDTH);
            case "168" -> bufferedImage.getSubimage(96, 352, TILE_WIDTH, TILE_WIDTH);
            case "169" -> bufferedImage.getSubimage(128,352, TILE_WIDTH, TILE_WIDTH);
            case "170" -> bufferedImage.getSubimage(160,352, TILE_WIDTH, TILE_WIDTH);
            case "171" -> bufferedImage.getSubimage(192,352, TILE_WIDTH, TILE_WIDTH);
            case "172" -> bufferedImage.getSubimage(224,352, TILE_WIDTH, TILE_WIDTH);
            case "173" -> bufferedImage.getSubimage(256,352, TILE_WIDTH, TILE_WIDTH);
            case "174" -> bufferedImage.getSubimage(288,352, TILE_WIDTH, TILE_WIDTH);
            case "175" -> bufferedImage.getSubimage(320,352, TILE_WIDTH, TILE_WIDTH);
            case "176" -> bufferedImage.getSubimage(352,352, TILE_WIDTH, TILE_WIDTH);
            case "177" -> bufferedImage.getSubimage(384,352, TILE_WIDTH, TILE_WIDTH);
            case "178" -> bufferedImage.getSubimage(416,352, TILE_WIDTH, TILE_WIDTH);
            case "179" -> bufferedImage.getSubimage(448,352, TILE_WIDTH, TILE_WIDTH);

            case "180" -> bufferedImage.getSubimage(0,   384, TILE_WIDTH, TILE_WIDTH);
            case "181" -> bufferedImage.getSubimage(32,  384, TILE_WIDTH, TILE_WIDTH);
            case "182" -> bufferedImage.getSubimage(64,  384, TILE_WIDTH, TILE_WIDTH);
            case "183" -> bufferedImage.getSubimage(96,  384, TILE_WIDTH, TILE_WIDTH);
            case "184" -> bufferedImage.getSubimage(128, 384, TILE_WIDTH, TILE_WIDTH);
            case "185" -> bufferedImage.getSubimage(160, 384, TILE_WIDTH, TILE_WIDTH);
            case "186" -> bufferedImage.getSubimage(192, 384, TILE_WIDTH, TILE_WIDTH);
            case "187" -> bufferedImage.getSubimage(224, 384, TILE_WIDTH, TILE_WIDTH);
            case "188" -> bufferedImage.getSubimage(256, 384, TILE_WIDTH, TILE_WIDTH);
            case "189" -> bufferedImage.getSubimage(288, 384, TILE_WIDTH, TILE_WIDTH);
            case "190" -> bufferedImage.getSubimage(320, 384, TILE_WIDTH, TILE_WIDTH);
            case "191" -> bufferedImage.getSubimage(352, 384, TILE_WIDTH, TILE_WIDTH);
            case "192" -> bufferedImage.getSubimage(384, 384, TILE_WIDTH, TILE_WIDTH);
            case "193" -> bufferedImage.getSubimage(416, 384, TILE_WIDTH, TILE_WIDTH);
            case "194" -> bufferedImage.getSubimage(448, 384, TILE_WIDTH, TILE_WIDTH);

            case "195" -> bufferedImage.getSubimage(0,  416, TILE_WIDTH, TILE_WIDTH);
            case "196" -> bufferedImage.getSubimage(32, 416, TILE_WIDTH, TILE_WIDTH);
            case "197" -> bufferedImage.getSubimage(64, 416, TILE_WIDTH, TILE_WIDTH);
            case "198" -> bufferedImage.getSubimage(96, 416, TILE_WIDTH, TILE_WIDTH);
            case "199" -> bufferedImage.getSubimage(128,416, TILE_WIDTH, TILE_WIDTH);
            case "200" -> bufferedImage.getSubimage(160,416, TILE_WIDTH, TILE_WIDTH);
            case "201" -> bufferedImage.getSubimage(192,416, TILE_WIDTH, TILE_WIDTH);
            case "202" -> bufferedImage.getSubimage(224,416, TILE_WIDTH, TILE_WIDTH);
            case "203" -> bufferedImage.getSubimage(256,416, TILE_WIDTH, TILE_WIDTH);
            case "204" -> bufferedImage.getSubimage(288,416, TILE_WIDTH, TILE_WIDTH);
            case "205" -> bufferedImage.getSubimage(320,416, TILE_WIDTH, TILE_WIDTH);
            case "206" -> bufferedImage.getSubimage(352,416, TILE_WIDTH, TILE_WIDTH);
            case "207" -> bufferedImage.getSubimage(384,416, TILE_WIDTH, TILE_WIDTH);
            case "208" -> bufferedImage.getSubimage(416,416, TILE_WIDTH, TILE_WIDTH);
            case "209" -> bufferedImage.getSubimage(448,416, TILE_WIDTH, TILE_WIDTH);

            case "210" -> bufferedImage.getSubimage(0,   448, TILE_WIDTH, TILE_WIDTH);
            case "211" -> bufferedImage.getSubimage(32,  448, TILE_WIDTH, TILE_WIDTH);
            case "212" -> bufferedImage.getSubimage(64,  448, TILE_WIDTH, TILE_WIDTH);
            case "213" -> bufferedImage.getSubimage(96,  448, TILE_WIDTH, TILE_WIDTH);
            case "214" -> bufferedImage.getSubimage(128, 448, TILE_WIDTH, TILE_WIDTH);
            case "215" -> bufferedImage.getSubimage(160, 448, TILE_WIDTH, TILE_WIDTH);
            case "216" -> bufferedImage.getSubimage(192, 448, TILE_WIDTH, TILE_WIDTH);
            case "217" -> bufferedImage.getSubimage(224, 448, TILE_WIDTH, TILE_WIDTH);
            case "218" -> bufferedImage.getSubimage(256, 448, TILE_WIDTH, TILE_WIDTH);
            case "219" -> bufferedImage.getSubimage(288, 448, TILE_WIDTH, TILE_WIDTH);
            case "220" -> bufferedImage.getSubimage(320, 448, TILE_WIDTH, TILE_WIDTH);
            case "221" -> bufferedImage.getSubimage(352, 448, TILE_WIDTH, TILE_WIDTH);
            case "222" -> bufferedImage.getSubimage(384, 448, TILE_WIDTH, TILE_WIDTH);
            case "223" -> bufferedImage.getSubimage(416, 448, TILE_WIDTH, TILE_WIDTH);
            case "224" -> bufferedImage.getSubimage(448, 448, TILE_WIDTH, TILE_WIDTH);

            case "225" -> bufferedImage.getSubimage(0,  480, TILE_WIDTH, TILE_WIDTH);
            case "226" -> bufferedImage.getSubimage(32, 480, TILE_WIDTH, TILE_WIDTH);
            case "227" -> bufferedImage.getSubimage(64, 480, TILE_WIDTH, TILE_WIDTH);
            case "228" -> bufferedImage.getSubimage(96, 480, TILE_WIDTH, TILE_WIDTH);
            case "229" -> bufferedImage.getSubimage(128,480, TILE_WIDTH, TILE_WIDTH);
            case "230" -> bufferedImage.getSubimage(160,480, TILE_WIDTH, TILE_WIDTH);
            case "231" -> bufferedImage.getSubimage(192,480, TILE_WIDTH, TILE_WIDTH);
            case "232" -> bufferedImage.getSubimage(224,480, TILE_WIDTH, TILE_WIDTH);
            case "233" -> bufferedImage.getSubimage(256,480, TILE_WIDTH, TILE_WIDTH);
            case "234" -> bufferedImage.getSubimage(288,480, TILE_WIDTH, TILE_WIDTH);
            case "235" -> bufferedImage.getSubimage(320,480, TILE_WIDTH, TILE_WIDTH);
            case "236" -> bufferedImage.getSubimage(352,480, TILE_WIDTH, TILE_WIDTH);
            case "237" -> bufferedImage.getSubimage(384,480, TILE_WIDTH, TILE_WIDTH);
            case "238" -> bufferedImage.getSubimage(416,480, TILE_WIDTH, TILE_WIDTH);
            case "239" -> bufferedImage.getSubimage(448,480, TILE_WIDTH, TILE_WIDTH);

            case "240" -> bufferedImage.getSubimage(0,   512, TILE_WIDTH, TILE_WIDTH);
            case "241" -> bufferedImage.getSubimage(32,  512, TILE_WIDTH, TILE_WIDTH);
            case "242" -> bufferedImage.getSubimage(64,  512, TILE_WIDTH, TILE_WIDTH);
            case "243" -> bufferedImage.getSubimage(96,  512, TILE_WIDTH, TILE_WIDTH);
            case "244" -> bufferedImage.getSubimage(128, 512, TILE_WIDTH, TILE_WIDTH);
            case "245" -> bufferedImage.getSubimage(160, 512, TILE_WIDTH, TILE_WIDTH);
            case "246" -> bufferedImage.getSubimage(192, 512, TILE_WIDTH, TILE_WIDTH);
            case "247" -> bufferedImage.getSubimage(224, 512, TILE_WIDTH, TILE_WIDTH);
            case "248" -> bufferedImage.getSubimage(256, 512, TILE_WIDTH, TILE_WIDTH);
            case "249" -> bufferedImage.getSubimage(288, 512, TILE_WIDTH, TILE_WIDTH);
            case "250" -> bufferedImage.getSubimage(320, 512, TILE_WIDTH, TILE_WIDTH);
            case "251" -> bufferedImage.getSubimage(352, 512, TILE_WIDTH, TILE_WIDTH);
            case "252" -> bufferedImage.getSubimage(384, 512, TILE_WIDTH, TILE_WIDTH);
            case "253" -> bufferedImage.getSubimage(416, 512, TILE_WIDTH, TILE_WIDTH);
            case "254" -> bufferedImage.getSubimage(448, 512, TILE_WIDTH, TILE_WIDTH);

            case "255" -> bufferedImage.getSubimage(0,  544, TILE_WIDTH, TILE_WIDTH);
            case "256" -> bufferedImage.getSubimage(32, 544, TILE_WIDTH, TILE_WIDTH);
            case "257" -> bufferedImage.getSubimage(64, 544, TILE_WIDTH, TILE_WIDTH);
            case "258" -> bufferedImage.getSubimage(96, 544, TILE_WIDTH, TILE_WIDTH);
            case "259" -> bufferedImage.getSubimage(128,544, TILE_WIDTH, TILE_WIDTH);
            case "260" -> bufferedImage.getSubimage(160,544, TILE_WIDTH, TILE_WIDTH);
            case "261" -> bufferedImage.getSubimage(192,544, TILE_WIDTH, TILE_WIDTH);
            case "262" -> bufferedImage.getSubimage(224,544, TILE_WIDTH, TILE_WIDTH);
            case "263" -> bufferedImage.getSubimage(256,544, TILE_WIDTH, TILE_WIDTH);
            case "264" -> bufferedImage.getSubimage(288,544, TILE_WIDTH, TILE_WIDTH);
            case "265" -> bufferedImage.getSubimage(320,544, TILE_WIDTH, TILE_WIDTH);
            case "266" -> bufferedImage.getSubimage(352,544, TILE_WIDTH, TILE_WIDTH);
            case "267" -> bufferedImage.getSubimage(384,544, TILE_WIDTH, TILE_WIDTH);
            case "268" -> bufferedImage.getSubimage(416,544, TILE_WIDTH, TILE_WIDTH);
            case "269" -> bufferedImage.getSubimage(448,544, TILE_WIDTH, TILE_WIDTH);

            case "270" -> bufferedImage.getSubimage(0,   576, TILE_WIDTH, TILE_WIDTH);
            case "271" -> bufferedImage.getSubimage(32,  576, TILE_WIDTH, TILE_WIDTH);
            case "272" -> bufferedImage.getSubimage(64,  576, TILE_WIDTH, TILE_WIDTH);
            case "273" -> bufferedImage.getSubimage(96,  576, TILE_WIDTH, TILE_WIDTH);
            case "274" -> bufferedImage.getSubimage(128, 576, TILE_WIDTH, TILE_WIDTH);
            case "275" -> bufferedImage.getSubimage(160, 576, TILE_WIDTH, TILE_WIDTH);
            case "276" -> bufferedImage.getSubimage(192, 576, TILE_WIDTH, TILE_WIDTH);
            case "277" -> bufferedImage.getSubimage(224, 576, TILE_WIDTH, TILE_WIDTH);
            case "278" -> bufferedImage.getSubimage(256, 576, TILE_WIDTH, TILE_WIDTH);
            case "279" -> bufferedImage.getSubimage(288, 576, TILE_WIDTH, TILE_WIDTH);
            case "280" -> bufferedImage.getSubimage(320, 576, TILE_WIDTH, TILE_WIDTH);
            case "281" -> bufferedImage.getSubimage(352, 576, TILE_WIDTH, TILE_WIDTH);
            case "282" -> bufferedImage.getSubimage(384, 576, TILE_WIDTH, TILE_WIDTH);
            case "283" -> bufferedImage.getSubimage(416, 576, TILE_WIDTH, TILE_WIDTH);
            case "284" -> bufferedImage.getSubimage(448, 576, TILE_WIDTH, TILE_WIDTH);


            case "285" -> bufferedImage.getSubimage(0,  608, TILE_WIDTH, TILE_WIDTH);
            case "286" -> bufferedImage.getSubimage(32, 608, TILE_WIDTH, TILE_WIDTH);
            case "287" -> bufferedImage.getSubimage(64, 608, TILE_WIDTH, TILE_WIDTH);
            case "288" -> bufferedImage.getSubimage(96, 608, TILE_WIDTH, TILE_WIDTH);
            case "289" -> bufferedImage.getSubimage(128,608, TILE_WIDTH, TILE_WIDTH);
            case "290" -> bufferedImage.getSubimage(160,608, TILE_WIDTH, TILE_WIDTH);
            case "291" -> bufferedImage.getSubimage(192,608, TILE_WIDTH, TILE_WIDTH);
            case "292" -> bufferedImage.getSubimage(224,608, TILE_WIDTH, TILE_WIDTH);
            case "293" -> bufferedImage.getSubimage(256,608, TILE_WIDTH, TILE_WIDTH);
            case "294" -> bufferedImage.getSubimage(288,608, TILE_WIDTH, TILE_WIDTH);
            case "295" -> bufferedImage.getSubimage(320,608, TILE_WIDTH, TILE_WIDTH);
            case "296" -> bufferedImage.getSubimage(352,608, TILE_WIDTH, TILE_WIDTH);
            case "297" -> bufferedImage.getSubimage(384,608, TILE_WIDTH, TILE_WIDTH);
            case "298" -> bufferedImage.getSubimage(416,608, TILE_WIDTH, TILE_WIDTH);
            case "299" -> bufferedImage.getSubimage(448,608, TILE_WIDTH, TILE_WIDTH);

            case "300" -> bufferedImage.getSubimage(0,   640, TILE_WIDTH, TILE_WIDTH);
            case "301" -> bufferedImage.getSubimage(32,  640, TILE_WIDTH, TILE_WIDTH);
            case "302" -> bufferedImage.getSubimage(64,  640, TILE_WIDTH, TILE_WIDTH);
            case "303" -> bufferedImage.getSubimage(96,  640, TILE_WIDTH, TILE_WIDTH);
            case "304" -> bufferedImage.getSubimage(128, 640, TILE_WIDTH, TILE_WIDTH);
            case "305" -> bufferedImage.getSubimage(160, 640, TILE_WIDTH, TILE_WIDTH);
            case "306" -> bufferedImage.getSubimage(192, 640, TILE_WIDTH, TILE_WIDTH);
            case "307" -> bufferedImage.getSubimage(224, 640, TILE_WIDTH, TILE_WIDTH);
            case "308" -> bufferedImage.getSubimage(256, 640, TILE_WIDTH, TILE_WIDTH);
            case "309" -> bufferedImage.getSubimage(288, 640, TILE_WIDTH, TILE_WIDTH);
            case "310" -> bufferedImage.getSubimage(320, 640, TILE_WIDTH, TILE_WIDTH);
            case "311" -> bufferedImage.getSubimage(352, 640, TILE_WIDTH, TILE_WIDTH);
            case "312" -> bufferedImage.getSubimage(384, 640, TILE_WIDTH, TILE_WIDTH);
            case "313" -> bufferedImage.getSubimage(416, 640, TILE_WIDTH, TILE_WIDTH);
            case "314" -> bufferedImage.getSubimage(448, 640, TILE_WIDTH, TILE_WIDTH);

            case "315" -> bufferedImage.getSubimage(0,  672, TILE_WIDTH, TILE_WIDTH);
            case "316" -> bufferedImage.getSubimage(32, 672, TILE_WIDTH, TILE_WIDTH);
            case "317" -> bufferedImage.getSubimage(64, 672, TILE_WIDTH, TILE_WIDTH);
            case "318" -> bufferedImage.getSubimage(96, 672, TILE_WIDTH, TILE_WIDTH);
            case "319" -> bufferedImage.getSubimage(128,672, TILE_WIDTH, TILE_WIDTH);
            case "320" -> bufferedImage.getSubimage(160,672, TILE_WIDTH, TILE_WIDTH);
            case "321" -> bufferedImage.getSubimage(192,672, TILE_WIDTH, TILE_WIDTH);
            case "322" -> bufferedImage.getSubimage(224,672, TILE_WIDTH, TILE_WIDTH);
            case "323" -> bufferedImage.getSubimage(256,672, TILE_WIDTH, TILE_WIDTH);
            case "324" -> bufferedImage.getSubimage(288,672, TILE_WIDTH, TILE_WIDTH);
            case "325" -> bufferedImage.getSubimage(320,672, TILE_WIDTH, TILE_WIDTH);
            case "326" -> bufferedImage.getSubimage(352,672, TILE_WIDTH, TILE_WIDTH);
            case "327" -> bufferedImage.getSubimage(384,672, TILE_WIDTH, TILE_WIDTH);
            case "328" -> bufferedImage.getSubimage(416,672, TILE_WIDTH, TILE_WIDTH);
            case "329" -> bufferedImage.getSubimage(448,672, TILE_WIDTH, TILE_WIDTH);

            case "330" -> bufferedImage.getSubimage(0,   704, TILE_WIDTH, TILE_WIDTH);
            case "331" -> bufferedImage.getSubimage(32,  704, TILE_WIDTH, TILE_WIDTH);
            case "332" -> bufferedImage.getSubimage(64,  704, TILE_WIDTH, TILE_WIDTH);
            case "333" -> bufferedImage.getSubimage(96,  704, TILE_WIDTH, TILE_WIDTH);
            case "334" -> bufferedImage.getSubimage(128, 704, TILE_WIDTH, TILE_WIDTH);
            case "335" -> bufferedImage.getSubimage(160, 704, TILE_WIDTH, TILE_WIDTH);
            case "336" -> bufferedImage.getSubimage(192, 704, TILE_WIDTH, TILE_WIDTH);
            case "337" -> bufferedImage.getSubimage(224, 704, TILE_WIDTH, TILE_WIDTH);
            case "338" -> bufferedImage.getSubimage(256, 704, TILE_WIDTH, TILE_WIDTH);
            case "339" -> bufferedImage.getSubimage(288, 704, TILE_WIDTH, TILE_WIDTH);
            case "340" -> bufferedImage.getSubimage(320, 704, TILE_WIDTH, TILE_WIDTH);
            case "341" -> bufferedImage.getSubimage(352, 704, TILE_WIDTH, TILE_WIDTH);
            case "342" -> bufferedImage.getSubimage(384, 704, TILE_WIDTH, TILE_WIDTH);
            case "343" -> bufferedImage.getSubimage(416, 704, TILE_WIDTH, TILE_WIDTH);
            case "344" -> bufferedImage.getSubimage(448, 704, TILE_WIDTH, TILE_WIDTH);

            case "345" -> bufferedImage.getSubimage(0,  736, TILE_WIDTH, TILE_WIDTH);
            case "346" -> bufferedImage.getSubimage(32, 736, TILE_WIDTH, TILE_WIDTH);
            case "347" -> bufferedImage.getSubimage(64, 736, TILE_WIDTH, TILE_WIDTH);
            case "348" -> bufferedImage.getSubimage(96, 736, TILE_WIDTH, TILE_WIDTH);
            case "349" -> bufferedImage.getSubimage(128,736, TILE_WIDTH, TILE_WIDTH);
            case "350" -> bufferedImage.getSubimage(160,736, TILE_WIDTH, TILE_WIDTH);
            case "351" -> bufferedImage.getSubimage(192,736, TILE_WIDTH, TILE_WIDTH);
            case "352" -> bufferedImage.getSubimage(224,736, TILE_WIDTH, TILE_WIDTH);
            case "353" -> bufferedImage.getSubimage(256,736, TILE_WIDTH, TILE_WIDTH);
            case "354" -> bufferedImage.getSubimage(288,736, TILE_WIDTH, TILE_WIDTH);
            case "355" -> bufferedImage.getSubimage(320,736, TILE_WIDTH, TILE_WIDTH);
            case "356" -> bufferedImage.getSubimage(352,736, TILE_WIDTH, TILE_WIDTH);
            case "357" -> bufferedImage.getSubimage(384,736, TILE_WIDTH, TILE_WIDTH);
            case "358" -> bufferedImage.getSubimage(416,736, TILE_WIDTH, TILE_WIDTH);
            case "359" -> bufferedImage.getSubimage(448,736, TILE_WIDTH, TILE_WIDTH);

            case "360" -> bufferedImage.getSubimage(0,   768, TILE_WIDTH, TILE_WIDTH);
            case "361" -> bufferedImage.getSubimage(32,  768, TILE_WIDTH, TILE_WIDTH);
            case "362" -> bufferedImage.getSubimage(64,  768, TILE_WIDTH, TILE_WIDTH);
            case "363" -> bufferedImage.getSubimage(96,  768, TILE_WIDTH, TILE_WIDTH);
            case "364" -> bufferedImage.getSubimage(128, 768, TILE_WIDTH, TILE_WIDTH);
            case "365" -> bufferedImage.getSubimage(160, 768, TILE_WIDTH, TILE_WIDTH);
            case "366" -> bufferedImage.getSubimage(192, 768, TILE_WIDTH, TILE_WIDTH);
            case "367" -> bufferedImage.getSubimage(224, 768, TILE_WIDTH, TILE_WIDTH);
            case "368" -> bufferedImage.getSubimage(256, 768, TILE_WIDTH, TILE_WIDTH);
            case "369" -> bufferedImage.getSubimage(288, 768, TILE_WIDTH, TILE_WIDTH);
            case "370" -> bufferedImage.getSubimage(320, 768, TILE_WIDTH, TILE_WIDTH);
            case "371" -> bufferedImage.getSubimage(352, 768, TILE_WIDTH, TILE_WIDTH);
            case "372" -> bufferedImage.getSubimage(384, 768, TILE_WIDTH, TILE_WIDTH);
            case "373" -> bufferedImage.getSubimage(416, 768, TILE_WIDTH, TILE_WIDTH);
            case "374" -> bufferedImage.getSubimage(448, 768, TILE_WIDTH, TILE_WIDTH);

            case "375" -> bufferedImage.getSubimage(0,  800, TILE_WIDTH, TILE_WIDTH);
            case "376" -> bufferedImage.getSubimage(32, 800, TILE_WIDTH, TILE_WIDTH);
            case "377" -> bufferedImage.getSubimage(64, 800, TILE_WIDTH, TILE_WIDTH);
            case "378" -> bufferedImage.getSubimage(96, 800, TILE_WIDTH, TILE_WIDTH);
            case "379" -> bufferedImage.getSubimage(128,800, TILE_WIDTH, TILE_WIDTH);
            case "380" -> bufferedImage.getSubimage(160,800, TILE_WIDTH, TILE_WIDTH);
            case "381" -> bufferedImage.getSubimage(192,800, TILE_WIDTH, TILE_WIDTH);
            case "382" -> bufferedImage.getSubimage(224,800, TILE_WIDTH, TILE_WIDTH);
            case "383" -> bufferedImage.getSubimage(256,800, TILE_WIDTH, TILE_WIDTH);
            case "384" -> bufferedImage.getSubimage(288,800, TILE_WIDTH, TILE_WIDTH);
            case "385" -> bufferedImage.getSubimage(320,800, TILE_WIDTH, TILE_WIDTH);
            case "386" -> bufferedImage.getSubimage(352,800, TILE_WIDTH, TILE_WIDTH);
            case "387" -> bufferedImage.getSubimage(384,800, TILE_WIDTH, TILE_WIDTH);
            case "388" -> bufferedImage.getSubimage(416,800, TILE_WIDTH, TILE_WIDTH);
            case "389" -> bufferedImage.getSubimage(448,800, TILE_WIDTH, TILE_WIDTH);

            case "390" -> bufferedImage.getSubimage(0,   832, TILE_WIDTH, TILE_WIDTH);
            case "391" -> bufferedImage.getSubimage(32,  832, TILE_WIDTH, TILE_WIDTH);
            case "392" -> bufferedImage.getSubimage(64,  832, TILE_WIDTH, TILE_WIDTH);
            case "393" -> bufferedImage.getSubimage(96,  832, TILE_WIDTH, TILE_WIDTH);
            case "394" -> bufferedImage.getSubimage(128, 832, TILE_WIDTH, TILE_WIDTH);
            case "395" -> bufferedImage.getSubimage(160, 832, TILE_WIDTH, TILE_WIDTH);
            case "396" -> bufferedImage.getSubimage(192, 832, TILE_WIDTH, TILE_WIDTH);
            case "397" -> bufferedImage.getSubimage(224, 832, TILE_WIDTH, TILE_WIDTH);
            case "398" -> bufferedImage.getSubimage(256, 832, TILE_WIDTH, TILE_WIDTH);
            case "399" -> bufferedImage.getSubimage(288, 832, TILE_WIDTH, TILE_WIDTH);
            case "400" -> bufferedImage.getSubimage(320, 832, TILE_WIDTH, TILE_WIDTH);
            case "401" -> bufferedImage.getSubimage(352, 832, TILE_WIDTH, TILE_WIDTH);
            case "402" -> bufferedImage.getSubimage(384, 832, TILE_WIDTH, TILE_WIDTH);
            case "403" -> bufferedImage.getSubimage(416, 832, TILE_WIDTH, TILE_WIDTH);
            case "404" -> bufferedImage.getSubimage(448, 832, TILE_WIDTH, TILE_WIDTH);


            case "405" -> bufferedImage.getSubimage(0,  864, TILE_WIDTH, TILE_WIDTH);
            case "406" -> bufferedImage.getSubimage(32, 864, TILE_WIDTH, TILE_WIDTH);
            case "407" -> bufferedImage.getSubimage(64, 864, TILE_WIDTH, TILE_WIDTH);
            case "408" -> bufferedImage.getSubimage(96, 864, TILE_WIDTH, TILE_WIDTH);
            case "409" -> bufferedImage.getSubimage(128,864, TILE_WIDTH, TILE_WIDTH);
            case "410" -> bufferedImage.getSubimage(160,864, TILE_WIDTH, TILE_WIDTH);
            case "411" -> bufferedImage.getSubimage(192,864, TILE_WIDTH, TILE_WIDTH);
            case "412" -> bufferedImage.getSubimage(224,864, TILE_WIDTH, TILE_WIDTH);
            case "413" -> bufferedImage.getSubimage(256,864, TILE_WIDTH, TILE_WIDTH);
            case "414" -> bufferedImage.getSubimage(288,864, TILE_WIDTH, TILE_WIDTH);
            case "415" -> bufferedImage.getSubimage(320,864, TILE_WIDTH, TILE_WIDTH);
            case "416" -> bufferedImage.getSubimage(352,864, TILE_WIDTH, TILE_WIDTH);
            case "417" -> bufferedImage.getSubimage(384,864, TILE_WIDTH, TILE_WIDTH);
            case "418" -> bufferedImage.getSubimage(416,864, TILE_WIDTH, TILE_WIDTH);
            case "419" -> bufferedImage.getSubimage(448,864, TILE_WIDTH, TILE_WIDTH);

            case "420" -> bufferedImage.getSubimage(0,   896, TILE_WIDTH, TILE_WIDTH);
            case "421" -> bufferedImage.getSubimage(32,  896, TILE_WIDTH, TILE_WIDTH);
            case "422" -> bufferedImage.getSubimage(64,  896, TILE_WIDTH, TILE_WIDTH);
            case "423" -> bufferedImage.getSubimage(96,  896, TILE_WIDTH, TILE_WIDTH);
            case "424" -> bufferedImage.getSubimage(128, 896, TILE_WIDTH, TILE_WIDTH);
            case "425" -> bufferedImage.getSubimage(160, 896, TILE_WIDTH, TILE_WIDTH);
            case "426" -> bufferedImage.getSubimage(192, 896, TILE_WIDTH, TILE_WIDTH);
            case "427" -> bufferedImage.getSubimage(224, 896, TILE_WIDTH, TILE_WIDTH);
            case "428" -> bufferedImage.getSubimage(256, 896, TILE_WIDTH, TILE_WIDTH);
            case "429" -> bufferedImage.getSubimage(288, 896, TILE_WIDTH, TILE_WIDTH);
            case "430" -> bufferedImage.getSubimage(320, 896, TILE_WIDTH, TILE_WIDTH);
            case "431" -> bufferedImage.getSubimage(352, 896, TILE_WIDTH, TILE_WIDTH);
            case "432" -> bufferedImage.getSubimage(384, 896, TILE_WIDTH, TILE_WIDTH);
            case "433" -> bufferedImage.getSubimage(416, 896, TILE_WIDTH, TILE_WIDTH);
            case "434" -> bufferedImage.getSubimage(448, 896, TILE_WIDTH, TILE_WIDTH);

            case "435" -> bufferedImage.getSubimage(0,  928, TILE_WIDTH, TILE_WIDTH);
            case "436" -> bufferedImage.getSubimage(32, 928, TILE_WIDTH, TILE_WIDTH);
            case "437" -> bufferedImage.getSubimage(64, 928, TILE_WIDTH, TILE_WIDTH);
            case "438" -> bufferedImage.getSubimage(96, 928, TILE_WIDTH, TILE_WIDTH);
            case "439" -> bufferedImage.getSubimage(128,928, TILE_WIDTH, TILE_WIDTH);
            case "440" -> bufferedImage.getSubimage(160,928, TILE_WIDTH, TILE_WIDTH);
            case "441" -> bufferedImage.getSubimage(192,928, TILE_WIDTH, TILE_WIDTH);
            case "442" -> bufferedImage.getSubimage(224,928, TILE_WIDTH, TILE_WIDTH);
            case "443" -> bufferedImage.getSubimage(256,928, TILE_WIDTH, TILE_WIDTH);
            case "444" -> bufferedImage.getSubimage(288,928, TILE_WIDTH, TILE_WIDTH);
            case "445" -> bufferedImage.getSubimage(320,928, TILE_WIDTH, TILE_WIDTH);
            case "446" -> bufferedImage.getSubimage(352,928, TILE_WIDTH, TILE_WIDTH);
            case "447" -> bufferedImage.getSubimage(384,928, TILE_WIDTH, TILE_WIDTH);
            case "448" -> bufferedImage.getSubimage(416,928, TILE_WIDTH, TILE_WIDTH);
            case "449" -> bufferedImage.getSubimage(448,928, TILE_WIDTH, TILE_WIDTH);

            case "450" -> bufferedImage.getSubimage(0,   960, TILE_WIDTH, TILE_WIDTH);
            case "451" -> bufferedImage.getSubimage(32,  960, TILE_WIDTH, TILE_WIDTH);
            case "452" -> bufferedImage.getSubimage(64,  960, TILE_WIDTH, TILE_WIDTH);
            case "453" -> bufferedImage.getSubimage(96,  960, TILE_WIDTH, TILE_WIDTH);
            case "454" -> bufferedImage.getSubimage(128, 960, TILE_WIDTH, TILE_WIDTH);
            case "455" -> bufferedImage.getSubimage(160, 960, TILE_WIDTH, TILE_WIDTH);
            case "456" -> bufferedImage.getSubimage(192, 960, TILE_WIDTH, TILE_WIDTH);
            case "457" -> bufferedImage.getSubimage(224, 960, TILE_WIDTH, TILE_WIDTH);
            case "458" -> bufferedImage.getSubimage(256, 960, TILE_WIDTH, TILE_WIDTH);
            case "459" -> bufferedImage.getSubimage(288, 960, TILE_WIDTH, TILE_WIDTH);
            case "460" -> bufferedImage.getSubimage(320, 960, TILE_WIDTH, TILE_WIDTH);
            case "461" -> bufferedImage.getSubimage(352, 960, TILE_WIDTH, TILE_WIDTH);
            case "462" -> bufferedImage.getSubimage(384, 960, TILE_WIDTH, TILE_WIDTH);
            case "463" -> bufferedImage.getSubimage(416, 960, TILE_WIDTH, TILE_WIDTH);
            case "464" -> bufferedImage.getSubimage(448, 960, TILE_WIDTH, TILE_WIDTH);


            case "465" -> bufferedImage.getSubimage(0,  992, TILE_WIDTH, TILE_WIDTH);
            case "466" -> bufferedImage.getSubimage(32, 992, TILE_WIDTH, TILE_WIDTH);
            case "467" -> bufferedImage.getSubimage(64, 992, TILE_WIDTH, TILE_WIDTH);
            case "468" -> bufferedImage.getSubimage(96, 992, TILE_WIDTH, TILE_WIDTH);
            case "469" -> bufferedImage.getSubimage(128,992, TILE_WIDTH, TILE_WIDTH);
            case "470" -> bufferedImage.getSubimage(160,992, TILE_WIDTH, TILE_WIDTH);
            case "471" -> bufferedImage.getSubimage(192,992, TILE_WIDTH, TILE_WIDTH);
            case "472" -> bufferedImage.getSubimage(224,992, TILE_WIDTH, TILE_WIDTH);
            case "473" -> bufferedImage.getSubimage(256,992, TILE_WIDTH, TILE_WIDTH);
            case "474" -> bufferedImage.getSubimage(288,992, TILE_WIDTH, TILE_WIDTH);
            case "475" -> bufferedImage.getSubimage(320,992, TILE_WIDTH, TILE_WIDTH);
            case "476" -> bufferedImage.getSubimage(352,992, TILE_WIDTH, TILE_WIDTH);
            case "477" -> bufferedImage.getSubimage(384,992, TILE_WIDTH, TILE_WIDTH);
            case "478" -> bufferedImage.getSubimage(416,992, TILE_WIDTH, TILE_WIDTH);
            case "479" -> bufferedImage.getSubimage(448,992, TILE_WIDTH, TILE_WIDTH);

            case "480" -> bufferedImage.getSubimage(0,   1024, TILE_WIDTH, TILE_WIDTH);
            case "481" -> bufferedImage.getSubimage(32,  1024, TILE_WIDTH, TILE_WIDTH);
            case "482" -> bufferedImage.getSubimage(64,  1024, TILE_WIDTH, TILE_WIDTH);
            case "483" -> bufferedImage.getSubimage(96,  1024, TILE_WIDTH, TILE_WIDTH);
            case "484" -> bufferedImage.getSubimage(128, 1024, TILE_WIDTH, TILE_WIDTH);
            case "485" -> bufferedImage.getSubimage(160, 1024, TILE_WIDTH, TILE_WIDTH);
            case "486" -> bufferedImage.getSubimage(192, 1024, TILE_WIDTH, TILE_WIDTH);
            case "487" -> bufferedImage.getSubimage(224, 1024, TILE_WIDTH, TILE_WIDTH);
            case "488" -> bufferedImage.getSubimage(256, 1024, TILE_WIDTH, TILE_WIDTH);
            case "489" -> bufferedImage.getSubimage(288, 1024, TILE_WIDTH, TILE_WIDTH);
            case "490" -> bufferedImage.getSubimage(320, 1024, TILE_WIDTH, TILE_WIDTH);
            case "491" -> bufferedImage.getSubimage(352, 1024, TILE_WIDTH, TILE_WIDTH);
            case "492" -> bufferedImage.getSubimage(384, 1024, TILE_WIDTH, TILE_WIDTH);
            case "493" -> bufferedImage.getSubimage(416, 1024, TILE_WIDTH, TILE_WIDTH);
            case "494" -> bufferedImage.getSubimage(448, 1024, TILE_WIDTH, TILE_WIDTH);


            case "495" -> bufferedImage.getSubimage(0,  1056, TILE_WIDTH, TILE_WIDTH);
            case "496" -> bufferedImage.getSubimage(32, 1056, TILE_WIDTH, TILE_WIDTH);
            case "497" -> bufferedImage.getSubimage(64, 1056, TILE_WIDTH, TILE_WIDTH);
            case "498" -> bufferedImage.getSubimage(96, 1056, TILE_WIDTH, TILE_WIDTH);
            case "499" -> bufferedImage.getSubimage(128,1056, TILE_WIDTH, TILE_WIDTH);
            case "500" -> bufferedImage.getSubimage(160,1056, TILE_WIDTH, TILE_WIDTH);
            case "501" -> bufferedImage.getSubimage(192,1056, TILE_WIDTH, TILE_WIDTH);
            case "502" -> bufferedImage.getSubimage(224,1056, TILE_WIDTH, TILE_WIDTH);
            case "503" -> bufferedImage.getSubimage(256,1056, TILE_WIDTH, TILE_WIDTH);
            case "504" -> bufferedImage.getSubimage(288,1056, TILE_WIDTH, TILE_WIDTH);
            case "505" -> bufferedImage.getSubimage(320,1056, TILE_WIDTH, TILE_WIDTH);
            case "506" -> bufferedImage.getSubimage(352,1056, TILE_WIDTH, TILE_WIDTH);
            case "507" -> bufferedImage.getSubimage(384,1056, TILE_WIDTH, TILE_WIDTH);
            case "508" -> bufferedImage.getSubimage(416,1056, TILE_WIDTH, TILE_WIDTH);
            case "509" -> bufferedImage.getSubimage(448,1056, TILE_WIDTH, TILE_WIDTH);

            case "510" -> bufferedImage.getSubimage(0,   1088, TILE_WIDTH, TILE_WIDTH);
            case "511" -> bufferedImage.getSubimage(32,  1088, TILE_WIDTH, TILE_WIDTH);
            case "512" -> bufferedImage.getSubimage(64,  1088, TILE_WIDTH, TILE_WIDTH);
            case "513" -> bufferedImage.getSubimage(96,  1088, TILE_WIDTH, TILE_WIDTH);
            case "514" -> bufferedImage.getSubimage(128, 1088, TILE_WIDTH, TILE_WIDTH);
            case "515" -> bufferedImage.getSubimage(160, 1088, TILE_WIDTH, TILE_WIDTH);
            case "516" -> bufferedImage.getSubimage(192, 1088, TILE_WIDTH, TILE_WIDTH);
            case "517" -> bufferedImage.getSubimage(224, 1088, TILE_WIDTH, TILE_WIDTH);
            case "518" -> bufferedImage.getSubimage(256, 1088, TILE_WIDTH, TILE_WIDTH);
            case "519" -> bufferedImage.getSubimage(288, 1088, TILE_WIDTH, TILE_WIDTH);
            case "520" -> bufferedImage.getSubimage(320, 1088, TILE_WIDTH, TILE_WIDTH);
            case "521" -> bufferedImage.getSubimage(352, 1088, TILE_WIDTH, TILE_WIDTH);
            case "522" -> bufferedImage.getSubimage(384, 1088, TILE_WIDTH, TILE_WIDTH);
            case "523" -> bufferedImage.getSubimage(416, 1088, TILE_WIDTH, TILE_WIDTH);
            case "524" -> bufferedImage.getSubimage(448, 1088, TILE_WIDTH, TILE_WIDTH);


            case "525" -> bufferedImage.getSubimage(0,  1120, TILE_WIDTH, TILE_WIDTH);
            case "526" -> bufferedImage.getSubimage(32, 1120, TILE_WIDTH, TILE_WIDTH);
            case "527" -> bufferedImage.getSubimage(64, 1120, TILE_WIDTH, TILE_WIDTH);
            case "528" -> bufferedImage.getSubimage(96, 1120, TILE_WIDTH, TILE_WIDTH);
            case "529" -> bufferedImage.getSubimage(128,1120, TILE_WIDTH, TILE_WIDTH);
            case "530" -> bufferedImage.getSubimage(160,1120, TILE_WIDTH, TILE_WIDTH);
            case "531" -> bufferedImage.getSubimage(192,1120, TILE_WIDTH, TILE_WIDTH);
            case "532" -> bufferedImage.getSubimage(224,1120, TILE_WIDTH, TILE_WIDTH);
            case "533" -> bufferedImage.getSubimage(256,1120, TILE_WIDTH, TILE_WIDTH);
            case "534" -> bufferedImage.getSubimage(288,1120, TILE_WIDTH, TILE_WIDTH);
            case "535" -> bufferedImage.getSubimage(320,1120, TILE_WIDTH, TILE_WIDTH);
            case "536" -> bufferedImage.getSubimage(352,1120, TILE_WIDTH, TILE_WIDTH);
            case "537" -> bufferedImage.getSubimage(384,1120, TILE_WIDTH, TILE_WIDTH);
            case "538" -> bufferedImage.getSubimage(416,1120, TILE_WIDTH, TILE_WIDTH);
            case "539" -> bufferedImage.getSubimage(448,1120, TILE_WIDTH, TILE_WIDTH);

            case "540" -> bufferedImage.getSubimage(0,   1152, TILE_WIDTH, TILE_WIDTH);
            case "541" -> bufferedImage.getSubimage(32,  1152, TILE_WIDTH, TILE_WIDTH);
            case "542" -> bufferedImage.getSubimage(64,  1152, TILE_WIDTH, TILE_WIDTH);
            case "543" -> bufferedImage.getSubimage(96,  1152, TILE_WIDTH, TILE_WIDTH);
            case "544" -> bufferedImage.getSubimage(128, 1152, TILE_WIDTH, TILE_WIDTH);
            case "545" -> bufferedImage.getSubimage(160, 1152, TILE_WIDTH, TILE_WIDTH);
            case "546" -> bufferedImage.getSubimage(192, 1152, TILE_WIDTH, TILE_WIDTH);
            case "547" -> bufferedImage.getSubimage(224, 1152, TILE_WIDTH, TILE_WIDTH);
            case "548" -> bufferedImage.getSubimage(256, 1152, TILE_WIDTH, TILE_WIDTH);
            case "549" -> bufferedImage.getSubimage(288, 1152, TILE_WIDTH, TILE_WIDTH);
            case "550" -> bufferedImage.getSubimage(320, 1152, TILE_WIDTH, TILE_WIDTH);
            case "551" -> bufferedImage.getSubimage(352, 1152, TILE_WIDTH, TILE_WIDTH);
            case "552" -> bufferedImage.getSubimage(384, 1152, TILE_WIDTH, TILE_WIDTH);
            case "553" -> bufferedImage.getSubimage(416, 1152, TILE_WIDTH, TILE_WIDTH);
            case "554" -> bufferedImage.getSubimage(448, 1152, TILE_WIDTH, TILE_WIDTH);

            case "555" -> bufferedImage.getSubimage(0,  1184, TILE_WIDTH, TILE_WIDTH);
            case "556" -> bufferedImage.getSubimage(32, 1184, TILE_WIDTH, TILE_WIDTH);
            case "557" -> bufferedImage.getSubimage(64, 1120, TILE_WIDTH, TILE_WIDTH);
            case "558" -> bufferedImage.getSubimage(96, 1120, TILE_WIDTH, TILE_WIDTH);
            case "559" -> bufferedImage.getSubimage(128,1120, TILE_WIDTH, TILE_WIDTH);
            case "560" -> bufferedImage.getSubimage(160,1120, TILE_WIDTH, TILE_WIDTH);
            case "561" -> bufferedImage.getSubimage(192,1120, TILE_WIDTH, TILE_WIDTH);
            case "562" -> bufferedImage.getSubimage(224,1120, TILE_WIDTH, TILE_WIDTH);
            case "563" -> bufferedImage.getSubimage(256,1120, TILE_WIDTH, TILE_WIDTH);
            case "564" -> bufferedImage.getSubimage(288,1120, TILE_WIDTH, TILE_WIDTH);
            case "565" -> bufferedImage.getSubimage(320,1120, TILE_WIDTH, TILE_WIDTH);
            case "566" -> bufferedImage.getSubimage(352,1120, TILE_WIDTH, TILE_WIDTH);
            case "567" -> bufferedImage.getSubimage(384,1120, TILE_WIDTH, TILE_WIDTH);
            case "568" -> bufferedImage.getSubimage(416,1120, TILE_WIDTH, TILE_WIDTH);
            case "569" -> bufferedImage.getSubimage(448,1120, TILE_WIDTH, TILE_WIDTH);

            case "570" -> bufferedImage.getSubimage(0,   1152, TILE_WIDTH, TILE_WIDTH);
            case "571" -> bufferedImage.getSubimage(32,  1152, TILE_WIDTH, TILE_WIDTH);
            case "572" -> bufferedImage.getSubimage(64,  1152, TILE_WIDTH, TILE_WIDTH);
            case "573" -> bufferedImage.getSubimage(96,  1152, TILE_WIDTH, TILE_WIDTH);
            case "574" -> bufferedImage.getSubimage(128, 1152, TILE_WIDTH, TILE_WIDTH);
            case "575" -> bufferedImage.getSubimage(160, 1152, TILE_WIDTH, TILE_WIDTH);
            case "576" -> bufferedImage.getSubimage(192, 1152, TILE_WIDTH, TILE_WIDTH);
            case "577" -> bufferedImage.getSubimage(224, 1152, TILE_WIDTH, TILE_WIDTH);
            case "578" -> bufferedImage.getSubimage(256, 1152, TILE_WIDTH, TILE_WIDTH);
            case "579" -> bufferedImage.getSubimage(288, 1152, TILE_WIDTH, TILE_WIDTH);
            case "580" -> bufferedImage.getSubimage(320, 1152, TILE_WIDTH, TILE_WIDTH);
            case "581" -> bufferedImage.getSubimage(352, 1152, TILE_WIDTH, TILE_WIDTH);
            case "582" -> bufferedImage.getSubimage(384, 1152, TILE_WIDTH, TILE_WIDTH);
            case "583" -> bufferedImage.getSubimage(416, 1152, TILE_WIDTH, TILE_WIDTH);
            case "584" -> bufferedImage.getSubimage(448, 1152, TILE_WIDTH, TILE_WIDTH);


            case "585" -> bufferedImage.getSubimage(0,  1184, TILE_WIDTH, TILE_WIDTH);
            case "586" -> bufferedImage.getSubimage(32, 1184, TILE_WIDTH, TILE_WIDTH);
            case "587" -> bufferedImage.getSubimage(64, 1184, TILE_WIDTH, TILE_WIDTH);
            case "588" -> bufferedImage.getSubimage(96, 1184, TILE_WIDTH, TILE_WIDTH);
            case "589" -> bufferedImage.getSubimage(128,1184, TILE_WIDTH, TILE_WIDTH);
            case "590" -> bufferedImage.getSubimage(160,1184, TILE_WIDTH, TILE_WIDTH);
            case "591" -> bufferedImage.getSubimage(192,1184, TILE_WIDTH, TILE_WIDTH);
            case "592" -> bufferedImage.getSubimage(224,1184, TILE_WIDTH, TILE_WIDTH);
            case "593" -> bufferedImage.getSubimage(256,1184, TILE_WIDTH, TILE_WIDTH);
            case "594" -> bufferedImage.getSubimage(288,1184, TILE_WIDTH, TILE_WIDTH);
            case "595" -> bufferedImage.getSubimage(320,1184, TILE_WIDTH, TILE_WIDTH);
            case "596" -> bufferedImage.getSubimage(352,1184, TILE_WIDTH, TILE_WIDTH);
            case "597" -> bufferedImage.getSubimage(384,1184, TILE_WIDTH, TILE_WIDTH);
            case "598" -> bufferedImage.getSubimage(416,1184, TILE_WIDTH, TILE_WIDTH);
            case "599" -> bufferedImage.getSubimage(448,1184, TILE_WIDTH, TILE_WIDTH);

            case "600" -> bufferedImage.getSubimage(0,   1280, TILE_WIDTH, TILE_WIDTH);
            case "601" -> bufferedImage.getSubimage(32,  1280, TILE_WIDTH, TILE_WIDTH);
            case "602" -> bufferedImage.getSubimage(64,  1280, TILE_WIDTH, TILE_WIDTH);
            case "603" -> bufferedImage.getSubimage(96,  1280, TILE_WIDTH, TILE_WIDTH);
            case "604" -> bufferedImage.getSubimage(128, 1280, TILE_WIDTH, TILE_WIDTH);
            case "605" -> bufferedImage.getSubimage(160, 1280, TILE_WIDTH, TILE_WIDTH);
            case "606" -> bufferedImage.getSubimage(192, 1280, TILE_WIDTH, TILE_WIDTH);
            case "607" -> bufferedImage.getSubimage(224, 1280, TILE_WIDTH, TILE_WIDTH);
            case "608" -> bufferedImage.getSubimage(256, 1280, TILE_WIDTH, TILE_WIDTH);
            case "609" -> bufferedImage.getSubimage(288, 1280, TILE_WIDTH, TILE_WIDTH);
            case "610" -> bufferedImage.getSubimage(320, 1280, TILE_WIDTH, TILE_WIDTH);
            case "611" -> bufferedImage.getSubimage(352, 1280, TILE_WIDTH, TILE_WIDTH);
            case "612" -> bufferedImage.getSubimage(384, 1280, TILE_WIDTH, TILE_WIDTH);
            case "613" -> bufferedImage.getSubimage(416, 1280, TILE_WIDTH, TILE_WIDTH);
            case "614" -> bufferedImage.getSubimage(448, 1280, TILE_WIDTH, TILE_WIDTH);

            default -> null;
        };

    }
//return tile as png
    //zczytac mape z txt
    //wrzucucic na grida


    private ImageView convertToFxImage(BufferedImage image, int fieldSize) {
        WritableImage wr = null;
        if (image != null) {
            wr = new WritableImage(image.getWidth(), image.getHeight());
            PixelWriter pw = wr.getPixelWriter();
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    pw.setArgb(x, y, image.getRGB(x, y));
                }
            }
        }
        ImageView imageView = new ImageView(wr);
        imageView.setFitHeight(fieldSize);
        imageView.setFitWidth(fieldSize);

        return imageView;

    }

}
