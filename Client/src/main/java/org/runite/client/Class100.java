package org.runite.client;

import org.rs09.client.config.GameConfig;

import java.util.Random;

final class Class100 {

    static int worldListArraySize;
    int anInt1406;
    int anInt1408;
    boolean aBoolean1411 = true;
    int anInt1412 = -1;
    int anInt1414 = 128;
    int anInt1417;
    int anInt1418;

    static int method1602(RSString var1) {
        try {
            if (Class119.aClass131_1624 == null || var1.length() == 0) {
                return -1;
            } else {
                for (int var2 = 0; var2 < Class119.aClass131_1624.anInt1720; ++var2) {
                    if (Class119.aClass131_1624.aClass94Array1721[var2].method1560(TextCore.aClass94_3192, TextCore.aClass94_4066).method1562((byte) -32, var1)) {
                        return var2;
                    }
                }

                return -1;
            }
        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "ni.G(" + 0 + ',' + (var1 != null ? "{...}" : "null") + ')');
        }
    }

    static int method1603(byte var0, int var1, Random var2) {
        try {
            if (var1 <= 0) {
                throw new IllegalArgumentException();
            } else if (Class140_Sub6.method2021((byte) -115, var1)) {
                return (int) (((long) var2.nextInt() & 4294967295L) * (long) var1 >> 32);
            } else {
                int var3 = -((int) (4294967296L % (long) var1)) + Integer.MIN_VALUE;

                int var4;
                do {
                    var4 = var2.nextInt();
                } while (var3 <= var4);

                return Class3_Sub13_Sub7.method201(var4, var1, -58);
            }
        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "ni.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
        }
    }

    static void method1605(RSString var1, int var2) {
        try {
            Class3_Sub13_Sub1.outgoingBuffer.putOpcode(188);
            Class3_Sub13_Sub1.outgoingBuffer.writeByte128(var2);
            Class3_Sub13_Sub1.outgoingBuffer.writeLong(var1.toLong());
        } catch (RuntimeException var4) {
            throw ClientErrorException.clientError(var4, "ni.B(" + 255 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
        }
    }

    private void method1600(int var1) {
        try {
            double var3 = (double) (255 & var1 >> 16) / 256.0D;
            double var5 = (double) (255 & var1 >> 8) / 256.0D;
            double var9 = var3;
            double var7 = (double) (var1 & 255) / 256.0D;
            if (var5 < var3) {
                var9 = var5;
            }

            if (var7 < var9) {
                var9 = var7;
            }

            double var11 = var3;
            double var14 = 0.0D;
            if (var5 > var3) {
                var11 = var5;
            }

            if (var7 > var11) {
                var11 = var7;
            }

            double var16 = 0.0D;
            double var18 = (var11 + var9) / 2.0D;
            if (var9 != var11) {
                if (0.5D > var18) {
                    var16 = (var11 - var9) / (var11 + var9);
                }

                if (var11 == var3) {
                    var14 = (-var7 + var5) / (-var9 + var11);
                } else if (var5 == var11) {
                    var14 = (var7 - var3) / (var11 - var9) + 2.0D;
                } else if (var7 == var11) {
                    var14 = 4.0D + (-var5 + var3) / (-var9 + var11);
                }

                if (0.5D <= var18) {
                    var16 = (var11 - var9) / (-var9 + (2.0D - var11));
                }
            }

            if (var18 > 0.5D) {
                this.anInt1418 = (int) (var16 * (-var18 + 1.0D) * 512.0D);
            } else {
                this.anInt1418 = (int) (var16 * var18 * 512.0D);
            }

            if (1 > this.anInt1418) {
                this.anInt1418 = 1;
            }

            this.anInt1406 = (int) (var16 * 256.0D);
            this.anInt1417 = (int) (256.0D * var18);

            if (this.anInt1417 >= 0) {
                if ((GameConfig.CHRISTMAS_EVENT_ENABLED ? -255 : 255) < this.anInt1417) {//Underlay white transformation -
                    this.anInt1417 = 255;
                }
            } else {
                this.anInt1417 = 0;
            }

            var14 /= 6.0D;
            this.anInt1408 = (int) ((double) this.anInt1418 * var14);
            if (this.anInt1406 >= 0) {
                if ((GameConfig.CHRISTMAS_EVENT_ENABLED ? -255 : 255) < this.anInt1406) {//Underlay white transformation -
                    this.anInt1406 = 255;
                }
            } else {
                this.anInt1406 = 0;
            }

        } catch (RuntimeException var20) {
            throw ClientErrorException.clientError(var20, "ni.D(" + var1 + ',' + (byte) 81 + ')');
        }
    }

    final void method1601(int var1, DataBuffer var2) {
        try {
            while (true) {
                int var4 = var2.readUnsignedByte();
                if (var4 == 0) {

                    return;
                }

                this.method1604(var4, var2, var1);
            }
        } catch (RuntimeException var5) {
            throw ClientErrorException.clientError(var5, "ni.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + 255 + ')');
        }
    }

    private void method1604(int var2, DataBuffer var3, int var4) {
        try {
            if (var2 == 1) {
                int anInt1404 = var3.readMedium();
                this.method1600(anInt1404);
            } else if (var2 == 2) {
                this.anInt1412 = var3.readUnsignedShort();
                if (this.anInt1412 == 65535) {
                    this.anInt1412 = -1;
                }
            } else if (3 == var2) {
                this.anInt1414 = var3.readUnsignedShort();
            } else if (var2 == 4) {
                this.aBoolean1411 = false;
            }

        } catch (RuntimeException var6) {
            throw ClientErrorException.clientError(var6, "ni.E(" + (byte) -52 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
        }
    }

}
