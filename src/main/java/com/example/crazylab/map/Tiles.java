package com.example.crazylab.map;
import javafx.scene.image.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;

public class Tiles {


    public static int TILE_WIDTH = 32;



    public BufferedImage getImage(String tileName) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/hospitalDesign.png")));
        switch (tileName) {
            case "0":
                return bufferedImage.getSubimage(0, 0, TILE_WIDTH, TILE_WIDTH);
            case "1":
                return bufferedImage.getSubimage(32, 0, TILE_WIDTH, TILE_WIDTH);
            case "2":
                return bufferedImage.getSubimage(64, 0, TILE_WIDTH, TILE_WIDTH);
            case "3":
                return bufferedImage.getSubimage(96, 0, TILE_WIDTH, TILE_WIDTH);
            case "4":
                return bufferedImage.getSubimage(128, 0, TILE_WIDTH, TILE_WIDTH);
            case "5":
                return bufferedImage.getSubimage(160, 0, TILE_WIDTH, TILE_WIDTH);
            case "6":
                return bufferedImage.getSubimage(192, 0, TILE_WIDTH, TILE_WIDTH);
            case "7":
                return bufferedImage.getSubimage(224, 0, TILE_WIDTH, TILE_WIDTH);
            case "8":
                return bufferedImage.getSubimage(256, 0, TILE_WIDTH, TILE_WIDTH);
            case "9":
                return bufferedImage.getSubimage(288, 0, TILE_WIDTH, TILE_WIDTH);
            case "10":
                return bufferedImage.getSubimage(320, 0, TILE_WIDTH, TILE_WIDTH);
            case "11":
                return bufferedImage.getSubimage(352, 0, TILE_WIDTH, TILE_WIDTH);
            case "12":
                return bufferedImage.getSubimage(384, 0, TILE_WIDTH, TILE_WIDTH);
            case "13":
                return bufferedImage.getSubimage(416, 0, TILE_WIDTH, TILE_WIDTH);
            case "14":
                return bufferedImage.getSubimage(448, 0, TILE_WIDTH, TILE_WIDTH);
            case "15":
                return bufferedImage.getSubimage(0, 32, TILE_WIDTH, TILE_WIDTH);
            case "16":
                return bufferedImage.getSubimage(32, 32, TILE_WIDTH, TILE_WIDTH);
            case "17":
                return bufferedImage.getSubimage(64, 32, TILE_WIDTH, TILE_WIDTH);
            case "18":
                return bufferedImage.getSubimage(96, 32, TILE_WIDTH, TILE_WIDTH);
            case "19":
                return bufferedImage.getSubimage(128, 32, TILE_WIDTH, TILE_WIDTH);
            case "20":
                return bufferedImage.getSubimage(160, 32, TILE_WIDTH, TILE_WIDTH);
            case "21":
                return bufferedImage.getSubimage(192, 32, TILE_WIDTH, TILE_WIDTH);
            case "22":
                return bufferedImage.getSubimage(224, 32, TILE_WIDTH, TILE_WIDTH);
            case "23":
                return bufferedImage.getSubimage(256, 32, TILE_WIDTH, TILE_WIDTH);
            case "24":
                return bufferedImage.getSubimage(288, 32, TILE_WIDTH, TILE_WIDTH);
            case "25":
                return bufferedImage.getSubimage(320, 32, TILE_WIDTH, TILE_WIDTH);
            case "26":
                return bufferedImage.getSubimage(352, 32, TILE_WIDTH, TILE_WIDTH);
            case "27":
                return bufferedImage.getSubimage(384, 32, TILE_WIDTH, TILE_WIDTH);
            case "28":
                return bufferedImage.getSubimage(416, 32, TILE_WIDTH, TILE_WIDTH);
            case "29":
                return bufferedImage.getSubimage(448, 32, TILE_WIDTH, TILE_WIDTH);
            case "30":
                return bufferedImage.getSubimage(0, 64, TILE_WIDTH, TILE_WIDTH);
            case "31":
                return bufferedImage.getSubimage(32, 64, TILE_WIDTH, TILE_WIDTH);
            case "32":
                return bufferedImage.getSubimage(64, 64, TILE_WIDTH, TILE_WIDTH);
            case "33":
                return bufferedImage.getSubimage(96, 64, TILE_WIDTH, TILE_WIDTH);
            case "34":
                return bufferedImage.getSubimage(128, 64, TILE_WIDTH, TILE_WIDTH);
            case "35":
                return bufferedImage.getSubimage(160, 64, TILE_WIDTH, TILE_WIDTH);
            case "36":
                return bufferedImage.getSubimage(192, 64, TILE_WIDTH, TILE_WIDTH);
            case "37":
                return bufferedImage.getSubimage(224, 64, TILE_WIDTH, TILE_WIDTH);
            case "38":
                return bufferedImage.getSubimage(256, 64, TILE_WIDTH, TILE_WIDTH);
            case "39":
                return bufferedImage.getSubimage(288, 64, TILE_WIDTH, TILE_WIDTH);
            case "40":
                return bufferedImage.getSubimage(320, 64, TILE_WIDTH, TILE_WIDTH);
            case "41":
                return bufferedImage.getSubimage(352, 64, TILE_WIDTH, TILE_WIDTH);
            case "42":
                return bufferedImage.getSubimage(384, 64, TILE_WIDTH, TILE_WIDTH);
            case "43":
                return bufferedImage.getSubimage(416, 64, TILE_WIDTH, TILE_WIDTH);
            case "44":
                return bufferedImage.getSubimage(448, 64, TILE_WIDTH, TILE_WIDTH);
            case "45":
                return bufferedImage.getSubimage(0, 96, TILE_WIDTH, TILE_WIDTH);
            case "46":
                return bufferedImage.getSubimage(32, 96, TILE_WIDTH, TILE_WIDTH);
            case "47":
                return bufferedImage.getSubimage(64, 96, TILE_WIDTH, TILE_WIDTH);
            case "48":
                return bufferedImage.getSubimage(96, 96, TILE_WIDTH, TILE_WIDTH);
            case "49":
                return bufferedImage.getSubimage(128, 96, TILE_WIDTH, TILE_WIDTH);
            case "50":
                return bufferedImage.getSubimage(160, 96, TILE_WIDTH, TILE_WIDTH);
            case "51":
                return bufferedImage.getSubimage(192, 96, TILE_WIDTH, TILE_WIDTH);
            case "52":
                return bufferedImage.getSubimage(224, 96, TILE_WIDTH, TILE_WIDTH);
            case "53":
                return bufferedImage.getSubimage(256, 96, TILE_WIDTH, TILE_WIDTH);
            case "54":
                return bufferedImage.getSubimage(288, 96, TILE_WIDTH, TILE_WIDTH);
            case "55":
                return bufferedImage.getSubimage(320, 96, TILE_WIDTH, TILE_WIDTH);
            case "56":
                return bufferedImage.getSubimage(352, 96, TILE_WIDTH, TILE_WIDTH);
            case "57":
                return bufferedImage.getSubimage(384, 96, TILE_WIDTH, TILE_WIDTH);
            case "58":
                return bufferedImage.getSubimage(416, 96, TILE_WIDTH, TILE_WIDTH);
            case "59":
                return bufferedImage.getSubimage(448, 96, TILE_WIDTH, TILE_WIDTH);
            case "60":
                return bufferedImage.getSubimage(0, 128, TILE_WIDTH, TILE_WIDTH);
            case "61":
                return bufferedImage.getSubimage(32, 128, TILE_WIDTH, TILE_WIDTH);
            case "62":
                return bufferedImage.getSubimage(64, 128, TILE_WIDTH, TILE_WIDTH);
            case "63":
                return bufferedImage.getSubimage(96, 128, TILE_WIDTH, TILE_WIDTH);
            case "64":
                return bufferedImage.getSubimage(128, 128, TILE_WIDTH, TILE_WIDTH);
            case "65":
                return bufferedImage.getSubimage(160, 128, TILE_WIDTH, TILE_WIDTH);
            case "66":
                return bufferedImage.getSubimage(192, 128, TILE_WIDTH, TILE_WIDTH);
            case "67":
                return bufferedImage.getSubimage(224, 128, TILE_WIDTH, TILE_WIDTH);
            case "68":
                return bufferedImage.getSubimage(256, 128, TILE_WIDTH, TILE_WIDTH);
            case "69":
                return bufferedImage.getSubimage(288, 128, TILE_WIDTH, TILE_WIDTH);
            case "70":
                return bufferedImage.getSubimage(320, 128, TILE_WIDTH, TILE_WIDTH);
            case "71":
                return bufferedImage.getSubimage(352, 128, TILE_WIDTH, TILE_WIDTH);
            case "72":
                return bufferedImage.getSubimage(384, 128, TILE_WIDTH, TILE_WIDTH);
            case "73":
                return bufferedImage.getSubimage(416, 128, TILE_WIDTH, TILE_WIDTH);
            case "74":
                return bufferedImage.getSubimage(448, 128, TILE_WIDTH, TILE_WIDTH);
            case "75":
                return bufferedImage.getSubimage(0, 160, TILE_WIDTH, TILE_WIDTH);
            case "76":
                return bufferedImage.getSubimage(32, 160, TILE_WIDTH, TILE_WIDTH);
            case "77":
                return bufferedImage.getSubimage(64, 160, TILE_WIDTH, TILE_WIDTH);
            case "78":
                return bufferedImage.getSubimage(96, 160, TILE_WIDTH, TILE_WIDTH);
            case "79":
                return bufferedImage.getSubimage(128, 160, TILE_WIDTH, TILE_WIDTH);
            case "80":
                return bufferedImage.getSubimage(160, 160, TILE_WIDTH, TILE_WIDTH);
            case "81":
                return bufferedImage.getSubimage(192, 160, TILE_WIDTH, TILE_WIDTH);
            case "82":
                return bufferedImage.getSubimage(224, 160, TILE_WIDTH, TILE_WIDTH);
            case "83":
                return bufferedImage.getSubimage(256, 160, TILE_WIDTH, TILE_WIDTH);
            case "84":
                return bufferedImage.getSubimage(288, 160, TILE_WIDTH, TILE_WIDTH);
            case "85":
                return bufferedImage.getSubimage(320, 160, TILE_WIDTH, TILE_WIDTH);
            case "86":
                return bufferedImage.getSubimage(352, 160, TILE_WIDTH, TILE_WIDTH);
            case "87":
                return bufferedImage.getSubimage(384, 160, TILE_WIDTH, TILE_WIDTH);
            case "88":
                return bufferedImage.getSubimage(416, 160, TILE_WIDTH, TILE_WIDTH);
            case "89":
                return bufferedImage.getSubimage(448, 160, TILE_WIDTH, TILE_WIDTH);
            case "90":
                return bufferedImage.getSubimage(0, 192, TILE_WIDTH, TILE_WIDTH);
            case "91":
                return bufferedImage.getSubimage(32, 192, TILE_WIDTH, TILE_WIDTH);
            case "92":
                return bufferedImage.getSubimage(64, 192, TILE_WIDTH, TILE_WIDTH);
            case "93":
                return bufferedImage.getSubimage(96, 192, TILE_WIDTH, TILE_WIDTH);
            case "94":
                return bufferedImage.getSubimage(128, 192, TILE_WIDTH, TILE_WIDTH);
            case "95":
                return bufferedImage.getSubimage(160, 192, TILE_WIDTH, TILE_WIDTH);
            case "96":
                return bufferedImage.getSubimage(192, 192, TILE_WIDTH, TILE_WIDTH);
            case "97":
                return bufferedImage.getSubimage(224, 192, TILE_WIDTH, TILE_WIDTH);
            case "98":
                return bufferedImage.getSubimage(256, 192, TILE_WIDTH, TILE_WIDTH);
            case "99":
                return bufferedImage.getSubimage(288, 192, TILE_WIDTH, TILE_WIDTH);
            case "100":
                return bufferedImage.getSubimage(320, 192, TILE_WIDTH, TILE_WIDTH);
            case "101":
                return bufferedImage.getSubimage(352, 192, TILE_WIDTH, TILE_WIDTH);
            case "102":
                return bufferedImage.getSubimage(384, 192, TILE_WIDTH, TILE_WIDTH);
            case "103":
                return bufferedImage.getSubimage(416, 192, TILE_WIDTH, TILE_WIDTH);
            case "104":
                return bufferedImage.getSubimage(448, 192, TILE_WIDTH, TILE_WIDTH);
            case "105":
                return bufferedImage.getSubimage(0, 224, TILE_WIDTH, TILE_WIDTH);
            case "106":
                return bufferedImage.getSubimage(32, 224, TILE_WIDTH, TILE_WIDTH);
            case "107":
                return bufferedImage.getSubimage(64, 224, TILE_WIDTH, TILE_WIDTH);
            case "108":
                return bufferedImage.getSubimage(96, 224, TILE_WIDTH, TILE_WIDTH);
            case "109":
                return bufferedImage.getSubimage(128, 224, TILE_WIDTH, TILE_WIDTH);
            case "110":
                return bufferedImage.getSubimage(160, 224, TILE_WIDTH, TILE_WIDTH);
            case "111":
                return bufferedImage.getSubimage(192, 224, TILE_WIDTH, TILE_WIDTH);
            case "112":
                return bufferedImage.getSubimage(224, 224, TILE_WIDTH, TILE_WIDTH);
            case "113":
                return bufferedImage.getSubimage(256, 224, TILE_WIDTH, TILE_WIDTH);
            case "114":
                return bufferedImage.getSubimage(288, 224, TILE_WIDTH, TILE_WIDTH);
            case "115":
                return bufferedImage.getSubimage(320, 224, TILE_WIDTH, TILE_WIDTH);
            case "116":
                return bufferedImage.getSubimage(352, 224, TILE_WIDTH, TILE_WIDTH);
            case "117":
                return bufferedImage.getSubimage(384, 224, TILE_WIDTH, TILE_WIDTH);
            case "118":
                return bufferedImage.getSubimage(416, 224, TILE_WIDTH, TILE_WIDTH);
            case "119":
                return bufferedImage.getSubimage(448, 224, TILE_WIDTH, TILE_WIDTH);
            case "120":
                return bufferedImage.getSubimage(0, 256, TILE_WIDTH, TILE_WIDTH);
            case "121":
                return bufferedImage.getSubimage(32, 256, TILE_WIDTH, TILE_WIDTH);
            case "122":
                return bufferedImage.getSubimage(64, 256, TILE_WIDTH, TILE_WIDTH);
            case "123":
                return bufferedImage.getSubimage(96, 256, TILE_WIDTH, TILE_WIDTH);
            case "124":
                return bufferedImage.getSubimage(128, 256, TILE_WIDTH, TILE_WIDTH);
            case "125":
                return bufferedImage.getSubimage(160, 256, TILE_WIDTH, TILE_WIDTH);
            case "126":
                return bufferedImage.getSubimage(192, 256, TILE_WIDTH, TILE_WIDTH);
            case "127":
                return bufferedImage.getSubimage(224, 256, TILE_WIDTH, TILE_WIDTH);
            case "128":
                return bufferedImage.getSubimage(256, 256, TILE_WIDTH, TILE_WIDTH);
            case "129":
                return bufferedImage.getSubimage(288, 256, TILE_WIDTH, TILE_WIDTH);
            case "130":
                return bufferedImage.getSubimage(320, 256, TILE_WIDTH, TILE_WIDTH);
            case "131":
                return bufferedImage.getSubimage(352, 256, TILE_WIDTH, TILE_WIDTH);
            case "132":
                return bufferedImage.getSubimage(384, 256, TILE_WIDTH, TILE_WIDTH);
            case "133":
                return bufferedImage.getSubimage(416, 256, TILE_WIDTH, TILE_WIDTH);
            case "134":
                return bufferedImage.getSubimage(448, 256, TILE_WIDTH, TILE_WIDTH);
            case "135":
                return bufferedImage.getSubimage(0, 288, TILE_WIDTH, TILE_WIDTH);
            case "136":
                return bufferedImage.getSubimage(32, 288, TILE_WIDTH, TILE_WIDTH);
            case "137":
                return bufferedImage.getSubimage(64, 288, TILE_WIDTH, TILE_WIDTH);
            case "138":
                return bufferedImage.getSubimage(96, 288, TILE_WIDTH, TILE_WIDTH);
            case "139":
                return bufferedImage.getSubimage(128, 288, TILE_WIDTH, TILE_WIDTH);
            case "140":
                return bufferedImage.getSubimage(160, 288, TILE_WIDTH, TILE_WIDTH);
            case "141":
                return bufferedImage.getSubimage(192, 288, TILE_WIDTH, TILE_WIDTH);
            case "142":
                return bufferedImage.getSubimage(224, 288, TILE_WIDTH, TILE_WIDTH);
            case "143":
                return bufferedImage.getSubimage(256, 288, TILE_WIDTH, TILE_WIDTH);
            case "144":
                return bufferedImage.getSubimage(288, 288, TILE_WIDTH, TILE_WIDTH);
            case "145":
                return bufferedImage.getSubimage(320, 288, TILE_WIDTH, TILE_WIDTH);
            case "146":
                return bufferedImage.getSubimage(352, 288, TILE_WIDTH, TILE_WIDTH);
            case "147":
                return bufferedImage.getSubimage(384, 288, TILE_WIDTH, TILE_WIDTH);
            case "148":
                return bufferedImage.getSubimage(416, 288, TILE_WIDTH, TILE_WIDTH);
            case "149":
                return bufferedImage.getSubimage(448, 288, TILE_WIDTH, TILE_WIDTH);
            case "150":
                return bufferedImage.getSubimage(0, 320, TILE_WIDTH, TILE_WIDTH);
            case "151":
                return bufferedImage.getSubimage(32, 320, TILE_WIDTH, TILE_WIDTH);
            case "152":
                return bufferedImage.getSubimage(64, 320, TILE_WIDTH, TILE_WIDTH);
            case "153":
                return bufferedImage.getSubimage(96, 320, TILE_WIDTH, TILE_WIDTH);
            case "154":
                return bufferedImage.getSubimage(128, 320, TILE_WIDTH, TILE_WIDTH);
            case "155":
                return bufferedImage.getSubimage(160, 320, TILE_WIDTH, TILE_WIDTH);
            case "156":
                return bufferedImage.getSubimage(192, 320, TILE_WIDTH, TILE_WIDTH);
            case "157":
                return bufferedImage.getSubimage(224, 320, TILE_WIDTH, TILE_WIDTH);
            case "158":
                return bufferedImage.getSubimage(256, 320, TILE_WIDTH, TILE_WIDTH);
            case "159":
                return bufferedImage.getSubimage(288, 320, TILE_WIDTH, TILE_WIDTH);
            case "160":
                return bufferedImage.getSubimage(320, 320, TILE_WIDTH, TILE_WIDTH);
            case "161":
                return bufferedImage.getSubimage(352, 320, TILE_WIDTH, TILE_WIDTH);
            case "162":
                return bufferedImage.getSubimage(384, 320, TILE_WIDTH, TILE_WIDTH);
            case "163":
                return bufferedImage.getSubimage(416, 320, TILE_WIDTH, TILE_WIDTH);
            case "164":
                return bufferedImage.getSubimage(448, 320, TILE_WIDTH, TILE_WIDTH);
            case "165":
                return bufferedImage.getSubimage(0, 352, TILE_WIDTH, TILE_WIDTH);
            case "166":
                return bufferedImage.getSubimage(32, 352, TILE_WIDTH, TILE_WIDTH);
            case "167":
                return bufferedImage.getSubimage(64, 352, TILE_WIDTH, TILE_WIDTH);
            case "168":
                return bufferedImage.getSubimage(96, 352, TILE_WIDTH, TILE_WIDTH);
            case "169":
                return bufferedImage.getSubimage(128, 352, TILE_WIDTH, TILE_WIDTH);
            case "170":
                return bufferedImage.getSubimage(160, 352, TILE_WIDTH, TILE_WIDTH);
            case "171":
                return bufferedImage.getSubimage(192, 352, TILE_WIDTH, TILE_WIDTH);
            case "172":
                return bufferedImage.getSubimage(224, 352, TILE_WIDTH, TILE_WIDTH);
            case "173":
                return bufferedImage.getSubimage(256, 352, TILE_WIDTH, TILE_WIDTH);
            case "174":
                return bufferedImage.getSubimage(288, 352, TILE_WIDTH, TILE_WIDTH);
            case "175":
                return bufferedImage.getSubimage(320, 352, TILE_WIDTH, TILE_WIDTH);
            case "176":
                return bufferedImage.getSubimage(352, 352, TILE_WIDTH, TILE_WIDTH);
            case "177":
                return bufferedImage.getSubimage(384, 352, TILE_WIDTH, TILE_WIDTH);
            case "178":
                return bufferedImage.getSubimage(416, 352, TILE_WIDTH, TILE_WIDTH);
            case "179":
                return bufferedImage.getSubimage(448, 352, TILE_WIDTH, TILE_WIDTH);
            case "180":
                return bufferedImage.getSubimage(0, 384, TILE_WIDTH, TILE_WIDTH);
            case "181":
                return bufferedImage.getSubimage(32, 384, TILE_WIDTH, TILE_WIDTH);
            case "182":
                return bufferedImage.getSubimage(64, 384, TILE_WIDTH, TILE_WIDTH);
            case "183":
                return bufferedImage.getSubimage(96, 384, TILE_WIDTH, TILE_WIDTH);
            case "184":
                return bufferedImage.getSubimage(128, 384, TILE_WIDTH, TILE_WIDTH);
            case "185":
                return bufferedImage.getSubimage(160, 384, TILE_WIDTH, TILE_WIDTH);
            case "186":
                return bufferedImage.getSubimage(192, 384, TILE_WIDTH, TILE_WIDTH);
            case "187":
                return bufferedImage.getSubimage(224, 384, TILE_WIDTH, TILE_WIDTH);
            case "188":
                return bufferedImage.getSubimage(256, 384, TILE_WIDTH, TILE_WIDTH);
            case "189":
                return bufferedImage.getSubimage(288, 384, TILE_WIDTH, TILE_WIDTH);
            case "190":
                return bufferedImage.getSubimage(320, 384, TILE_WIDTH, TILE_WIDTH);
            case "191":
                return bufferedImage.getSubimage(352, 384, TILE_WIDTH, TILE_WIDTH);
            case "192":
                return bufferedImage.getSubimage(384, 384, TILE_WIDTH, TILE_WIDTH);
            case "193":
                return bufferedImage.getSubimage(416, 384, TILE_WIDTH, TILE_WIDTH);
            case "194":
                return bufferedImage.getSubimage(448, 384, TILE_WIDTH, TILE_WIDTH);
            case "195":
                return bufferedImage.getSubimage(0, 416, TILE_WIDTH, TILE_WIDTH);
            case "196":
                return bufferedImage.getSubimage(32, 416, TILE_WIDTH, TILE_WIDTH);
            case "197":
                return bufferedImage.getSubimage(64, 416, TILE_WIDTH, TILE_WIDTH);
            case "198":
                return bufferedImage.getSubimage(96, 416, TILE_WIDTH, TILE_WIDTH);
            case "199":
                return bufferedImage.getSubimage(128, 416, TILE_WIDTH, TILE_WIDTH);
            case "200":
                return bufferedImage.getSubimage(160, 416, TILE_WIDTH, TILE_WIDTH);
            case "201":
                return bufferedImage.getSubimage(192, 416, TILE_WIDTH, TILE_WIDTH);
            case "202":
                return bufferedImage.getSubimage(224, 416, TILE_WIDTH, TILE_WIDTH);
            case "203":
                return bufferedImage.getSubimage(256, 416, TILE_WIDTH, TILE_WIDTH);
            case "204":
                return bufferedImage.getSubimage(288, 416, TILE_WIDTH, TILE_WIDTH);
            case "205":
                return bufferedImage.getSubimage(320, 416, TILE_WIDTH, TILE_WIDTH);
            case "206":
                return bufferedImage.getSubimage(352, 416, TILE_WIDTH, TILE_WIDTH);
            case "207":
                return bufferedImage.getSubimage(384, 416, TILE_WIDTH, TILE_WIDTH);
            case "208":
                return bufferedImage.getSubimage(416, 416, TILE_WIDTH, TILE_WIDTH);
            case "209":
                return bufferedImage.getSubimage(448, 416, TILE_WIDTH, TILE_WIDTH);
            case "210":
                return bufferedImage.getSubimage(0, 448, TILE_WIDTH, TILE_WIDTH);
            case "211":
                return bufferedImage.getSubimage(32, 448, TILE_WIDTH, TILE_WIDTH);
            case "212":
                return bufferedImage.getSubimage(64, 448, TILE_WIDTH, TILE_WIDTH);
            case "213":
                return bufferedImage.getSubimage(96, 448, TILE_WIDTH, TILE_WIDTH);
            case "214":
                return bufferedImage.getSubimage(128, 448, TILE_WIDTH, TILE_WIDTH);
            case "215":
                return bufferedImage.getSubimage(160, 448, TILE_WIDTH, TILE_WIDTH);
            case "216":
                return bufferedImage.getSubimage(192, 448, TILE_WIDTH, TILE_WIDTH);
            case "217":
                return bufferedImage.getSubimage(224, 448, TILE_WIDTH, TILE_WIDTH);
            case "218":
                return bufferedImage.getSubimage(256, 448, TILE_WIDTH, TILE_WIDTH);
            case "219":
                return bufferedImage.getSubimage(288, 448, TILE_WIDTH, TILE_WIDTH);
            case "220":
                return bufferedImage.getSubimage(320, 448, TILE_WIDTH, TILE_WIDTH);
            case "221":
                return bufferedImage.getSubimage(352, 448, TILE_WIDTH, TILE_WIDTH);
            case "222":
                return bufferedImage.getSubimage(384, 448, TILE_WIDTH, TILE_WIDTH);
            case "223":
                return bufferedImage.getSubimage(416, 448, TILE_WIDTH, TILE_WIDTH);
            case "224":
                return bufferedImage.getSubimage(448, 448, TILE_WIDTH, TILE_WIDTH);
            case "225":
                return bufferedImage.getSubimage(0, 480, TILE_WIDTH, TILE_WIDTH);
            case "226":
                return bufferedImage.getSubimage(32, 480, TILE_WIDTH, TILE_WIDTH);
            case "227":
                return bufferedImage.getSubimage(64, 480, TILE_WIDTH, TILE_WIDTH);
            case "228":
                return bufferedImage.getSubimage(96, 480, TILE_WIDTH, TILE_WIDTH);
            case "229":
                return bufferedImage.getSubimage(128, 480, TILE_WIDTH, TILE_WIDTH);
            case "230":
                return bufferedImage.getSubimage(160, 480, TILE_WIDTH, TILE_WIDTH);
            case "231":
                return bufferedImage.getSubimage(192, 480, TILE_WIDTH, TILE_WIDTH);
            case "232":
                return bufferedImage.getSubimage(224, 480, TILE_WIDTH, TILE_WIDTH);
            case "233":
                return bufferedImage.getSubimage(256, 480, TILE_WIDTH, TILE_WIDTH);
            case "234":
                return bufferedImage.getSubimage(288, 480, TILE_WIDTH, TILE_WIDTH);
            case "235":
                return bufferedImage.getSubimage(320, 480, TILE_WIDTH, TILE_WIDTH);
            case "236":
                return bufferedImage.getSubimage(352, 480, TILE_WIDTH, TILE_WIDTH);
            case "237":
                return bufferedImage.getSubimage(384, 480, TILE_WIDTH, TILE_WIDTH);
            case "238":
                return bufferedImage.getSubimage(416, 480, TILE_WIDTH, TILE_WIDTH);
            case "239":
                return bufferedImage.getSubimage(448, 480, TILE_WIDTH, TILE_WIDTH);
            case "240":
                return bufferedImage.getSubimage(0, 512, TILE_WIDTH, TILE_WIDTH);
            case "241":
                return bufferedImage.getSubimage(32, 512, TILE_WIDTH, TILE_WIDTH);
            case "242":
                return bufferedImage.getSubimage(64, 512, TILE_WIDTH, TILE_WIDTH);
            case "243":
                return bufferedImage.getSubimage(96, 512, TILE_WIDTH, TILE_WIDTH);
            case "244":
                return bufferedImage.getSubimage(128, 512, TILE_WIDTH, TILE_WIDTH);
            case "245":
                return bufferedImage.getSubimage(160, 512, TILE_WIDTH, TILE_WIDTH);
            case "246":
                return bufferedImage.getSubimage(192, 512, TILE_WIDTH, TILE_WIDTH);
            case "247":
                return bufferedImage.getSubimage(224, 512, TILE_WIDTH, TILE_WIDTH);
            case "248":
                return bufferedImage.getSubimage(256, 512, TILE_WIDTH, TILE_WIDTH);
            case "249":
                return bufferedImage.getSubimage(288, 512, TILE_WIDTH, TILE_WIDTH);
            case "250":
                return bufferedImage.getSubimage(320, 512, TILE_WIDTH, TILE_WIDTH);
            case "251":
                return bufferedImage.getSubimage(352, 512, TILE_WIDTH, TILE_WIDTH);
            case "252":
                return bufferedImage.getSubimage(384, 512, TILE_WIDTH, TILE_WIDTH);
            case "253":
                return bufferedImage.getSubimage(416, 512, TILE_WIDTH, TILE_WIDTH);
            case "254":
                return bufferedImage.getSubimage(448, 512, TILE_WIDTH, TILE_WIDTH);
            case "255":
                return bufferedImage.getSubimage(0, 544, TILE_WIDTH, TILE_WIDTH);
            case "256":
                return bufferedImage.getSubimage(32, 544, TILE_WIDTH, TILE_WIDTH);
            case "257":
                return bufferedImage.getSubimage(64, 544, TILE_WIDTH, TILE_WIDTH);
            case "258":
                return bufferedImage.getSubimage(96, 544, TILE_WIDTH, TILE_WIDTH);
            case "259":
                return bufferedImage.getSubimage(128, 544, TILE_WIDTH, TILE_WIDTH);
            case "260":
                return bufferedImage.getSubimage(160, 544, TILE_WIDTH, TILE_WIDTH);
            case "261":
                return bufferedImage.getSubimage(192, 544, TILE_WIDTH, TILE_WIDTH);
            case "262":
                return bufferedImage.getSubimage(224, 544, TILE_WIDTH, TILE_WIDTH);
            case "263":
                return bufferedImage.getSubimage(256, 544, TILE_WIDTH, TILE_WIDTH);
            case "264":
                return bufferedImage.getSubimage(288, 544, TILE_WIDTH, TILE_WIDTH);
            case "265":
                return bufferedImage.getSubimage(320, 544, TILE_WIDTH, TILE_WIDTH);
            case "266":
                return bufferedImage.getSubimage(352, 544, TILE_WIDTH, TILE_WIDTH);
            case "267":
                return bufferedImage.getSubimage(384, 544, TILE_WIDTH, TILE_WIDTH);
            case "268":
                return bufferedImage.getSubimage(416, 544, TILE_WIDTH, TILE_WIDTH);
            case "269":
                return bufferedImage.getSubimage(448, 544, TILE_WIDTH, TILE_WIDTH);
            case "270":
                return bufferedImage.getSubimage(0, 576, TILE_WIDTH, TILE_WIDTH);
            case "271":
                return bufferedImage.getSubimage(32, 576, TILE_WIDTH, TILE_WIDTH);
            case "272":
                return bufferedImage.getSubimage(64, 576, TILE_WIDTH, TILE_WIDTH);
            case "273":
                return bufferedImage.getSubimage(96, 576, TILE_WIDTH, TILE_WIDTH);
            case "274":
                return bufferedImage.getSubimage(128, 576, TILE_WIDTH, TILE_WIDTH);
            case "275":
                return bufferedImage.getSubimage(160, 576, TILE_WIDTH, TILE_WIDTH);
            case "276":
                return bufferedImage.getSubimage(192, 576, TILE_WIDTH, TILE_WIDTH);
            case "277":
                return bufferedImage.getSubimage(224, 576, TILE_WIDTH, TILE_WIDTH);
            case "278":
                return bufferedImage.getSubimage(256, 576, TILE_WIDTH, TILE_WIDTH);
            case "279":
                return bufferedImage.getSubimage(288, 576, TILE_WIDTH, TILE_WIDTH);
            case "280":
                return bufferedImage.getSubimage(320, 576, TILE_WIDTH, TILE_WIDTH);
            case "281":
                return bufferedImage.getSubimage(352, 576, TILE_WIDTH, TILE_WIDTH);
            case "282":
                return bufferedImage.getSubimage(384, 576, TILE_WIDTH, TILE_WIDTH);
            case "283":
                return bufferedImage.getSubimage(416, 576, TILE_WIDTH, TILE_WIDTH);
            case "284":
                return bufferedImage.getSubimage(448, 576, TILE_WIDTH, TILE_WIDTH);
            case "285":
                return bufferedImage.getSubimage(0, 608, TILE_WIDTH, TILE_WIDTH);
            case "286":
                return bufferedImage.getSubimage(32, 608, TILE_WIDTH, TILE_WIDTH);
            case "287":
                return bufferedImage.getSubimage(64, 608, TILE_WIDTH, TILE_WIDTH);
            case "288":
                return bufferedImage.getSubimage(96, 608, TILE_WIDTH, TILE_WIDTH);
            case "289":
                return bufferedImage.getSubimage(128, 608, TILE_WIDTH, TILE_WIDTH);
            case "290":
                return bufferedImage.getSubimage(160, 608, TILE_WIDTH, TILE_WIDTH);
            case "291":
                return bufferedImage.getSubimage(192, 608, TILE_WIDTH, TILE_WIDTH);
            case "292":
                return bufferedImage.getSubimage(224, 608, TILE_WIDTH, TILE_WIDTH);
            case "293":
                return bufferedImage.getSubimage(256, 608, TILE_WIDTH, TILE_WIDTH);
            case "294":
                return bufferedImage.getSubimage(288, 608, TILE_WIDTH, TILE_WIDTH);
            case "295":
                return bufferedImage.getSubimage(320, 608, TILE_WIDTH, TILE_WIDTH);
            case "296":
                return bufferedImage.getSubimage(352, 608, TILE_WIDTH, TILE_WIDTH);
            case "297":
                return bufferedImage.getSubimage(384, 608, TILE_WIDTH, TILE_WIDTH);
            case "298":
                return bufferedImage.getSubimage(416, 608, TILE_WIDTH, TILE_WIDTH);
            case "299":
                return bufferedImage.getSubimage(448, 608, TILE_WIDTH, TILE_WIDTH);
            case "300":
                return bufferedImage.getSubimage(0, 640, TILE_WIDTH, TILE_WIDTH);
            case "301":
                return bufferedImage.getSubimage(32, 640, TILE_WIDTH, TILE_WIDTH);
            case "302":
                return bufferedImage.getSubimage(64, 640, TILE_WIDTH, TILE_WIDTH);
            case "303":
                return bufferedImage.getSubimage(96, 640, TILE_WIDTH, TILE_WIDTH);
            case "304":
                return bufferedImage.getSubimage(128, 640, TILE_WIDTH, TILE_WIDTH);
            case "305":
                return bufferedImage.getSubimage(160, 640, TILE_WIDTH, TILE_WIDTH);
            case "306":
                return bufferedImage.getSubimage(192, 640, TILE_WIDTH, TILE_WIDTH);
            case "307":
                return bufferedImage.getSubimage(224, 640, TILE_WIDTH, TILE_WIDTH);
            case "308":
                return bufferedImage.getSubimage(256, 640, TILE_WIDTH, TILE_WIDTH);
            case "309":
                return bufferedImage.getSubimage(288, 640, TILE_WIDTH, TILE_WIDTH);
            case "310":
                return bufferedImage.getSubimage(320, 640, TILE_WIDTH, TILE_WIDTH);
            case "311":
                return bufferedImage.getSubimage(352, 640, TILE_WIDTH, TILE_WIDTH);
            case "312":
                return bufferedImage.getSubimage(384, 640, TILE_WIDTH, TILE_WIDTH);
            case "313":
                return bufferedImage.getSubimage(416, 640, TILE_WIDTH, TILE_WIDTH);
            case "314":
                return bufferedImage.getSubimage(448, 640, TILE_WIDTH, TILE_WIDTH);
            case "315":
                return bufferedImage.getSubimage(0, 672, TILE_WIDTH, TILE_WIDTH);
            case "316":
                return bufferedImage.getSubimage(32, 672, TILE_WIDTH, TILE_WIDTH);
            case "317":
                return bufferedImage.getSubimage(64, 672, TILE_WIDTH, TILE_WIDTH);
            case "318":
                return bufferedImage.getSubimage(96, 672, TILE_WIDTH, TILE_WIDTH);
            case "319":
                return bufferedImage.getSubimage(128, 672, TILE_WIDTH, TILE_WIDTH);
            case "320":
                return bufferedImage.getSubimage(160, 672, TILE_WIDTH, TILE_WIDTH);
            case "321":
                return bufferedImage.getSubimage(192, 672, TILE_WIDTH, TILE_WIDTH);
            case "322":
                return bufferedImage.getSubimage(224, 672, TILE_WIDTH, TILE_WIDTH);
            case "323":
                return bufferedImage.getSubimage(256, 672, TILE_WIDTH, TILE_WIDTH);
            case "324":
                return bufferedImage.getSubimage(288, 672, TILE_WIDTH, TILE_WIDTH);
            case "325":
                return bufferedImage.getSubimage(320, 672, TILE_WIDTH, TILE_WIDTH);
            case "326":
                return bufferedImage.getSubimage(352, 672, TILE_WIDTH, TILE_WIDTH);
            case "327":
                return bufferedImage.getSubimage(384, 672, TILE_WIDTH, TILE_WIDTH);
            case "328":
                return bufferedImage.getSubimage(416, 672, TILE_WIDTH, TILE_WIDTH);
            case "329":
                return bufferedImage.getSubimage(448, 672, TILE_WIDTH, TILE_WIDTH);
            case "330":
                return bufferedImage.getSubimage(0, 704, TILE_WIDTH, TILE_WIDTH);
            case "331":
                return bufferedImage.getSubimage(32, 704, TILE_WIDTH, TILE_WIDTH);
            case "332":
                return bufferedImage.getSubimage(64, 704, TILE_WIDTH, TILE_WIDTH);
            case "333":
                return bufferedImage.getSubimage(96, 704, TILE_WIDTH, TILE_WIDTH);
            case "334":
                return bufferedImage.getSubimage(128, 704, TILE_WIDTH, TILE_WIDTH);
            case "335":
                return bufferedImage.getSubimage(160, 704, TILE_WIDTH, TILE_WIDTH);
            case "336":
                return bufferedImage.getSubimage(192, 704, TILE_WIDTH, TILE_WIDTH);
            case "337":
                return bufferedImage.getSubimage(224, 704, TILE_WIDTH, TILE_WIDTH);
            case "338":
                return bufferedImage.getSubimage(256, 704, TILE_WIDTH, TILE_WIDTH);
            case "339":
                return bufferedImage.getSubimage(288, 704, TILE_WIDTH, TILE_WIDTH);
            case "340":
                return bufferedImage.getSubimage(320, 704, TILE_WIDTH, TILE_WIDTH);
            case "341":
                return bufferedImage.getSubimage(352, 704, TILE_WIDTH, TILE_WIDTH);
            case "342":
                return bufferedImage.getSubimage(384, 704, TILE_WIDTH, TILE_WIDTH);
            case "343":
                return bufferedImage.getSubimage(416, 704, TILE_WIDTH, TILE_WIDTH);
            case "344":
                return bufferedImage.getSubimage(448, 704, TILE_WIDTH, TILE_WIDTH);
            case "345":
                return bufferedImage.getSubimage(0, 736, TILE_WIDTH, TILE_WIDTH);
            case "346":
                return bufferedImage.getSubimage(32, 736, TILE_WIDTH, TILE_WIDTH);
            case "347":
                return bufferedImage.getSubimage(64, 736, TILE_WIDTH, TILE_WIDTH);
            case "348":
                return bufferedImage.getSubimage(96, 736, TILE_WIDTH, TILE_WIDTH);
            case "349":
                return bufferedImage.getSubimage(128, 736, TILE_WIDTH, TILE_WIDTH);
            case "350":
                return bufferedImage.getSubimage(160, 736, TILE_WIDTH, TILE_WIDTH);
            case "351":
                return bufferedImage.getSubimage(192, 736, TILE_WIDTH, TILE_WIDTH);
            case "352":
                return bufferedImage.getSubimage(224, 736, TILE_WIDTH, TILE_WIDTH);
            case "353":
                return bufferedImage.getSubimage(256, 736, TILE_WIDTH, TILE_WIDTH);
            case "354":
                return bufferedImage.getSubimage(288, 736, TILE_WIDTH, TILE_WIDTH);
            case "355":
                return bufferedImage.getSubimage(320, 736, TILE_WIDTH, TILE_WIDTH);
            case "356":
                return bufferedImage.getSubimage(352, 736, TILE_WIDTH, TILE_WIDTH);
            case "357":
                return bufferedImage.getSubimage(384, 736, TILE_WIDTH, TILE_WIDTH);
            case "358":
                return bufferedImage.getSubimage(416, 736, TILE_WIDTH, TILE_WIDTH);
            case "359":
                return bufferedImage.getSubimage(448, 736, TILE_WIDTH, TILE_WIDTH);
            case "360":
                return bufferedImage.getSubimage(0, 768, TILE_WIDTH, TILE_WIDTH);
            case "361":
                return bufferedImage.getSubimage(32, 768, TILE_WIDTH, TILE_WIDTH);
            case "362":
                return bufferedImage.getSubimage(64, 768, TILE_WIDTH, TILE_WIDTH);
            case "363":
                return bufferedImage.getSubimage(96, 768, TILE_WIDTH, TILE_WIDTH);
            case "364":
                return bufferedImage.getSubimage(128, 768, TILE_WIDTH, TILE_WIDTH);
            case "365":
                return bufferedImage.getSubimage(160, 768, TILE_WIDTH, TILE_WIDTH);
            case "366":
                return bufferedImage.getSubimage(192, 768, TILE_WIDTH, TILE_WIDTH);
            case "367":
                return bufferedImage.getSubimage(224, 768, TILE_WIDTH, TILE_WIDTH);
            case "368":
                return bufferedImage.getSubimage(256, 768, TILE_WIDTH, TILE_WIDTH);
            case "369":
                return bufferedImage.getSubimage(288, 768, TILE_WIDTH, TILE_WIDTH);
            case "370":
                return bufferedImage.getSubimage(320, 768, TILE_WIDTH, TILE_WIDTH);
            case "371":
                return bufferedImage.getSubimage(352, 768, TILE_WIDTH, TILE_WIDTH);
            case "372":
                return bufferedImage.getSubimage(384, 768, TILE_WIDTH, TILE_WIDTH);
            case "373":
                return bufferedImage.getSubimage(416, 768, TILE_WIDTH, TILE_WIDTH);
            case "374":
                return bufferedImage.getSubimage(448, 768, TILE_WIDTH, TILE_WIDTH);
            case "375":
                return bufferedImage.getSubimage(0, 800, TILE_WIDTH, TILE_WIDTH);
            case "376":
                return bufferedImage.getSubimage(32, 800, TILE_WIDTH, TILE_WIDTH);
            case "377":
                return bufferedImage.getSubimage(64, 800, TILE_WIDTH, TILE_WIDTH);
            case "378":
                return bufferedImage.getSubimage(96, 800, TILE_WIDTH, TILE_WIDTH);
            case "379":
                return bufferedImage.getSubimage(128, 800, TILE_WIDTH, TILE_WIDTH);
            case "380":
                return bufferedImage.getSubimage(160, 800, TILE_WIDTH, TILE_WIDTH);
            case "381":
                return bufferedImage.getSubimage(192, 800, TILE_WIDTH, TILE_WIDTH);
            case "382":
                return bufferedImage.getSubimage(224, 800, TILE_WIDTH, TILE_WIDTH);
            case "383":
                return bufferedImage.getSubimage(256, 800, TILE_WIDTH, TILE_WIDTH);
            case "384":
                return bufferedImage.getSubimage(288, 800, TILE_WIDTH, TILE_WIDTH);
            case "385":
                return bufferedImage.getSubimage(320, 800, TILE_WIDTH, TILE_WIDTH);
            case "386":
                return bufferedImage.getSubimage(352, 800, TILE_WIDTH, TILE_WIDTH);
            case "387":
                return bufferedImage.getSubimage(384, 800, TILE_WIDTH, TILE_WIDTH);
            case "388":
                return bufferedImage.getSubimage(416, 800, TILE_WIDTH, TILE_WIDTH);
            case "389":
                return bufferedImage.getSubimage(448, 800, TILE_WIDTH, TILE_WIDTH);
            case "390":
                return bufferedImage.getSubimage(0, 832, TILE_WIDTH, TILE_WIDTH);
            case "391":
                return bufferedImage.getSubimage(32, 832, TILE_WIDTH, TILE_WIDTH);
            case "392":
                return bufferedImage.getSubimage(64, 832, TILE_WIDTH, TILE_WIDTH);
            case "393":
                return bufferedImage.getSubimage(96, 832, TILE_WIDTH, TILE_WIDTH);
            case "394":
                return bufferedImage.getSubimage(128, 832, TILE_WIDTH, TILE_WIDTH);
            case "395":
                return bufferedImage.getSubimage(160, 832, TILE_WIDTH, TILE_WIDTH);
            case "396":
                return bufferedImage.getSubimage(192, 832, TILE_WIDTH, TILE_WIDTH);
            case "397":
                return bufferedImage.getSubimage(224, 832, TILE_WIDTH, TILE_WIDTH);
            case "398":
                return bufferedImage.getSubimage(256, 832, TILE_WIDTH, TILE_WIDTH);
            case "399":
                return bufferedImage.getSubimage(288, 832, TILE_WIDTH, TILE_WIDTH);
            case "400":
                return bufferedImage.getSubimage(320, 832, TILE_WIDTH, TILE_WIDTH);
            case "401":
                return bufferedImage.getSubimage(352, 832, TILE_WIDTH, TILE_WIDTH);
            case "402":
                return bufferedImage.getSubimage(384, 832, TILE_WIDTH, TILE_WIDTH);
            case "403":
                return bufferedImage.getSubimage(416, 832, TILE_WIDTH, TILE_WIDTH);
            case "404":
                return bufferedImage.getSubimage(448, 832, TILE_WIDTH, TILE_WIDTH);
            case "405":
                return bufferedImage.getSubimage(0, 864, TILE_WIDTH, TILE_WIDTH);
            case "406":
                return bufferedImage.getSubimage(32, 864, TILE_WIDTH, TILE_WIDTH);
            case "407":
                return bufferedImage.getSubimage(64, 864, TILE_WIDTH, TILE_WIDTH);
            case "408":
                return bufferedImage.getSubimage(96, 864, TILE_WIDTH, TILE_WIDTH);
            case "409":
                return bufferedImage.getSubimage(128, 864, TILE_WIDTH, TILE_WIDTH);
            case "410":
                return bufferedImage.getSubimage(160, 864, TILE_WIDTH, TILE_WIDTH);
            case "411":
                return bufferedImage.getSubimage(192, 864, TILE_WIDTH, TILE_WIDTH);
            case "412":
                return bufferedImage.getSubimage(224, 864, TILE_WIDTH, TILE_WIDTH);
            case "413":
                return bufferedImage.getSubimage(256, 864, TILE_WIDTH, TILE_WIDTH);
            case "414":
                return bufferedImage.getSubimage(288, 864, TILE_WIDTH, TILE_WIDTH);
            case "415":
                return bufferedImage.getSubimage(320, 864, TILE_WIDTH, TILE_WIDTH);
            case "416":
                return bufferedImage.getSubimage(352, 864, TILE_WIDTH, TILE_WIDTH);
            case "417":
                return bufferedImage.getSubimage(384, 864, TILE_WIDTH, TILE_WIDTH);
            case "418":
                return bufferedImage.getSubimage(416, 864, TILE_WIDTH, TILE_WIDTH);
            case "419":
                return bufferedImage.getSubimage(448, 864, TILE_WIDTH, TILE_WIDTH);
            case "420":
                return bufferedImage.getSubimage(0, 896, TILE_WIDTH, TILE_WIDTH);
            case "421":
                return bufferedImage.getSubimage(32, 896, TILE_WIDTH, TILE_WIDTH);
            case "422":
                return bufferedImage.getSubimage(64, 896, TILE_WIDTH, TILE_WIDTH);
            case "423":
                return bufferedImage.getSubimage(96, 896, TILE_WIDTH, TILE_WIDTH);
            case "424":
                return bufferedImage.getSubimage(128, 896, TILE_WIDTH, TILE_WIDTH);
            case "425":
                return bufferedImage.getSubimage(160, 896, TILE_WIDTH, TILE_WIDTH);
            case "426":
                return bufferedImage.getSubimage(192, 896, TILE_WIDTH, TILE_WIDTH);
            case "427":
                return bufferedImage.getSubimage(224, 896, TILE_WIDTH, TILE_WIDTH);
            case "428":
                return bufferedImage.getSubimage(256, 896, TILE_WIDTH, TILE_WIDTH);
            case "429":
                return bufferedImage.getSubimage(288, 896, TILE_WIDTH, TILE_WIDTH);
            case "430":
                return bufferedImage.getSubimage(320, 896, TILE_WIDTH, TILE_WIDTH);
            case "431":
                return bufferedImage.getSubimage(352, 896, TILE_WIDTH, TILE_WIDTH);
            case "432":
                return bufferedImage.getSubimage(384, 896, TILE_WIDTH, TILE_WIDTH);
            case "433":
                return bufferedImage.getSubimage(416, 896, TILE_WIDTH, TILE_WIDTH);
            case "434":
                return bufferedImage.getSubimage(448, 896, TILE_WIDTH, TILE_WIDTH);
            case "435":
                return bufferedImage.getSubimage(0, 928, TILE_WIDTH, TILE_WIDTH);
            case "436":
                return bufferedImage.getSubimage(32, 928, TILE_WIDTH, TILE_WIDTH);
            case "437":
                return bufferedImage.getSubimage(64, 928, TILE_WIDTH, TILE_WIDTH);
            case "438":
                return bufferedImage.getSubimage(96, 928, TILE_WIDTH, TILE_WIDTH);
            case "439":
                return bufferedImage.getSubimage(128, 928, TILE_WIDTH, TILE_WIDTH);
            case "440":
                return bufferedImage.getSubimage(160, 928, TILE_WIDTH, TILE_WIDTH);
            case "441":
                return bufferedImage.getSubimage(192, 928, TILE_WIDTH, TILE_WIDTH);
            case "442":
                return bufferedImage.getSubimage(224, 928, TILE_WIDTH, TILE_WIDTH);
            case "443":
                return bufferedImage.getSubimage(256, 928, TILE_WIDTH, TILE_WIDTH);
            case "444":
                return bufferedImage.getSubimage(288, 928, TILE_WIDTH, TILE_WIDTH);
            case "445":
                return bufferedImage.getSubimage(320, 928, TILE_WIDTH, TILE_WIDTH);
            case "446":
                return bufferedImage.getSubimage(352, 928, TILE_WIDTH, TILE_WIDTH);
            case "447":
                return bufferedImage.getSubimage(384, 928, TILE_WIDTH, TILE_WIDTH);
            case "448":
                return bufferedImage.getSubimage(416, 928, TILE_WIDTH, TILE_WIDTH);
            case "449":
                return bufferedImage.getSubimage(448, 928, TILE_WIDTH, TILE_WIDTH);
            case "450":
                return bufferedImage.getSubimage(0, 960, TILE_WIDTH, TILE_WIDTH);
            case "451":
                return bufferedImage.getSubimage(32, 960, TILE_WIDTH, TILE_WIDTH);
            case "452":
                return bufferedImage.getSubimage(64, 960, TILE_WIDTH, TILE_WIDTH);
            case "453":
                return bufferedImage.getSubimage(96, 960, TILE_WIDTH, TILE_WIDTH);
            case "454":
                return bufferedImage.getSubimage(128, 960, TILE_WIDTH, TILE_WIDTH);
            case "455":
                return bufferedImage.getSubimage(160, 960, TILE_WIDTH, TILE_WIDTH);
            case "456":
                return bufferedImage.getSubimage(192, 960, TILE_WIDTH, TILE_WIDTH);
            case "457":
                return bufferedImage.getSubimage(224, 960, TILE_WIDTH, TILE_WIDTH);
            case "458":
                return bufferedImage.getSubimage(256, 960, TILE_WIDTH, TILE_WIDTH);
            case "459":
                return bufferedImage.getSubimage(288, 960, TILE_WIDTH, TILE_WIDTH);
            case "460":
                return bufferedImage.getSubimage(320, 960, TILE_WIDTH, TILE_WIDTH);
            case "461":
                return bufferedImage.getSubimage(352, 960, TILE_WIDTH, TILE_WIDTH);
            case "462":
                return bufferedImage.getSubimage(384, 960, TILE_WIDTH, TILE_WIDTH);
            case "463":
                return bufferedImage.getSubimage(416, 960, TILE_WIDTH, TILE_WIDTH);
            case "464":
                return bufferedImage.getSubimage(448, 960, TILE_WIDTH, TILE_WIDTH);
            case "465":
                return bufferedImage.getSubimage(0, 992, TILE_WIDTH, TILE_WIDTH);
            case "466":
                return bufferedImage.getSubimage(32, 992, TILE_WIDTH, TILE_WIDTH);
            case "467":
                return bufferedImage.getSubimage(64, 992, TILE_WIDTH, TILE_WIDTH);
            case "468":
                return bufferedImage.getSubimage(96, 992, TILE_WIDTH, TILE_WIDTH);
            case "469":
                return bufferedImage.getSubimage(128, 992, TILE_WIDTH, TILE_WIDTH);
            case "470":
                return bufferedImage.getSubimage(160, 992, TILE_WIDTH, TILE_WIDTH);
            case "471":
                return bufferedImage.getSubimage(192, 992, TILE_WIDTH, TILE_WIDTH);
            case "472":
                return bufferedImage.getSubimage(224, 992, TILE_WIDTH, TILE_WIDTH);
            case "473":
                return bufferedImage.getSubimage(256, 992, TILE_WIDTH, TILE_WIDTH);
            case "474":
                return bufferedImage.getSubimage(288, 992, TILE_WIDTH, TILE_WIDTH);
            case "475":
                return bufferedImage.getSubimage(320, 992, TILE_WIDTH, TILE_WIDTH);
            case "476":
                return bufferedImage.getSubimage(352, 992, TILE_WIDTH, TILE_WIDTH);
            case "477":
                return bufferedImage.getSubimage(384, 992, TILE_WIDTH, TILE_WIDTH);
            case "478":
                return bufferedImage.getSubimage(416, 992, TILE_WIDTH, TILE_WIDTH);
            case "479":
                return bufferedImage.getSubimage(448, 992, TILE_WIDTH, TILE_WIDTH);
            case "480":
                return bufferedImage.getSubimage(0, 1024, TILE_WIDTH, TILE_WIDTH);
            case "481":
                return bufferedImage.getSubimage(32, 1024, TILE_WIDTH, TILE_WIDTH);
            case "482":
                return bufferedImage.getSubimage(64, 1024, TILE_WIDTH, TILE_WIDTH);
            case "483":
                return bufferedImage.getSubimage(96, 1024, TILE_WIDTH, TILE_WIDTH);
            case "484":
                return bufferedImage.getSubimage(128, 1024, TILE_WIDTH, TILE_WIDTH);
            case "485":
                return bufferedImage.getSubimage(160, 1024, TILE_WIDTH, TILE_WIDTH);
            case "486":
                return bufferedImage.getSubimage(192, 1024, TILE_WIDTH, TILE_WIDTH);
            case "487":
                return bufferedImage.getSubimage(224, 1024, TILE_WIDTH, TILE_WIDTH);
            case "488":
                return bufferedImage.getSubimage(256, 1024, TILE_WIDTH, TILE_WIDTH);
            case "489":
                return bufferedImage.getSubimage(288, 1024, TILE_WIDTH, TILE_WIDTH);
            case "490":
                return bufferedImage.getSubimage(320, 1024, TILE_WIDTH, TILE_WIDTH);
            case "491":
                return bufferedImage.getSubimage(352, 1024, TILE_WIDTH, TILE_WIDTH);
            case "492":
                return bufferedImage.getSubimage(384, 1024, TILE_WIDTH, TILE_WIDTH);
            case "493":
                return bufferedImage.getSubimage(416, 1024, TILE_WIDTH, TILE_WIDTH);
            case "494":
                return bufferedImage.getSubimage(448, 1024, TILE_WIDTH, TILE_WIDTH);
            case "495":
                return bufferedImage.getSubimage(0, 1056, TILE_WIDTH, TILE_WIDTH);
            case "496":
                return bufferedImage.getSubimage(32, 1056, TILE_WIDTH, TILE_WIDTH);
            case "497":
                return bufferedImage.getSubimage(64, 1056, TILE_WIDTH, TILE_WIDTH);
            case "498":
                return bufferedImage.getSubimage(96, 1056, TILE_WIDTH, TILE_WIDTH);
            case "499":
                return bufferedImage.getSubimage(128, 1056, TILE_WIDTH, TILE_WIDTH);
            case "500":
                return bufferedImage.getSubimage(160, 1056, TILE_WIDTH, TILE_WIDTH);
            case "501":
                return bufferedImage.getSubimage(192, 1056, TILE_WIDTH, TILE_WIDTH);
            case "502":
                return bufferedImage.getSubimage(224, 1056, TILE_WIDTH, TILE_WIDTH);
            case "503":
                return bufferedImage.getSubimage(256, 1056, TILE_WIDTH, TILE_WIDTH);
            case "504":
                return bufferedImage.getSubimage(288, 1056, TILE_WIDTH, TILE_WIDTH);
            case "505":
                return bufferedImage.getSubimage(320, 1056, TILE_WIDTH, TILE_WIDTH);
            case "506":
                return bufferedImage.getSubimage(352, 1056, TILE_WIDTH, TILE_WIDTH);
            case "507":
                return bufferedImage.getSubimage(384, 1056, TILE_WIDTH, TILE_WIDTH);
            case "508":
                return bufferedImage.getSubimage(416, 1056, TILE_WIDTH, TILE_WIDTH);
            case "509":
                return bufferedImage.getSubimage(448, 1056, TILE_WIDTH, TILE_WIDTH);
            case "510":
                return bufferedImage.getSubimage(0, 1088, TILE_WIDTH, TILE_WIDTH);
            case "511":
                return bufferedImage.getSubimage(32, 1088, TILE_WIDTH, TILE_WIDTH);
            case "512":
                return bufferedImage.getSubimage(64, 1088, TILE_WIDTH, TILE_WIDTH);
            case "513":
                return bufferedImage.getSubimage(96, 1088, TILE_WIDTH, TILE_WIDTH);
            case "514":
                return bufferedImage.getSubimage(128, 1088, TILE_WIDTH, TILE_WIDTH);
            case "515":
                return bufferedImage.getSubimage(160, 1088, TILE_WIDTH, TILE_WIDTH);
            case "516":
                return bufferedImage.getSubimage(192, 1088, TILE_WIDTH, TILE_WIDTH);
            case "517":
                return bufferedImage.getSubimage(224, 1088, TILE_WIDTH, TILE_WIDTH);
            case "518":
                return bufferedImage.getSubimage(256, 1088, TILE_WIDTH, TILE_WIDTH);
            case "519":
                return bufferedImage.getSubimage(288, 1088, TILE_WIDTH, TILE_WIDTH);
            case "520":
                return bufferedImage.getSubimage(320, 1088, TILE_WIDTH, TILE_WIDTH);
            case "521":
                return bufferedImage.getSubimage(352, 1088, TILE_WIDTH, TILE_WIDTH);
            case "522":
                return bufferedImage.getSubimage(384, 1088, TILE_WIDTH, TILE_WIDTH);
            case "523":
                return bufferedImage.getSubimage(416, 1088, TILE_WIDTH, TILE_WIDTH);
            case "524":
                return bufferedImage.getSubimage(448, 1088, TILE_WIDTH, TILE_WIDTH);
            case "525":
                return bufferedImage.getSubimage(0, 1120, TILE_WIDTH, TILE_WIDTH);
            case "526":
                return bufferedImage.getSubimage(32, 1120, TILE_WIDTH, TILE_WIDTH);
            case "527":
                return bufferedImage.getSubimage(64, 1120, TILE_WIDTH, TILE_WIDTH);
            case "528":
                return bufferedImage.getSubimage(96, 1120, TILE_WIDTH, TILE_WIDTH);
            case "529":
                return bufferedImage.getSubimage(128, 1120, TILE_WIDTH, TILE_WIDTH);
            case "530":
                return bufferedImage.getSubimage(160, 1120, TILE_WIDTH, TILE_WIDTH);
            case "531":
                return bufferedImage.getSubimage(192, 1120, TILE_WIDTH, TILE_WIDTH);
            case "532":
                return bufferedImage.getSubimage(224, 1120, TILE_WIDTH, TILE_WIDTH);
            case "533":
                return bufferedImage.getSubimage(256, 1120, TILE_WIDTH, TILE_WIDTH);
            case "534":
                return bufferedImage.getSubimage(288, 1120, TILE_WIDTH, TILE_WIDTH);
            case "535":
                return bufferedImage.getSubimage(320, 1120, TILE_WIDTH, TILE_WIDTH);
            case "536":
                return bufferedImage.getSubimage(352, 1120, TILE_WIDTH, TILE_WIDTH);
            case "537":
                return bufferedImage.getSubimage(384, 1120, TILE_WIDTH, TILE_WIDTH);
            case "538":
                return bufferedImage.getSubimage(416, 1120, TILE_WIDTH, TILE_WIDTH);
            case "539":
                return bufferedImage.getSubimage(448, 1120, TILE_WIDTH, TILE_WIDTH);
            case "540":
                return bufferedImage.getSubimage(0, 1152, TILE_WIDTH, TILE_WIDTH);
            case "541":
                return bufferedImage.getSubimage(32, 1152, TILE_WIDTH, TILE_WIDTH);
            case "542":
                return bufferedImage.getSubimage(64, 1152, TILE_WIDTH, TILE_WIDTH);
            case "543":
                return bufferedImage.getSubimage(96, 1152, TILE_WIDTH, TILE_WIDTH);
            case "544":
                return bufferedImage.getSubimage(128, 1152, TILE_WIDTH, TILE_WIDTH);
            case "545":
                return bufferedImage.getSubimage(160, 1152, TILE_WIDTH, TILE_WIDTH);
            case "546":
                return bufferedImage.getSubimage(192, 1152, TILE_WIDTH, TILE_WIDTH);
            case "547":
                return bufferedImage.getSubimage(224, 1152, TILE_WIDTH, TILE_WIDTH);
            case "548":
                return bufferedImage.getSubimage(256, 1152, TILE_WIDTH, TILE_WIDTH);
            case "549":
                return bufferedImage.getSubimage(288, 1152, TILE_WIDTH, TILE_WIDTH);
            case "550":
                return bufferedImage.getSubimage(320, 1152, TILE_WIDTH, TILE_WIDTH);
            case "551":
                return bufferedImage.getSubimage(352, 1152, TILE_WIDTH, TILE_WIDTH);
            case "552":
                return bufferedImage.getSubimage(384, 1152, TILE_WIDTH, TILE_WIDTH);
            case "553":
                return bufferedImage.getSubimage(416, 1152, TILE_WIDTH, TILE_WIDTH);
            case "554":
                return bufferedImage.getSubimage(448, 1152, TILE_WIDTH, TILE_WIDTH);
            case "555":
                return bufferedImage.getSubimage(0, 1184, TILE_WIDTH, TILE_WIDTH);
            case "556":
                return bufferedImage.getSubimage(32, 1184, TILE_WIDTH, TILE_WIDTH);
            case "557":
                return bufferedImage.getSubimage(64, 1184, TILE_WIDTH, TILE_WIDTH);
            case "558":
                return bufferedImage.getSubimage(96, 1184, TILE_WIDTH, TILE_WIDTH);
            case "559":
                return bufferedImage.getSubimage(128, 1184, TILE_WIDTH, TILE_WIDTH);
            case "560":
                return bufferedImage.getSubimage(160, 1184, TILE_WIDTH, TILE_WIDTH);
            case "561":
                return bufferedImage.getSubimage(192, 1184, TILE_WIDTH, TILE_WIDTH);
            case "562":
                return bufferedImage.getSubimage(224, 1184, TILE_WIDTH, TILE_WIDTH);
            case "563":
                return bufferedImage.getSubimage(256, 1184, TILE_WIDTH, TILE_WIDTH);
            case "564":
                return bufferedImage.getSubimage(288, 1184, TILE_WIDTH, TILE_WIDTH);
            case "565":
                return bufferedImage.getSubimage(320, 1184, TILE_WIDTH, TILE_WIDTH);
            case "566":
                return bufferedImage.getSubimage(352, 1184, TILE_WIDTH, TILE_WIDTH);
            case "567":
                return bufferedImage.getSubimage(384, 1184, TILE_WIDTH, TILE_WIDTH);
            case "568":
                return bufferedImage.getSubimage(416, 1184, TILE_WIDTH, TILE_WIDTH);
            case "569":
                return bufferedImage.getSubimage(448, 1184, TILE_WIDTH, TILE_WIDTH);
            case "570":
                return bufferedImage.getSubimage(0, 1216, TILE_WIDTH, TILE_WIDTH);
            case "571":
                return bufferedImage.getSubimage(32, 1216, TILE_WIDTH, TILE_WIDTH);
            case "572":
                return bufferedImage.getSubimage(64, 1216, TILE_WIDTH, TILE_WIDTH);
            case "573":
                return bufferedImage.getSubimage(96, 1216, TILE_WIDTH, TILE_WIDTH);
            case "574":
                return bufferedImage.getSubimage(128, 1216, TILE_WIDTH, TILE_WIDTH);
            case "575":
                return bufferedImage.getSubimage(160, 1216, TILE_WIDTH, TILE_WIDTH);
            case "576":
                return bufferedImage.getSubimage(192, 1216, TILE_WIDTH, TILE_WIDTH);
            case "577":
                return bufferedImage.getSubimage(224, 1216, TILE_WIDTH, TILE_WIDTH);
            case "578":
                return bufferedImage.getSubimage(256, 1216, TILE_WIDTH, TILE_WIDTH);
            case "579":
                return bufferedImage.getSubimage(288, 1216, TILE_WIDTH, TILE_WIDTH);
            case "580":
                return bufferedImage.getSubimage(320, 1216, TILE_WIDTH, TILE_WIDTH);
            case "581":
                return bufferedImage.getSubimage(352, 1216, TILE_WIDTH, TILE_WIDTH);
            case "582":
                return bufferedImage.getSubimage(384, 1216, TILE_WIDTH, TILE_WIDTH);
            case "583":
                return bufferedImage.getSubimage(416, 1216, TILE_WIDTH, TILE_WIDTH);
            case "584":
                return bufferedImage.getSubimage(448, 1216, TILE_WIDTH, TILE_WIDTH);
            case "585":
                return bufferedImage.getSubimage(0, 1248, TILE_WIDTH, TILE_WIDTH);
            case "586":
                return bufferedImage.getSubimage(32, 1248, TILE_WIDTH, TILE_WIDTH);
            case "587":
                return bufferedImage.getSubimage(64, 1248, TILE_WIDTH, TILE_WIDTH);
            case "588":
                return bufferedImage.getSubimage(96, 1248, TILE_WIDTH, TILE_WIDTH);
            case "589":
                return bufferedImage.getSubimage(128, 1248, TILE_WIDTH, TILE_WIDTH);
            case "590":
                return bufferedImage.getSubimage(160, 1248, TILE_WIDTH, TILE_WIDTH);
            case "591":
                return bufferedImage.getSubimage(192, 1248, TILE_WIDTH, TILE_WIDTH);
            case "592":
                return bufferedImage.getSubimage(224, 1248, TILE_WIDTH, TILE_WIDTH);
            case "593":
                return bufferedImage.getSubimage(256, 1248, TILE_WIDTH, TILE_WIDTH);
            case "594":
                return bufferedImage.getSubimage(288, 1248, TILE_WIDTH, TILE_WIDTH);
            case "595":
                return bufferedImage.getSubimage(320, 1248, TILE_WIDTH, TILE_WIDTH);
            case "596":
                return bufferedImage.getSubimage(352, 1248, TILE_WIDTH, TILE_WIDTH);
            case "597":
                return bufferedImage.getSubimage(384, 1248, TILE_WIDTH, TILE_WIDTH);
            case "598":
                return bufferedImage.getSubimage(416, 1248, TILE_WIDTH, TILE_WIDTH);
            case "599":
                return bufferedImage.getSubimage(448, 1248, TILE_WIDTH, TILE_WIDTH);
            case "600":
                return bufferedImage.getSubimage(0, 1280, TILE_WIDTH, TILE_WIDTH);
            case "601":
                return bufferedImage.getSubimage(32, 1280, TILE_WIDTH, TILE_WIDTH);
            case "602":
                return bufferedImage.getSubimage(64, 1280, TILE_WIDTH, TILE_WIDTH);
            case "603":
                return bufferedImage.getSubimage(96, 1280, TILE_WIDTH, TILE_WIDTH);
            case "604":
                return bufferedImage.getSubimage(128, 1280, TILE_WIDTH, TILE_WIDTH);
            case "605":
                return bufferedImage.getSubimage(160, 1280, TILE_WIDTH, TILE_WIDTH);
            case "606":
                return bufferedImage.getSubimage(192, 1280, TILE_WIDTH, TILE_WIDTH);
            case "607":
                return bufferedImage.getSubimage(224, 1280, TILE_WIDTH, TILE_WIDTH);
            case "608":
                return bufferedImage.getSubimage(256, 1280, TILE_WIDTH, TILE_WIDTH);
            case "609":
                return bufferedImage.getSubimage(288, 1280, TILE_WIDTH, TILE_WIDTH);
            case "610":
                return bufferedImage.getSubimage(320, 1280, TILE_WIDTH, TILE_WIDTH);
            case "611":
                return bufferedImage.getSubimage(352, 1280, TILE_WIDTH, TILE_WIDTH);
            case "612":
                return bufferedImage.getSubimage(384, 1280, TILE_WIDTH, TILE_WIDTH);
            case "613":
                return bufferedImage.getSubimage(416, 1280, TILE_WIDTH, TILE_WIDTH);
            case "614":
                return bufferedImage.getSubimage(448, 1280, TILE_WIDTH, TILE_WIDTH);
            case "615":
                return bufferedImage.getSubimage(0, 1312, TILE_WIDTH, TILE_WIDTH);
            case "616":
                return bufferedImage.getSubimage(32, 1312, TILE_WIDTH, TILE_WIDTH);
            case "617":
                return bufferedImage.getSubimage(64, 1312, TILE_WIDTH, TILE_WIDTH);
            case "618":
                return bufferedImage.getSubimage(96, 1312, TILE_WIDTH, TILE_WIDTH);
            case "619":
                return bufferedImage.getSubimage(128, 1312, TILE_WIDTH, TILE_WIDTH);
            case "620":
                return bufferedImage.getSubimage(160, 1312, TILE_WIDTH, TILE_WIDTH);
            case "621":
                return bufferedImage.getSubimage(192, 1312, TILE_WIDTH, TILE_WIDTH);
            case "622":
                return bufferedImage.getSubimage(224, 1312, TILE_WIDTH, TILE_WIDTH);
            case "623":
                return bufferedImage.getSubimage(256, 1312, TILE_WIDTH, TILE_WIDTH);
            case "624":
                return bufferedImage.getSubimage(288, 1312, TILE_WIDTH, TILE_WIDTH);
            case "625":
                return bufferedImage.getSubimage(320, 1312, TILE_WIDTH, TILE_WIDTH);
            case "626":
                return bufferedImage.getSubimage(352, 1312, TILE_WIDTH, TILE_WIDTH);
            case "627":
                return bufferedImage.getSubimage(384, 1312, TILE_WIDTH, TILE_WIDTH);
            case "628":
                return bufferedImage.getSubimage(416, 1312, TILE_WIDTH, TILE_WIDTH);
            case "629":
                return bufferedImage.getSubimage(448, 1312, TILE_WIDTH, TILE_WIDTH);
            case "630":
                return bufferedImage.getSubimage(0, 1344, TILE_WIDTH, TILE_WIDTH);
            case "631":
                return bufferedImage.getSubimage(32, 1344, TILE_WIDTH, TILE_WIDTH);
            case "632":
                return bufferedImage.getSubimage(64, 1344, TILE_WIDTH, TILE_WIDTH);
            case "633":
                return bufferedImage.getSubimage(96, 1344, TILE_WIDTH, TILE_WIDTH);
            case "634":
                return bufferedImage.getSubimage(128, 1344, TILE_WIDTH, TILE_WIDTH);
            case "635":
                return bufferedImage.getSubimage(160, 1344, TILE_WIDTH, TILE_WIDTH);
            case "636":
                return bufferedImage.getSubimage(192, 1344, TILE_WIDTH, TILE_WIDTH);
            case "637":
                return bufferedImage.getSubimage(224, 1344, TILE_WIDTH, TILE_WIDTH);
            case "638":
                return bufferedImage.getSubimage(256, 1344, TILE_WIDTH, TILE_WIDTH);
            case "639":
                return bufferedImage.getSubimage(288, 1344, TILE_WIDTH, TILE_WIDTH);
            case "640":
                return bufferedImage.getSubimage(320, 1344, TILE_WIDTH, TILE_WIDTH);
            case "641":
                return bufferedImage.getSubimage(352, 1344, TILE_WIDTH, TILE_WIDTH);
            case "642":
                return bufferedImage.getSubimage(384, 1344, TILE_WIDTH, TILE_WIDTH);
            case "643":
                return bufferedImage.getSubimage(416, 1344, TILE_WIDTH, TILE_WIDTH);
            case "644":
                return bufferedImage.getSubimage(448, 1344, TILE_WIDTH, TILE_WIDTH);
            case "645":
                return bufferedImage.getSubimage(0, 1376, TILE_WIDTH, TILE_WIDTH);
            case "646":
                return bufferedImage.getSubimage(32, 1376, TILE_WIDTH, TILE_WIDTH);
            case "647":
                return bufferedImage.getSubimage(64, 1376, TILE_WIDTH, TILE_WIDTH);
            case "648":
                return bufferedImage.getSubimage(96, 1376, TILE_WIDTH, TILE_WIDTH);
            case "649":
                return bufferedImage.getSubimage(128, 1376, TILE_WIDTH, TILE_WIDTH);
            case "650":
                return bufferedImage.getSubimage(160, 1376, TILE_WIDTH, TILE_WIDTH);
            case "651":
                return bufferedImage.getSubimage(192, 1376, TILE_WIDTH, TILE_WIDTH);
            case "652":
                return bufferedImage.getSubimage(224, 1376, TILE_WIDTH, TILE_WIDTH);
            case "653":
                return bufferedImage.getSubimage(256, 1376, TILE_WIDTH, TILE_WIDTH);
            case "654":
                return bufferedImage.getSubimage(288, 1376, TILE_WIDTH, TILE_WIDTH);
            case "655":
                return bufferedImage.getSubimage(320, 1376, TILE_WIDTH, TILE_WIDTH);
            case "656":
                return bufferedImage.getSubimage(352, 1376, TILE_WIDTH, TILE_WIDTH);
            case "657":
                return bufferedImage.getSubimage(384, 1376, TILE_WIDTH, TILE_WIDTH);
            case "658":
                return bufferedImage.getSubimage(416, 1376, TILE_WIDTH, TILE_WIDTH);
            case "659":
                return bufferedImage.getSubimage(448, 1376, TILE_WIDTH, TILE_WIDTH);
            case "660":
                return bufferedImage.getSubimage(0, 1408, TILE_WIDTH, TILE_WIDTH);
            case "661":
                return bufferedImage.getSubimage(32, 1408, TILE_WIDTH, TILE_WIDTH);
            case "662":
                return bufferedImage.getSubimage(64, 1408, TILE_WIDTH, TILE_WIDTH);
            case "663":
                return bufferedImage.getSubimage(96, 1408, TILE_WIDTH, TILE_WIDTH);
            case "664":
                return bufferedImage.getSubimage(128, 1408, TILE_WIDTH, TILE_WIDTH);
            case "665":
                return bufferedImage.getSubimage(160, 1408, TILE_WIDTH, TILE_WIDTH);
            case "666":
                return bufferedImage.getSubimage(192, 1408, TILE_WIDTH, TILE_WIDTH);
            case "667":
                return bufferedImage.getSubimage(224, 1408, TILE_WIDTH, TILE_WIDTH);
            case "668":
                return bufferedImage.getSubimage(256, 1408, TILE_WIDTH, TILE_WIDTH);
            case "669":
                return bufferedImage.getSubimage(288, 1408, TILE_WIDTH, TILE_WIDTH);
            case "670":
                return bufferedImage.getSubimage(320, 1408, TILE_WIDTH, TILE_WIDTH);
            case "671":
                return bufferedImage.getSubimage(352, 1408, TILE_WIDTH, TILE_WIDTH);
            case "672":
                return bufferedImage.getSubimage(384, 1408, TILE_WIDTH, TILE_WIDTH);
            case "673":
                return bufferedImage.getSubimage(416, 1408, TILE_WIDTH, TILE_WIDTH);
            case "674":
                return bufferedImage.getSubimage(448, 1408, TILE_WIDTH, TILE_WIDTH);
            case "675":
                return bufferedImage.getSubimage(0, 1440, TILE_WIDTH, TILE_WIDTH);
            case "676":
                return bufferedImage.getSubimage(32, 1440, TILE_WIDTH, TILE_WIDTH);
            case "677":
                return bufferedImage.getSubimage(64, 1440, TILE_WIDTH, TILE_WIDTH);
            case "678":
                return bufferedImage.getSubimage(96, 1440, TILE_WIDTH, TILE_WIDTH);
            case "679":
                return bufferedImage.getSubimage(128, 1440, TILE_WIDTH, TILE_WIDTH);
            case "680":
                return bufferedImage.getSubimage(160, 1440, TILE_WIDTH, TILE_WIDTH);
            case "681":
                return bufferedImage.getSubimage(192, 1440, TILE_WIDTH, TILE_WIDTH);
            case "682":
                return bufferedImage.getSubimage(224, 1440, TILE_WIDTH, TILE_WIDTH);
            case "683":
                return bufferedImage.getSubimage(256, 1440, TILE_WIDTH, TILE_WIDTH);
            case "684":
                return bufferedImage.getSubimage(288, 1440, TILE_WIDTH, TILE_WIDTH);
            case "685":
                return bufferedImage.getSubimage(320, 1440, TILE_WIDTH, TILE_WIDTH);
            case "686":
                return bufferedImage.getSubimage(352, 1440, TILE_WIDTH, TILE_WIDTH);
            case "687":
                return bufferedImage.getSubimage(384, 1440, TILE_WIDTH, TILE_WIDTH);
            case "688":
                return bufferedImage.getSubimage(416, 1440, TILE_WIDTH, TILE_WIDTH);
            case "689":
                return bufferedImage.getSubimage(448, 1440, TILE_WIDTH, TILE_WIDTH);
            case "690":
                return bufferedImage.getSubimage(0, 1472, TILE_WIDTH, TILE_WIDTH);
            case "691":
                return bufferedImage.getSubimage(32, 1472, TILE_WIDTH, TILE_WIDTH);
            case "692":
                return bufferedImage.getSubimage(64, 1472, TILE_WIDTH, TILE_WIDTH);
            case "693":
                return bufferedImage.getSubimage(96, 1472, TILE_WIDTH, TILE_WIDTH);
            case "694":
                return bufferedImage.getSubimage(128, 1472, TILE_WIDTH, TILE_WIDTH);
            case "695":
                return bufferedImage.getSubimage(160, 1472, TILE_WIDTH, TILE_WIDTH);
            case "696":
                return bufferedImage.getSubimage(192, 1472, TILE_WIDTH, TILE_WIDTH);
            case "697":
                return bufferedImage.getSubimage(224, 1472, TILE_WIDTH, TILE_WIDTH);
            case "698":
                return bufferedImage.getSubimage(256, 1472, TILE_WIDTH, TILE_WIDTH);
            case "699":
                return bufferedImage.getSubimage(288, 1472, TILE_WIDTH, TILE_WIDTH);
            case "700":
                return bufferedImage.getSubimage(320, 1472, TILE_WIDTH, TILE_WIDTH);
            case "701":
                return bufferedImage.getSubimage(352, 1472, TILE_WIDTH, TILE_WIDTH);
            case "702":
                return bufferedImage.getSubimage(384, 1472, TILE_WIDTH, TILE_WIDTH);
            case "703":
                return bufferedImage.getSubimage(416, 1472, TILE_WIDTH, TILE_WIDTH);
            case "704":
                return bufferedImage.getSubimage(448, 1472, TILE_WIDTH, TILE_WIDTH);
            case "705":
                return bufferedImage.getSubimage(0, 1504, TILE_WIDTH, TILE_WIDTH);
            case "706":
                return bufferedImage.getSubimage(32, 1504, TILE_WIDTH, TILE_WIDTH);
            case "707":
                return bufferedImage.getSubimage(64, 1504, TILE_WIDTH, TILE_WIDTH);
            case "708":
                return bufferedImage.getSubimage(96, 1504, TILE_WIDTH, TILE_WIDTH);
            case "709":
                return bufferedImage.getSubimage(128, 1504, TILE_WIDTH, TILE_WIDTH);
            case "710":
                return bufferedImage.getSubimage(160, 1504, TILE_WIDTH, TILE_WIDTH);
            case "711":
                return bufferedImage.getSubimage(192, 1504, TILE_WIDTH, TILE_WIDTH);
            case "712":
                return bufferedImage.getSubimage(224, 1504, TILE_WIDTH, TILE_WIDTH);
            case "713":
                return bufferedImage.getSubimage(256, 1504, TILE_WIDTH, TILE_WIDTH);
            case "714":
                return bufferedImage.getSubimage(288, 1504, TILE_WIDTH, TILE_WIDTH);
            case "715":
                return bufferedImage.getSubimage(320, 1504, TILE_WIDTH, TILE_WIDTH);
            case "716":
                return bufferedImage.getSubimage(352, 1504, TILE_WIDTH, TILE_WIDTH);
            case "717":
                return bufferedImage.getSubimage(384, 1504, TILE_WIDTH, TILE_WIDTH);
            case "718":
                return bufferedImage.getSubimage(416, 1504, TILE_WIDTH, TILE_WIDTH);
            case "719":
                return bufferedImage.getSubimage(448, 1504, TILE_WIDTH, TILE_WIDTH);
            case "720":
                return bufferedImage.getSubimage(0, 1536, TILE_WIDTH, TILE_WIDTH);
            case "721":
                return bufferedImage.getSubimage(32, 1536, TILE_WIDTH, TILE_WIDTH);
            case "722":
                return bufferedImage.getSubimage(64, 1536, TILE_WIDTH, TILE_WIDTH);
            case "723":
                return bufferedImage.getSubimage(96, 1536, TILE_WIDTH, TILE_WIDTH);
            case "724":
                return bufferedImage.getSubimage(128, 1536, TILE_WIDTH, TILE_WIDTH);
            case "725":
                return bufferedImage.getSubimage(160, 1536, TILE_WIDTH, TILE_WIDTH);
            case "726":
                return bufferedImage.getSubimage(192, 1536, TILE_WIDTH, TILE_WIDTH);
            case "727":
                return bufferedImage.getSubimage(224, 1536, TILE_WIDTH, TILE_WIDTH);
            case "728":
                return bufferedImage.getSubimage(256, 1536, TILE_WIDTH, TILE_WIDTH);
            case "729":
                return bufferedImage.getSubimage(288, 1536, TILE_WIDTH, TILE_WIDTH);
            case "730":
                return bufferedImage.getSubimage(320, 1536, TILE_WIDTH, TILE_WIDTH);
            case "731":
                return bufferedImage.getSubimage(352, 1536, TILE_WIDTH, TILE_WIDTH);
            case "732":
                return bufferedImage.getSubimage(384, 1536, TILE_WIDTH, TILE_WIDTH);
            case "733":
                return bufferedImage.getSubimage(416, 1536, TILE_WIDTH, TILE_WIDTH);
            case "734":
                return bufferedImage.getSubimage(448, 1536, TILE_WIDTH, TILE_WIDTH);
            case "735":
                return bufferedImage.getSubimage(0, 1568, TILE_WIDTH, TILE_WIDTH);
            case "736":
                return bufferedImage.getSubimage(32, 1568, TILE_WIDTH, TILE_WIDTH);
            case "737":
                return bufferedImage.getSubimage(64, 1568, TILE_WIDTH, TILE_WIDTH);
            case "738":
                return bufferedImage.getSubimage(96, 1568, TILE_WIDTH, TILE_WIDTH);
            case "739":
                return bufferedImage.getSubimage(128, 1568, TILE_WIDTH, TILE_WIDTH);
            case "740":
                return bufferedImage.getSubimage(160, 1568, TILE_WIDTH, TILE_WIDTH);
            case "741":
                return bufferedImage.getSubimage(192, 1568, TILE_WIDTH, TILE_WIDTH);
            case "742":
                return bufferedImage.getSubimage(224, 1568, TILE_WIDTH, TILE_WIDTH);
            case "743":
                return bufferedImage.getSubimage(256, 1568, TILE_WIDTH, TILE_WIDTH);
            case "744":
                return bufferedImage.getSubimage(288, 1568, TILE_WIDTH, TILE_WIDTH);
            case "745":
                return bufferedImage.getSubimage(320, 1568, TILE_WIDTH, TILE_WIDTH);
            case "746":
                return bufferedImage.getSubimage(352, 1568, TILE_WIDTH, TILE_WIDTH);
            case "747":
                return bufferedImage.getSubimage(384, 1568, TILE_WIDTH, TILE_WIDTH);
            case "748":
                return bufferedImage.getSubimage(416, 1568, TILE_WIDTH, TILE_WIDTH);
            case "749":
                return bufferedImage.getSubimage(448, 1568, TILE_WIDTH, TILE_WIDTH);
            case "750":
                return bufferedImage.getSubimage(0, 1600, TILE_WIDTH, TILE_WIDTH);
            case "751":
                return bufferedImage.getSubimage(32, 1600, TILE_WIDTH, TILE_WIDTH);
            case "752":
                return bufferedImage.getSubimage(64, 1600, TILE_WIDTH, TILE_WIDTH);
            case "753":
                return bufferedImage.getSubimage(96, 1600, TILE_WIDTH, TILE_WIDTH);
            case "754":
                return bufferedImage.getSubimage(128, 1600, TILE_WIDTH, TILE_WIDTH);
            case "755":
                return bufferedImage.getSubimage(160, 1600, TILE_WIDTH, TILE_WIDTH);
            case "756":
                return bufferedImage.getSubimage(192, 1600, TILE_WIDTH, TILE_WIDTH);
            case "757":
                return bufferedImage.getSubimage(224, 1600, TILE_WIDTH, TILE_WIDTH);
            case "758":
                return bufferedImage.getSubimage(256, 1600, TILE_WIDTH, TILE_WIDTH);
            case "759":
                return bufferedImage.getSubimage(288, 1600, TILE_WIDTH, TILE_WIDTH);
            case "760":
                return bufferedImage.getSubimage(320, 1600, TILE_WIDTH, TILE_WIDTH);
            case "761":
                return bufferedImage.getSubimage(352, 1600, TILE_WIDTH, TILE_WIDTH);
            case "762":
                return bufferedImage.getSubimage(384, 1600, TILE_WIDTH, TILE_WIDTH);
            case "763":
                return bufferedImage.getSubimage(416, 1600, TILE_WIDTH, TILE_WIDTH);
            case "764":
                return bufferedImage.getSubimage(448, 1600, TILE_WIDTH, TILE_WIDTH);
            case "765":
                return bufferedImage.getSubimage(0, 1632, TILE_WIDTH, TILE_WIDTH);
            case "766":
                return bufferedImage.getSubimage(32, 1632, TILE_WIDTH, TILE_WIDTH);
            case "767":
                return bufferedImage.getSubimage(64, 1632, TILE_WIDTH, TILE_WIDTH);
            case "768":
                return bufferedImage.getSubimage(96, 1632, TILE_WIDTH, TILE_WIDTH);
            case "769":
                return bufferedImage.getSubimage(128, 1632, TILE_WIDTH, TILE_WIDTH);
            case "770":
                return bufferedImage.getSubimage(160, 1632, TILE_WIDTH, TILE_WIDTH);
            case "771":
                return bufferedImage.getSubimage(192, 1632, TILE_WIDTH, TILE_WIDTH);
            case "772":
                return bufferedImage.getSubimage(224, 1632, TILE_WIDTH, TILE_WIDTH);
            case "773":
                return bufferedImage.getSubimage(256, 1632, TILE_WIDTH, TILE_WIDTH);
            case "774":
                return bufferedImage.getSubimage(288, 1632, TILE_WIDTH, TILE_WIDTH);
            case "775":
                return bufferedImage.getSubimage(320, 1632, TILE_WIDTH, TILE_WIDTH);
            case "776":
                return bufferedImage.getSubimage(352, 1632, TILE_WIDTH, TILE_WIDTH);
            case "777":
                return bufferedImage.getSubimage(384, 1632, TILE_WIDTH, TILE_WIDTH);
            case "778":
                return bufferedImage.getSubimage(416, 1632, TILE_WIDTH, TILE_WIDTH);
            case "779":
                return bufferedImage.getSubimage(448, 1632, TILE_WIDTH, TILE_WIDTH);
            case "780":
                return bufferedImage.getSubimage(0, 1664, TILE_WIDTH, TILE_WIDTH);
            case "781":
                return bufferedImage.getSubimage(32, 1664, TILE_WIDTH, TILE_WIDTH);
            case "782":
                return bufferedImage.getSubimage(64, 1664, TILE_WIDTH, TILE_WIDTH);
            case "783":
                return bufferedImage.getSubimage(96, 1664, TILE_WIDTH, TILE_WIDTH);
            case "784":
                return bufferedImage.getSubimage(128, 1664, TILE_WIDTH, TILE_WIDTH);
            case "785":
                return bufferedImage.getSubimage(160, 1664, TILE_WIDTH, TILE_WIDTH);
            case "786":
                return bufferedImage.getSubimage(192, 1664, TILE_WIDTH, TILE_WIDTH);
            case "787":
                return bufferedImage.getSubimage(224, 1664, TILE_WIDTH, TILE_WIDTH);
            case "788":
                return bufferedImage.getSubimage(256, 1664, TILE_WIDTH, TILE_WIDTH);
            case "789":
                return bufferedImage.getSubimage(288, 1664, TILE_WIDTH, TILE_WIDTH);
            case "790":
                return bufferedImage.getSubimage(320, 1664, TILE_WIDTH, TILE_WIDTH);
            case "791":
                return bufferedImage.getSubimage(352, 1664, TILE_WIDTH, TILE_WIDTH);
            case "792":
                return bufferedImage.getSubimage(384, 1664, TILE_WIDTH, TILE_WIDTH);
            case "793":
                return bufferedImage.getSubimage(416, 1664, TILE_WIDTH, TILE_WIDTH);
            case "794":
                return bufferedImage.getSubimage(448, 1664, TILE_WIDTH, TILE_WIDTH);
            case "795":
                return bufferedImage.getSubimage(0, 1696, TILE_WIDTH, TILE_WIDTH);
            case "796":
                return bufferedImage.getSubimage(32, 1696, TILE_WIDTH, TILE_WIDTH);
            case "797":
                return bufferedImage.getSubimage(64, 1696, TILE_WIDTH, TILE_WIDTH);
            case "798":
                return bufferedImage.getSubimage(96, 1696, TILE_WIDTH, TILE_WIDTH);
            case "799":
                return bufferedImage.getSubimage(128, 1696, TILE_WIDTH, TILE_WIDTH);
            case "800":
                return bufferedImage.getSubimage(160, 1696, TILE_WIDTH, TILE_WIDTH);
            case "801":
                return bufferedImage.getSubimage(192, 1696, TILE_WIDTH, TILE_WIDTH);
            case "802":
                return bufferedImage.getSubimage(224, 1696, TILE_WIDTH, TILE_WIDTH);
            case "803":
                return bufferedImage.getSubimage(256, 1696, TILE_WIDTH, TILE_WIDTH);
            case "804":
                return bufferedImage.getSubimage(288, 1696, TILE_WIDTH, TILE_WIDTH);
            case "805":
                return bufferedImage.getSubimage(320, 1696, TILE_WIDTH, TILE_WIDTH);
            case "806":
                return bufferedImage.getSubimage(352, 1696, TILE_WIDTH, TILE_WIDTH);
            case "807":
                return bufferedImage.getSubimage(384, 1696, TILE_WIDTH, TILE_WIDTH);
            case "808":
                return bufferedImage.getSubimage(416, 1696, TILE_WIDTH, TILE_WIDTH);
            case "809":
                return bufferedImage.getSubimage(448, 1696, TILE_WIDTH, TILE_WIDTH);
            case "810":
                return bufferedImage.getSubimage(0, 1728, TILE_WIDTH, TILE_WIDTH);
            case "811":
                return bufferedImage.getSubimage(32, 1728, TILE_WIDTH, TILE_WIDTH);
            case "812":
                return bufferedImage.getSubimage(64, 1728, TILE_WIDTH, TILE_WIDTH);
            case "813":
                return bufferedImage.getSubimage(96, 1728, TILE_WIDTH, TILE_WIDTH);
            case "814":
                return bufferedImage.getSubimage(128, 1728, TILE_WIDTH, TILE_WIDTH);
            case "815":
                return bufferedImage.getSubimage(160, 1728, TILE_WIDTH, TILE_WIDTH);
            case "816":
                return bufferedImage.getSubimage(192, 1728, TILE_WIDTH, TILE_WIDTH);
            case "817":
                return bufferedImage.getSubimage(224, 1728, TILE_WIDTH, TILE_WIDTH);
            case "818":
                return bufferedImage.getSubimage(256, 1728, TILE_WIDTH, TILE_WIDTH);
            case "819":
                return bufferedImage.getSubimage(288, 1728, TILE_WIDTH, TILE_WIDTH);
            case "820":
                return bufferedImage.getSubimage(320, 1728, TILE_WIDTH, TILE_WIDTH);
            case "821":
                return bufferedImage.getSubimage(352, 1728, TILE_WIDTH, TILE_WIDTH);
            case "822":
                return bufferedImage.getSubimage(384, 1728, TILE_WIDTH, TILE_WIDTH);
            case "823":
                return bufferedImage.getSubimage(416, 1728, TILE_WIDTH, TILE_WIDTH);
            case "824":
                return bufferedImage.getSubimage(448, 1728, TILE_WIDTH, TILE_WIDTH);
            case "825":
                return bufferedImage.getSubimage(0, 1760, TILE_WIDTH, TILE_WIDTH);
            case "826":
                return bufferedImage.getSubimage(32, 1760, TILE_WIDTH, TILE_WIDTH);
            case "827":
                return bufferedImage.getSubimage(64, 1760, TILE_WIDTH, TILE_WIDTH);
            case "828":
                return bufferedImage.getSubimage(96, 1760, TILE_WIDTH, TILE_WIDTH);
            case "829":
                return bufferedImage.getSubimage(128, 1760, TILE_WIDTH, TILE_WIDTH);
            case "830":
                return bufferedImage.getSubimage(160, 1760, TILE_WIDTH, TILE_WIDTH);
            case "831":
                return bufferedImage.getSubimage(192, 1760, TILE_WIDTH, TILE_WIDTH);
            case "832":
                return bufferedImage.getSubimage(224, 1760, TILE_WIDTH, TILE_WIDTH);
            case "833":
                return bufferedImage.getSubimage(256, 1760, TILE_WIDTH, TILE_WIDTH);
            case "834":
                return bufferedImage.getSubimage(288, 1760, TILE_WIDTH, TILE_WIDTH);
            case "835":
                return bufferedImage.getSubimage(320, 1760, TILE_WIDTH, TILE_WIDTH);
            case "836":
                return bufferedImage.getSubimage(352, 1760, TILE_WIDTH, TILE_WIDTH);
            case "837":
                return bufferedImage.getSubimage(384, 1760, TILE_WIDTH, TILE_WIDTH);
            case "838":
                return bufferedImage.getSubimage(416, 1760, TILE_WIDTH, TILE_WIDTH);
            case "839":
                return bufferedImage.getSubimage(448, 1760, TILE_WIDTH, TILE_WIDTH);
            case "840":
                return bufferedImage.getSubimage(0, 1792, TILE_WIDTH, TILE_WIDTH);
            case "841":
                return bufferedImage.getSubimage(32, 1792, TILE_WIDTH, TILE_WIDTH);
            case "842":
                return bufferedImage.getSubimage(64, 1792, TILE_WIDTH, TILE_WIDTH);
            case "843":
                return bufferedImage.getSubimage(96, 1792, TILE_WIDTH, TILE_WIDTH);
            case "844":
                return bufferedImage.getSubimage(128, 1792, TILE_WIDTH, TILE_WIDTH);
            case "845":
                return bufferedImage.getSubimage(160, 1792, TILE_WIDTH, TILE_WIDTH);
            case "846":
                return bufferedImage.getSubimage(192, 1792, TILE_WIDTH, TILE_WIDTH);
            case "847":
                return bufferedImage.getSubimage(224, 1792, TILE_WIDTH, TILE_WIDTH);
            case "848":
                return bufferedImage.getSubimage(256, 1792, TILE_WIDTH, TILE_WIDTH);
            case "849":
                return bufferedImage.getSubimage(288, 1792, TILE_WIDTH, TILE_WIDTH);
            case "850":
                return bufferedImage.getSubimage(320, 1792, TILE_WIDTH, TILE_WIDTH);
            case "851":
                return bufferedImage.getSubimage(352, 1792, TILE_WIDTH, TILE_WIDTH);
            case "852":
                return bufferedImage.getSubimage(384, 1792, TILE_WIDTH, TILE_WIDTH);
            case "853":
                return bufferedImage.getSubimage(416, 1792, TILE_WIDTH, TILE_WIDTH);
            case "854":
                return bufferedImage.getSubimage(448, 1792, TILE_WIDTH, TILE_WIDTH);
            case "855":
                return bufferedImage.getSubimage(0, 1824, TILE_WIDTH, TILE_WIDTH);
            case "856":
                return bufferedImage.getSubimage(32, 1824, TILE_WIDTH, TILE_WIDTH);
            case "857":
                return bufferedImage.getSubimage(64, 1824, TILE_WIDTH, TILE_WIDTH);
            case "858":
                return bufferedImage.getSubimage(96, 1824, TILE_WIDTH, TILE_WIDTH);
            case "859":
                return bufferedImage.getSubimage(128, 1824, TILE_WIDTH, TILE_WIDTH);
            case "860":
                return bufferedImage.getSubimage(160, 1824, TILE_WIDTH, TILE_WIDTH);
            case "861":
                return bufferedImage.getSubimage(192, 1824, TILE_WIDTH, TILE_WIDTH);
            case "862":
                return bufferedImage.getSubimage(224, 1824, TILE_WIDTH, TILE_WIDTH);
            case "863":
                return bufferedImage.getSubimage(256, 1824, TILE_WIDTH, TILE_WIDTH);
            case "864":
                return bufferedImage.getSubimage(288, 1824, TILE_WIDTH, TILE_WIDTH);
            case "865":
                return bufferedImage.getSubimage(320, 1824, TILE_WIDTH, TILE_WIDTH);
            case "866":
                return bufferedImage.getSubimage(352, 1824, TILE_WIDTH, TILE_WIDTH);
            case "867":
                return bufferedImage.getSubimage(384, 1824, TILE_WIDTH, TILE_WIDTH);
            case "868":
                return bufferedImage.getSubimage(416, 1824, TILE_WIDTH, TILE_WIDTH);
            case "869":
                return bufferedImage.getSubimage(448, 1824, TILE_WIDTH, TILE_WIDTH);
            case "870":
                return bufferedImage.getSubimage(0, 1856, TILE_WIDTH, TILE_WIDTH);
            case "871":
                return bufferedImage.getSubimage(32, 1856, TILE_WIDTH, TILE_WIDTH);
            case "872":
                return bufferedImage.getSubimage(64, 1856, TILE_WIDTH, TILE_WIDTH);
            case "873":
                return bufferedImage.getSubimage(96, 1856, TILE_WIDTH, TILE_WIDTH);
            case "874":
                return bufferedImage.getSubimage(128, 1856, TILE_WIDTH, TILE_WIDTH);
            case "875":
                return bufferedImage.getSubimage(160, 1856, TILE_WIDTH, TILE_WIDTH);
            case "876":
                return bufferedImage.getSubimage(192, 1856, TILE_WIDTH, TILE_WIDTH);
            case "877":
                return bufferedImage.getSubimage(224, 1856, TILE_WIDTH, TILE_WIDTH);
            case "878":
                return bufferedImage.getSubimage(256, 1856, TILE_WIDTH, TILE_WIDTH);
            case "879":
                return bufferedImage.getSubimage(288, 1856, TILE_WIDTH, TILE_WIDTH);
            case "880":
                return bufferedImage.getSubimage(320, 1856, TILE_WIDTH, TILE_WIDTH);
            case "881":
                return bufferedImage.getSubimage(352, 1856, TILE_WIDTH, TILE_WIDTH);
            case "882":
                return bufferedImage.getSubimage(384, 1856, TILE_WIDTH, TILE_WIDTH);
            case "883":
                return bufferedImage.getSubimage(416, 1856, TILE_WIDTH, TILE_WIDTH);
            case "884":
                return bufferedImage.getSubimage(448, 1856, TILE_WIDTH, TILE_WIDTH);
            case "885":
                return bufferedImage.getSubimage(0, 1888, TILE_WIDTH, TILE_WIDTH);
            case "886":
                return bufferedImage.getSubimage(32, 1888, TILE_WIDTH, TILE_WIDTH);
            case "887":
                return bufferedImage.getSubimage(64, 1888, TILE_WIDTH, TILE_WIDTH);
            case "888":
                return bufferedImage.getSubimage(96, 1888, TILE_WIDTH, TILE_WIDTH);
            case "889":
                return bufferedImage.getSubimage(128, 1888, TILE_WIDTH, TILE_WIDTH);
            case "890":
                return bufferedImage.getSubimage(160, 1888, TILE_WIDTH, TILE_WIDTH);
            case "891":
                return bufferedImage.getSubimage(192, 1888, TILE_WIDTH, TILE_WIDTH);
            case "892":
                return bufferedImage.getSubimage(224, 1888, TILE_WIDTH, TILE_WIDTH);
            case "893":
                return bufferedImage.getSubimage(256, 1888, TILE_WIDTH, TILE_WIDTH);
            case "894":
                return bufferedImage.getSubimage(288, 1888, TILE_WIDTH, TILE_WIDTH);
            case "895":
                return bufferedImage.getSubimage(320, 1888, TILE_WIDTH, TILE_WIDTH);
            case "896":
                return bufferedImage.getSubimage(352, 1888, TILE_WIDTH, TILE_WIDTH);
            case "897":
                return bufferedImage.getSubimage(384, 1888, TILE_WIDTH, TILE_WIDTH);
            case "898":
                return bufferedImage.getSubimage(416, 1888, TILE_WIDTH, TILE_WIDTH);
            case "899":
                return bufferedImage.getSubimage(448, 1888, TILE_WIDTH, TILE_WIDTH);
            case "900":
                return bufferedImage.getSubimage(0, 1920, TILE_WIDTH, TILE_WIDTH);
            case "901":
                return bufferedImage.getSubimage(32, 1920, TILE_WIDTH, TILE_WIDTH);
            case "902":
                return bufferedImage.getSubimage(64, 1920, TILE_WIDTH, TILE_WIDTH);
            case "903":
                return bufferedImage.getSubimage(96, 1920, TILE_WIDTH, TILE_WIDTH);
            case "904":
                return bufferedImage.getSubimage(128, 1920, TILE_WIDTH, TILE_WIDTH);
            case "905":
                return bufferedImage.getSubimage(160, 1920, TILE_WIDTH, TILE_WIDTH);
            case "906":
                return bufferedImage.getSubimage(192, 1920, TILE_WIDTH, TILE_WIDTH);
            case "907":
                return bufferedImage.getSubimage(224, 1920, TILE_WIDTH, TILE_WIDTH);
            case "908":
                return bufferedImage.getSubimage(256, 1920, TILE_WIDTH, TILE_WIDTH);
            case "909":
                return bufferedImage.getSubimage(288, 1920, TILE_WIDTH, TILE_WIDTH);
            case "910":
                return bufferedImage.getSubimage(320, 1920, TILE_WIDTH, TILE_WIDTH);
            case "911":
                return bufferedImage.getSubimage(352, 1920, TILE_WIDTH, TILE_WIDTH);
            case "912":
                return bufferedImage.getSubimage(384, 1920, TILE_WIDTH, TILE_WIDTH);
            case "913":
                return bufferedImage.getSubimage(416, 1920, TILE_WIDTH, TILE_WIDTH);
            case "914":
                return bufferedImage.getSubimage(448, 1920, TILE_WIDTH, TILE_WIDTH);
            case "915":
                return bufferedImage.getSubimage(0, 1952, TILE_WIDTH, TILE_WIDTH);
            case "916":
                return bufferedImage.getSubimage(32, 1952, TILE_WIDTH, TILE_WIDTH);
            case "917":
                return bufferedImage.getSubimage(64, 1952, TILE_WIDTH, TILE_WIDTH);
            case "918":
                return bufferedImage.getSubimage(96, 1952, TILE_WIDTH, TILE_WIDTH);
            case "919":
                return bufferedImage.getSubimage(128, 1952, TILE_WIDTH, TILE_WIDTH);
            case "920":
                return bufferedImage.getSubimage(160, 1952, TILE_WIDTH, TILE_WIDTH);
            case "921":
                return bufferedImage.getSubimage(192, 1952, TILE_WIDTH, TILE_WIDTH);
            case "922":
                return bufferedImage.getSubimage(224, 1952, TILE_WIDTH, TILE_WIDTH);
            case "923":
                return bufferedImage.getSubimage(256, 1952, TILE_WIDTH, TILE_WIDTH);
            case "924":
                return bufferedImage.getSubimage(288, 1952, TILE_WIDTH, TILE_WIDTH);
            case "925":
                return bufferedImage.getSubimage(320, 1952, TILE_WIDTH, TILE_WIDTH);
            case "926":
                return bufferedImage.getSubimage(352, 1952, TILE_WIDTH, TILE_WIDTH);
            case "927":
                return bufferedImage.getSubimage(384, 1952, TILE_WIDTH, TILE_WIDTH);
            case "928":
                return bufferedImage.getSubimage(416, 1952, TILE_WIDTH, TILE_WIDTH);
            case "929":
                return bufferedImage.getSubimage(448, 1952, TILE_WIDTH, TILE_WIDTH);
            case "930":
                return bufferedImage.getSubimage(0, 1984, TILE_WIDTH, TILE_WIDTH);
            case "931":
                return bufferedImage.getSubimage(32, 1984, TILE_WIDTH, TILE_WIDTH);
            case "932":
                return bufferedImage.getSubimage(64, 1984, TILE_WIDTH, TILE_WIDTH);
            case "933":
                return bufferedImage.getSubimage(96, 1984, TILE_WIDTH, TILE_WIDTH);
            case "934":
                return bufferedImage.getSubimage(128, 1984, TILE_WIDTH, TILE_WIDTH);
            case "935":
                return bufferedImage.getSubimage(160, 1984, TILE_WIDTH, TILE_WIDTH);
            case "936":
                return bufferedImage.getSubimage(192, 1984, TILE_WIDTH, TILE_WIDTH);
            case "937":
                return bufferedImage.getSubimage(224, 1984, TILE_WIDTH, TILE_WIDTH);
            case "938":
                return bufferedImage.getSubimage(256, 1984, TILE_WIDTH, TILE_WIDTH);
            case "939":
                return bufferedImage.getSubimage(288, 1984, TILE_WIDTH, TILE_WIDTH);
            case "940":
                return bufferedImage.getSubimage(320, 1984, TILE_WIDTH, TILE_WIDTH);
            case "941":
                return bufferedImage.getSubimage(352, 1984, TILE_WIDTH, TILE_WIDTH);
            case "942":
                return bufferedImage.getSubimage(384, 1984, TILE_WIDTH, TILE_WIDTH);
            case "943":
                return bufferedImage.getSubimage(416, 1984, TILE_WIDTH, TILE_WIDTH);
            case "944":
                return bufferedImage.getSubimage(448, 1984, TILE_WIDTH, TILE_WIDTH);
            case "945":
                return bufferedImage.getSubimage(0, 2016, TILE_WIDTH, TILE_WIDTH);
            case "946":
                return bufferedImage.getSubimage(32, 2016, TILE_WIDTH, TILE_WIDTH);
            case "947":
                return bufferedImage.getSubimage(64, 2016, TILE_WIDTH, TILE_WIDTH);
            case "948":
                return bufferedImage.getSubimage(96, 2016, TILE_WIDTH, TILE_WIDTH);
            case "949":
                return bufferedImage.getSubimage(128, 2016, TILE_WIDTH, TILE_WIDTH);
            case "950":
                return bufferedImage.getSubimage(160, 2016, TILE_WIDTH, TILE_WIDTH);
            case "951":
                return bufferedImage.getSubimage(192, 2016, TILE_WIDTH, TILE_WIDTH);
            case "952":
                return bufferedImage.getSubimage(224, 2016, TILE_WIDTH, TILE_WIDTH);
            case "953":
                return bufferedImage.getSubimage(256, 2016, TILE_WIDTH, TILE_WIDTH);
            case "954":
                return bufferedImage.getSubimage(288, 2016, TILE_WIDTH, TILE_WIDTH);
            case "955":
                return bufferedImage.getSubimage(320, 2016, TILE_WIDTH, TILE_WIDTH);
            case "956":
                return bufferedImage.getSubimage(352, 2016, TILE_WIDTH, TILE_WIDTH);
            case "957":
                return bufferedImage.getSubimage(384, 2016, TILE_WIDTH, TILE_WIDTH);
            case "958":
                return bufferedImage.getSubimage(416, 2016, TILE_WIDTH, TILE_WIDTH);
            case "959":
                return bufferedImage.getSubimage(448, 2016, TILE_WIDTH, TILE_WIDTH);
            case "960":
                return bufferedImage.getSubimage(0, 2048, TILE_WIDTH, TILE_WIDTH);
            case "961":
                return bufferedImage.getSubimage(32, 2048, TILE_WIDTH, TILE_WIDTH);
            case "962":
                return bufferedImage.getSubimage(64, 2048, TILE_WIDTH, TILE_WIDTH);
            case "963":
                return bufferedImage.getSubimage(96, 2048, TILE_WIDTH, TILE_WIDTH);
            case "964":
                return bufferedImage.getSubimage(128, 2048, TILE_WIDTH, TILE_WIDTH);
            case "965":
                return bufferedImage.getSubimage(160, 2048, TILE_WIDTH, TILE_WIDTH);
            case "966":
                return bufferedImage.getSubimage(192, 2048, TILE_WIDTH, TILE_WIDTH);
            case "967":
                return bufferedImage.getSubimage(224, 2048, TILE_WIDTH, TILE_WIDTH);
            case "968":
                return bufferedImage.getSubimage(256, 2048, TILE_WIDTH, TILE_WIDTH);
            case "969":
                return bufferedImage.getSubimage(288, 2048, TILE_WIDTH, TILE_WIDTH);
            case "970":
                return bufferedImage.getSubimage(320, 2048, TILE_WIDTH, TILE_WIDTH);
            case "971":
                return bufferedImage.getSubimage(352, 2048, TILE_WIDTH, TILE_WIDTH);
            case "972":
                return bufferedImage.getSubimage(384, 2048, TILE_WIDTH, TILE_WIDTH);
            case "973":
                return bufferedImage.getSubimage(416, 2048, TILE_WIDTH, TILE_WIDTH);
            case "974":
                return bufferedImage.getSubimage(448, 2048, TILE_WIDTH, TILE_WIDTH);
            case "975":
                return bufferedImage.getSubimage(0, 2080, TILE_WIDTH, TILE_WIDTH);
            case "976":
                return bufferedImage.getSubimage(32, 2080, TILE_WIDTH, TILE_WIDTH);
            case "977":
                return bufferedImage.getSubimage(64, 2080, TILE_WIDTH, TILE_WIDTH);
            case "978":
                return bufferedImage.getSubimage(96, 2080, TILE_WIDTH, TILE_WIDTH);
            case "979":
                return bufferedImage.getSubimage(128, 2080, TILE_WIDTH, TILE_WIDTH);
            case "980":
                return bufferedImage.getSubimage(160, 2080, TILE_WIDTH, TILE_WIDTH);
            case "981":
                return bufferedImage.getSubimage(192, 2080, TILE_WIDTH, TILE_WIDTH);
            case "982":
                return bufferedImage.getSubimage(224, 2080, TILE_WIDTH, TILE_WIDTH);
            case "983":
                return bufferedImage.getSubimage(256, 2080, TILE_WIDTH, TILE_WIDTH);
            case "984":
                return bufferedImage.getSubimage(288, 2080, TILE_WIDTH, TILE_WIDTH);
            case "985":
                return bufferedImage.getSubimage(320, 2080, TILE_WIDTH, TILE_WIDTH);
            case "986":
                return bufferedImage.getSubimage(352, 2080, TILE_WIDTH, TILE_WIDTH);
            case "987":
                return bufferedImage.getSubimage(384, 2080, TILE_WIDTH, TILE_WIDTH);
            case "988":
                return bufferedImage.getSubimage(416, 2080, TILE_WIDTH, TILE_WIDTH);
            case "989":
                return bufferedImage.getSubimage(448, 2080, TILE_WIDTH, TILE_WIDTH);
            case "990":
                return bufferedImage.getSubimage(0, 2112, TILE_WIDTH, TILE_WIDTH);
            case "991":
                return bufferedImage.getSubimage(32, 2112, TILE_WIDTH, TILE_WIDTH);
            case "992":
                return bufferedImage.getSubimage(64, 2112, TILE_WIDTH, TILE_WIDTH);
            case "993":
                return bufferedImage.getSubimage(96, 2112, TILE_WIDTH, TILE_WIDTH);
            case "994":
                return bufferedImage.getSubimage(128, 2112, TILE_WIDTH, TILE_WIDTH);
            case "995":
                return bufferedImage.getSubimage(160, 2112, TILE_WIDTH, TILE_WIDTH);
            case "996":
                return bufferedImage.getSubimage(192, 2112, TILE_WIDTH, TILE_WIDTH);
            case "997":
                return bufferedImage.getSubimage(224, 2112, TILE_WIDTH, TILE_WIDTH);
            case "998":
                return bufferedImage.getSubimage(256, 2112, TILE_WIDTH, TILE_WIDTH);
            case "999":
                return bufferedImage.getSubimage(288, 2112, TILE_WIDTH, TILE_WIDTH);
            case "1000":
                return bufferedImage.getSubimage(320, 2112, TILE_WIDTH, TILE_WIDTH);
            case "1001":
                return bufferedImage.getSubimage(352, 2112, TILE_WIDTH, TILE_WIDTH);
            case "1002":
                return bufferedImage.getSubimage(384, 2112, TILE_WIDTH, TILE_WIDTH);
            case "1003":
                return bufferedImage.getSubimage(416, 2112, TILE_WIDTH, TILE_WIDTH);
            case "1004":
                return bufferedImage.getSubimage(448, 2112, TILE_WIDTH, TILE_WIDTH);
            case "1005":
                return bufferedImage.getSubimage(0, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1006":
                return bufferedImage.getSubimage(32, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1007":
                return bufferedImage.getSubimage(64, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1008":
                return bufferedImage.getSubimage(96, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1009":
                return bufferedImage.getSubimage(128, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1010":
                return bufferedImage.getSubimage(160, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1011":
                return bufferedImage.getSubimage(192, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1012":
                return bufferedImage.getSubimage(224, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1013":
                return bufferedImage.getSubimage(256, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1014":
                return bufferedImage.getSubimage(288, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1015":
                return bufferedImage.getSubimage(320, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1016":
                return bufferedImage.getSubimage(352, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1017":
                return bufferedImage.getSubimage(384, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1018":
                return bufferedImage.getSubimage(416, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1019":
                return bufferedImage.getSubimage(448, 2144, TILE_WIDTH, TILE_WIDTH);
            case "1020":
                return bufferedImage.getSubimage(0, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1021":
                return bufferedImage.getSubimage(32, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1022":
                return bufferedImage.getSubimage(64, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1023":
                return bufferedImage.getSubimage(96, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1024":
                return bufferedImage.getSubimage(128, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1025":
                return bufferedImage.getSubimage(160, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1026":
                return bufferedImage.getSubimage(192, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1027":
                return bufferedImage.getSubimage(224, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1028":
                return bufferedImage.getSubimage(256, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1029":
                return bufferedImage.getSubimage(288, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1030":
                return bufferedImage.getSubimage(320, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1031":
                return bufferedImage.getSubimage(352, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1032":
                return bufferedImage.getSubimage(384, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1033":
                return bufferedImage.getSubimage(416, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1034":
                return bufferedImage.getSubimage(448, 2176, TILE_WIDTH, TILE_WIDTH);
            case "1035":
                return bufferedImage.getSubimage(0, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1036":
                return bufferedImage.getSubimage(32, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1037":
                return bufferedImage.getSubimage(64, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1038":
                return bufferedImage.getSubimage(96, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1039":
                return bufferedImage.getSubimage(128, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1040":
                return bufferedImage.getSubimage(160, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1041":
                return bufferedImage.getSubimage(192, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1042":
                return bufferedImage.getSubimage(224, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1043":
                return bufferedImage.getSubimage(256, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1044":
                return bufferedImage.getSubimage(288, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1045":
                return bufferedImage.getSubimage(320, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1046":
                return bufferedImage.getSubimage(352, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1047":
                return bufferedImage.getSubimage(384, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1048":
                return bufferedImage.getSubimage(416, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1049":
                return bufferedImage.getSubimage(448, 2208, TILE_WIDTH, TILE_WIDTH);
            case "1050":
                return bufferedImage.getSubimage(0, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1051":
                return bufferedImage.getSubimage(32, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1052":
                return bufferedImage.getSubimage(64, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1053":
                return bufferedImage.getSubimage(96, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1054":
                return bufferedImage.getSubimage(128, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1055":
                return bufferedImage.getSubimage(160, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1056":
                return bufferedImage.getSubimage(192, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1057":
                return bufferedImage.getSubimage(224, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1058":
                return bufferedImage.getSubimage(256, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1059":
                return bufferedImage.getSubimage(288, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1060":
                return bufferedImage.getSubimage(320, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1061":
                return bufferedImage.getSubimage(352, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1062":
                return bufferedImage.getSubimage(384, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1063":
                return bufferedImage.getSubimage(416, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1064":
                return bufferedImage.getSubimage(448, 2240, TILE_WIDTH, TILE_WIDTH);
            case "1065":
                return bufferedImage.getSubimage(0, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1066":
                return bufferedImage.getSubimage(32, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1067":
                return bufferedImage.getSubimage(64, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1068":
                return bufferedImage.getSubimage(96, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1069":
                return bufferedImage.getSubimage(128, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1070":
                return bufferedImage.getSubimage(160, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1071":
                return bufferedImage.getSubimage(192, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1072":
                return bufferedImage.getSubimage(224, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1073":
                return bufferedImage.getSubimage(256, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1074":
                return bufferedImage.getSubimage(288, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1075":
                return bufferedImage.getSubimage(320, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1076":
                return bufferedImage.getSubimage(352, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1077":
                return bufferedImage.getSubimage(384, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1078":
                return bufferedImage.getSubimage(416, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1079":
                return bufferedImage.getSubimage(448, 2272, TILE_WIDTH, TILE_WIDTH);
            case "1080":
                return bufferedImage.getSubimage(0, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1081":
                return bufferedImage.getSubimage(32, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1082":
                return bufferedImage.getSubimage(64, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1083":
                return bufferedImage.getSubimage(96, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1084":
                return bufferedImage.getSubimage(128, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1085":
                return bufferedImage.getSubimage(160, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1086":
                return bufferedImage.getSubimage(192, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1087":
                return bufferedImage.getSubimage(224, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1088":
                return bufferedImage.getSubimage(256, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1089":
                return bufferedImage.getSubimage(288, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1090":
                return bufferedImage.getSubimage(320, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1091":
                return bufferedImage.getSubimage(352, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1092":
                return bufferedImage.getSubimage(384, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1093":
                return bufferedImage.getSubimage(416, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1094":
                return bufferedImage.getSubimage(448, 2304, TILE_WIDTH, TILE_WIDTH);
            case "1095":
                return bufferedImage.getSubimage(0, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1096":
                return bufferedImage.getSubimage(32, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1097":
                return bufferedImage.getSubimage(64, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1098":
                return bufferedImage.getSubimage(96, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1099":
                return bufferedImage.getSubimage(128, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1100":
                return bufferedImage.getSubimage(160, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1101":
                return bufferedImage.getSubimage(192, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1102":
                return bufferedImage.getSubimage(224, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1103":
                return bufferedImage.getSubimage(256, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1104":
                return bufferedImage.getSubimage(288, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1105":
                return bufferedImage.getSubimage(320, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1106":
                return bufferedImage.getSubimage(352, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1107":
                return bufferedImage.getSubimage(384, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1108":
                return bufferedImage.getSubimage(416, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1109":
                return bufferedImage.getSubimage(448, 2336, TILE_WIDTH, TILE_WIDTH);
            case "1110":
                return bufferedImage.getSubimage(0, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1111":
                return bufferedImage.getSubimage(32, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1112":
                return bufferedImage.getSubimage(64, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1113":
                return bufferedImage.getSubimage(96, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1114":
                return bufferedImage.getSubimage(128, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1115":
                return bufferedImage.getSubimage(160, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1116":
                return bufferedImage.getSubimage(192, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1117":
                return bufferedImage.getSubimage(224, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1118":
                return bufferedImage.getSubimage(256, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1119":
                return bufferedImage.getSubimage(288, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1120":
                return bufferedImage.getSubimage(320, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1121":
                return bufferedImage.getSubimage(352, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1122":
                return bufferedImage.getSubimage(384, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1123":
                return bufferedImage.getSubimage(416, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1124":
                return bufferedImage.getSubimage(448, 2368, TILE_WIDTH, TILE_WIDTH);
            case "1125":
                return bufferedImage.getSubimage(0, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1126":
                return bufferedImage.getSubimage(32, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1127":
                return bufferedImage.getSubimage(64, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1128":
                return bufferedImage.getSubimage(96, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1129":
                return bufferedImage.getSubimage(128, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1130":
                return bufferedImage.getSubimage(160, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1131":
                return bufferedImage.getSubimage(192, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1132":
                return bufferedImage.getSubimage(224, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1133":
                return bufferedImage.getSubimage(256, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1134":
                return bufferedImage.getSubimage(288, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1135":
                return bufferedImage.getSubimage(320, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1136":
                return bufferedImage.getSubimage(352, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1137":
                return bufferedImage.getSubimage(384, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1138":
                return bufferedImage.getSubimage(416, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1139":
                return bufferedImage.getSubimage(448, 2400, TILE_WIDTH, TILE_WIDTH);
            case "1140":
                return bufferedImage.getSubimage(0, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1141":
                return bufferedImage.getSubimage(32, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1142":
                return bufferedImage.getSubimage(64, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1143":
                return bufferedImage.getSubimage(96, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1144":
                return bufferedImage.getSubimage(128, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1145":
                return bufferedImage.getSubimage(160, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1146":
                return bufferedImage.getSubimage(192, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1147":
                return bufferedImage.getSubimage(224, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1148":
                return bufferedImage.getSubimage(256, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1149":
                return bufferedImage.getSubimage(288, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1150":
                return bufferedImage.getSubimage(320, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1151":
                return bufferedImage.getSubimage(352, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1152":
                return bufferedImage.getSubimage(384, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1153":
                return bufferedImage.getSubimage(416, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1154":
                return bufferedImage.getSubimage(448, 2432, TILE_WIDTH, TILE_WIDTH);
            case "1155":
                return bufferedImage.getSubimage(0, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1156":
                return bufferedImage.getSubimage(32, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1157":
                return bufferedImage.getSubimage(64, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1158":
                return bufferedImage.getSubimage(96, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1159":
                return bufferedImage.getSubimage(128, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1160":
                return bufferedImage.getSubimage(160, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1161":
                return bufferedImage.getSubimage(192, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1162":
                return bufferedImage.getSubimage(224, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1163":
                return bufferedImage.getSubimage(256, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1164":
                return bufferedImage.getSubimage(288, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1165":
                return bufferedImage.getSubimage(320, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1166":
                return bufferedImage.getSubimage(352, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1167":
                return bufferedImage.getSubimage(384, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1168":
                return bufferedImage.getSubimage(416, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1169":
                return bufferedImage.getSubimage(448, 2464, TILE_WIDTH, TILE_WIDTH);
            case "1170":
                return bufferedImage.getSubimage(0, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1171":
                return bufferedImage.getSubimage(32, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1172":
                return bufferedImage.getSubimage(64, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1173":
                return bufferedImage.getSubimage(96, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1174":
                return bufferedImage.getSubimage(128, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1175":
                return bufferedImage.getSubimage(160, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1176":
                return bufferedImage.getSubimage(192, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1177":
                return bufferedImage.getSubimage(224, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1178":
                return bufferedImage.getSubimage(256, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1179":
                return bufferedImage.getSubimage(288, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1180":
                return bufferedImage.getSubimage(320, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1181":
                return bufferedImage.getSubimage(352, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1182":
                return bufferedImage.getSubimage(384, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1183":
                return bufferedImage.getSubimage(416, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1184":
                return bufferedImage.getSubimage(448, 2496, TILE_WIDTH, TILE_WIDTH);
            case "1185":
                return bufferedImage.getSubimage(0, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1186":
                return bufferedImage.getSubimage(32, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1187":
                return bufferedImage.getSubimage(64, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1188":
                return bufferedImage.getSubimage(96, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1189":
                return bufferedImage.getSubimage(128, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1190":
                return bufferedImage.getSubimage(160, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1191":
                return bufferedImage.getSubimage(192, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1192":
                return bufferedImage.getSubimage(224, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1193":
                return bufferedImage.getSubimage(256, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1194":
                return bufferedImage.getSubimage(288, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1195":
                return bufferedImage.getSubimage(320, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1196":
                return bufferedImage.getSubimage(352, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1197":
                return bufferedImage.getSubimage(384, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1198":
                return bufferedImage.getSubimage(416, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1199":
                return bufferedImage.getSubimage(448, 2528, TILE_WIDTH, TILE_WIDTH);
            case "1200":
                return bufferedImage.getSubimage(0, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1201":
                return bufferedImage.getSubimage(32, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1202":
                return bufferedImage.getSubimage(64, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1203":
                return bufferedImage.getSubimage(96, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1204":
                return bufferedImage.getSubimage(128, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1205":
                return bufferedImage.getSubimage(160, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1206":
                return bufferedImage.getSubimage(192, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1207":
                return bufferedImage.getSubimage(224, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1208":
                return bufferedImage.getSubimage(256, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1209":
                return bufferedImage.getSubimage(288, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1210":
                return bufferedImage.getSubimage(320, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1211":
                return bufferedImage.getSubimage(352, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1212":
                return bufferedImage.getSubimage(384, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1213":
                return bufferedImage.getSubimage(416, 2560, TILE_WIDTH, TILE_WIDTH);
            case "1214":
                return bufferedImage.getSubimage(448, 2560, TILE_WIDTH, TILE_WIDTH);
        }
            return null;

    }

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
