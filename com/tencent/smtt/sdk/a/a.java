package com.tencent.smtt.sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
{
  public static final byte[] a;
  public static final byte[] b;
  public static final byte[] c;
  public static final byte[] d;
  public static final byte[] e;
  private static final int[] f;
  private static final int[] g;
  private static final int[] h;
  private static final int[] i;
  private static final int[] j;
  private static final int[] k;
  private static final int[][][] l;
  private static final int[] m;

  static
  {
    AppMethodBeat.i(65138);
    f = new int[] { 58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7 };
    g = new int[] { 40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25 };
    h = new int[] { 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4 };
    i = new int[] { 14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32 };
    j = new int[] { 32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1 };
    k = new int[] { 16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25 };
    int[][] arrayOfInt1 = { { 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7 }, { 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8 }, { 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0 }, { 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 } };
    int[] arrayOfInt2 = { 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10 };
    int[] arrayOfInt3 = { 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5 };
    int[] arrayOfInt4 = { 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15 };
    int[] arrayOfInt5 = { 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9 };
    int[] arrayOfInt6 = { 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8 };
    int[] arrayOfInt7 = { 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1 };
    int[] arrayOfInt8 = { 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7 };
    int[] arrayOfInt9 = { 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12 };
    int[][] arrayOfInt10 = { { 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15 }, { 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9 }, { 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4 }, { 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14 } };
    int[] arrayOfInt11 = { 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9 };
    int[] arrayOfInt12 = { 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14 };
    Object localObject = { 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8 };
    int[] arrayOfInt13 = { 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6 };
    localObject = new int[][] { { 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11 }, localObject, arrayOfInt13, { 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13 } };
    arrayOfInt13 = new int[] { 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2 };
    int[] arrayOfInt14 = { 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12 };
    int[] arrayOfInt15 = { 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7 };
    int[] arrayOfInt16 = { 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2 };
    int[] arrayOfInt17 = { 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8 };
    int[] arrayOfInt18 = { 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11 };
    l = new int[][][] { arrayOfInt1, { arrayOfInt2, arrayOfInt3, arrayOfInt4, arrayOfInt5 }, { arrayOfInt6, arrayOfInt7, arrayOfInt8, arrayOfInt9 }, arrayOfInt10, { arrayOfInt11, { 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6 }, arrayOfInt12, { 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3 } }, localObject, { { 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1 }, { 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6 }, arrayOfInt13, arrayOfInt14 }, { arrayOfInt15, arrayOfInt16, arrayOfInt17, arrayOfInt18 } };
    m = new int[] { 1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1 };
    a = new byte[] { 98, -24, 57, -84, -115, 117, 55, 121 };
    b = new byte[] { -25, -101, -115, 1, 47, 7, -27, -59, 18, -128, 123, 79, -44, 37, 46, 115 };
    c = new byte[] { 37, -110, 60, 127, 42, -27, -17, -110 };
    d = new byte[] { -122, -8, -23, -84, -125, 113, 84, 99 };
    e = "AL!#$AC9Ahg@KLJ1".getBytes();
    AppMethodBeat.o(65138);
  }

  private static void a(int[] paramArrayOfInt, int paramInt)
  {
    int n = 0;
    int[] arrayOfInt1 = new int[28];
    int[] arrayOfInt2 = new int[28];
    int[] arrayOfInt3 = new int[28];
    int[] arrayOfInt4 = new int[28];
    for (int i1 = 0; i1 < 28; i1++)
    {
      arrayOfInt1[i1] = paramArrayOfInt[i1];
      arrayOfInt2[i1] = paramArrayOfInt[(i1 + 28)];
    }
    if (paramInt == 1)
    {
      for (paramInt = 0; paramInt < 27; paramInt++)
      {
        arrayOfInt3[paramInt] = arrayOfInt1[(paramInt + 1)];
        arrayOfInt4[paramInt] = arrayOfInt2[(paramInt + 1)];
      }
      arrayOfInt3[27] = arrayOfInt1[0];
      arrayOfInt4[27] = arrayOfInt2[0];
      i1 = n;
    }
    while (i1 < 28)
    {
      paramArrayOfInt[i1] = arrayOfInt3[i1];
      paramArrayOfInt[(i1 + 28)] = arrayOfInt4[i1];
      i1++;
      continue;
      i1 = n;
      if (paramInt == 2)
      {
        for (paramInt = 0; paramInt < 26; paramInt++)
        {
          arrayOfInt3[paramInt] = arrayOfInt1[(paramInt + 2)];
          arrayOfInt4[paramInt] = arrayOfInt2[(paramInt + 2)];
        }
        arrayOfInt3[26] = arrayOfInt1[0];
        arrayOfInt4[26] = arrayOfInt2[0];
        arrayOfInt3[27] = arrayOfInt1[1];
        arrayOfInt4[27] = arrayOfInt2[1];
        i1 = n;
      }
    }
  }

  private static void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int[][] paramArrayOfInt1)
  {
    int[] arrayOfInt1 = new int[32];
    int[] arrayOfInt2 = new int[32];
    int[] arrayOfInt3 = new int[32];
    int[] arrayOfInt4 = new int[32];
    int[] arrayOfInt5 = new int[48];
    int[][] arrayOfInt = new int[8][6];
    int[] arrayOfInt6 = new int[8];
    int[] arrayOfInt7 = new int[32];
    int[] arrayOfInt8 = new int[32];
    for (int n = 0; n < 32; n++)
    {
      arrayOfInt1[n] = paramArrayOfInt[n];
      arrayOfInt2[n] = paramArrayOfInt[(n + 32)];
    }
    for (n = 0; n < 48; n++)
    {
      arrayOfInt5[n] = arrayOfInt2[(j[n] - 1)];
      arrayOfInt5[n] += paramArrayOfInt1[paramInt1][n];
      if (arrayOfInt5[n] == 2)
        arrayOfInt5[n] = 0;
    }
    for (n = 0; n < 8; n++)
    {
      for (int i1 = 0; i1 < 6; i1++)
        arrayOfInt[n][i1] = arrayOfInt5[(n * 6 + i1)];
      arrayOfInt6[n] = l[n][((arrayOfInt[n][0] << 1) + arrayOfInt[n][5])][((arrayOfInt[n][1] << 3) + (arrayOfInt[n][2] << 2) + (arrayOfInt[n][3] << 1) + arrayOfInt[n][4])];
      for (i1 = 0; i1 < 4; i1++)
      {
        arrayOfInt7[(n * 4 + 3 - i1)] = (arrayOfInt6[n] % 2);
        arrayOfInt6[n] /= 2;
      }
    }
    n = 0;
    if (n < 32)
    {
      arrayOfInt8[n] = arrayOfInt7[(k[n] - 1)];
      arrayOfInt3[n] = arrayOfInt2[n];
      arrayOfInt1[n] += arrayOfInt8[n];
      if (arrayOfInt4[n] == 2)
        arrayOfInt4[n] = 0;
      if (((paramInt2 == 0) && (paramInt1 == 0)) || ((paramInt2 == 1) && (paramInt1 == 15)))
      {
        paramArrayOfInt[n] = arrayOfInt4[n];
        paramArrayOfInt[(n + 32)] = arrayOfInt3[n];
      }
      while (true)
      {
        n++;
        break;
        paramArrayOfInt[n] = arrayOfInt3[n];
        paramArrayOfInt[(n + 32)] = arrayOfInt4[n];
      }
    }
  }

  private static void a(int[] paramArrayOfInt, byte[] paramArrayOfByte)
  {
    for (int n = 0; n < 8; n++)
      for (int i1 = 0; i1 < 8; i1++)
        paramArrayOfByte[n] = ((byte)(byte)(paramArrayOfByte[n] + (paramArrayOfInt[((n << 3) + i1)] << 7 - i1)));
  }

  private static void a(int[] paramArrayOfInt, int[][] paramArrayOfInt1)
  {
    AppMethodBeat.i(65133);
    int[] arrayOfInt = new int[56];
    for (int n = 0; n < 56; n++)
      arrayOfInt[n] = paramArrayOfInt[(h[n] - 1)];
    for (n = 0; n < 16; n++)
    {
      a(arrayOfInt, m[n]);
      for (int i1 = 0; i1 < 48; i1++)
        paramArrayOfInt1[n][i1] = arrayOfInt[(i[i1] - 1)];
    }
    AppMethodBeat.o(65133);
  }

  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    int n = 0;
    AppMethodBeat.i(65137);
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte1 == null))
    {
      AppMethodBeat.o(65137);
      paramArrayOfByte1 = paramArrayOfByte2;
      return paramArrayOfByte1;
    }
    while (true)
    {
      try
      {
        byte[] arrayOfByte1 = c(paramArrayOfByte1);
        paramArrayOfByte1 = b(paramArrayOfByte2);
        int i1 = paramArrayOfByte1.length;
        int i2 = i1 / 8;
        byte[] arrayOfByte2 = new byte[i1];
        i1 = 0;
        byte[] arrayOfByte3;
        if (i1 < i2)
        {
          arrayOfByte3 = new byte[8];
          byte[] arrayOfByte4 = new byte[8];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, 8);
          System.arraycopy(paramArrayOfByte1, i1 * 8, arrayOfByte4, 0, 8);
          System.arraycopy(b(arrayOfByte3, arrayOfByte4, paramInt), 0, arrayOfByte2, i1 * 8, 8);
          i1++;
          continue;
        }
        paramArrayOfByte1 = arrayOfByte2;
        if (paramInt == 0)
        {
          arrayOfByte3 = new byte[paramArrayOfByte2.length];
          System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte3.length);
          i1 = arrayOfByte3[(arrayOfByte3.length - 1)];
          paramArrayOfByte1 = arrayOfByte2;
          if (i1 > 0)
          {
            paramArrayOfByte1 = arrayOfByte2;
            if (i1 <= 8)
            {
              paramInt = 0;
              if (paramInt >= i1)
                break label255;
              if (i1 == arrayOfByte3[(arrayOfByte3.length - 1 - paramInt)])
                continue;
              paramInt = n;
              paramArrayOfByte1 = arrayOfByte2;
              if (paramInt != 0)
              {
                paramArrayOfByte1 = new byte[arrayOfByte3.length - i1];
                System.arraycopy(arrayOfByte3, 0, paramArrayOfByte1, 0, paramArrayOfByte1.length);
              }
            }
          }
        }
        AppMethodBeat.o(65137);
        break;
        paramInt++;
        continue;
      }
      catch (Exception paramArrayOfByte1)
      {
        AppMethodBeat.o(65137);
        paramArrayOfByte1 = paramArrayOfByte2;
      }
      break;
      label255: paramInt = 1;
    }
  }

  private static byte[] a(int[] paramArrayOfInt, int paramInt, int[][] paramArrayOfInt1)
  {
    int n = 0;
    AppMethodBeat.i(65134);
    byte[] arrayOfByte = new byte[8];
    int[] arrayOfInt1 = new int[64];
    int[] arrayOfInt2 = new int[64];
    for (int i1 = 0; i1 < 64; i1++)
      arrayOfInt1[i1] = paramArrayOfInt[(f[i1] - 1)];
    int i2;
    if (paramInt == 1)
      for (i2 = 0; ; i2++)
      {
        i1 = n;
        if (i2 >= 16)
          break;
        a(arrayOfInt1, i2, paramInt, paramArrayOfInt1);
      }
    i1 = n;
    if (paramInt == 0)
      for (i2 = 15; ; i2--)
      {
        i1 = n;
        if (i2 < 0)
          break;
        a(arrayOfInt1, i2, paramInt, paramArrayOfInt1);
      }
    while (i1 < 64)
    {
      arrayOfInt2[i1] = arrayOfInt1[(g[i1] - 1)];
      i1++;
    }
    a(arrayOfInt2, arrayOfByte);
    AppMethodBeat.o(65134);
    return arrayOfByte;
  }

  private static int[] a(byte[] paramArrayOfByte)
  {
    int[] arrayOfInt = new int[8];
    for (int n = 0; n < 8; n++)
    {
      arrayOfInt[n] = paramArrayOfByte[n];
      if (arrayOfInt[n] < 0)
      {
        arrayOfInt[n] += 256;
        arrayOfInt[n] %= 256;
      }
    }
    paramArrayOfByte = new int[64];
    for (n = 0; n < 8; n++)
      for (int i1 = 0; i1 < 8; i1++)
      {
        paramArrayOfByte[(n * 8 + 7 - i1)] = (arrayOfInt[n] % 2);
        arrayOfInt[n] /= 2;
      }
    return paramArrayOfByte;
  }

  private static byte[] b(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65135);
    int n = paramArrayOfByte.length;
    int i1 = 8 - n % 8;
    int i2 = n + i1;
    byte[] arrayOfByte = new byte[i2];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, n);
    while (n < i2)
    {
      arrayOfByte[n] = ((byte)(byte)i1);
      n++;
    }
    AppMethodBeat.o(65135);
    return arrayOfByte;
  }

  private static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    AppMethodBeat.i(65132);
    if ((paramArrayOfByte1.length != 8) || (paramArrayOfByte2.length != 8) || ((paramInt != 1) && (paramInt != 0)))
    {
      paramArrayOfByte1 = new RuntimeException("Data Format Error !");
      AppMethodBeat.o(65132);
      throw paramArrayOfByte1;
    }
    int[][] arrayOfInt = new int[16][48];
    paramArrayOfByte1 = a(paramArrayOfByte1);
    paramArrayOfByte2 = a(paramArrayOfByte2);
    a(paramArrayOfByte1, arrayOfInt);
    paramArrayOfByte1 = a(paramArrayOfByte2, paramInt, arrayOfInt);
    AppMethodBeat.o(65132);
    return paramArrayOfByte1;
  }

  private static byte[] c(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65136);
    byte[] arrayOfByte = new byte[8];
    for (int n = 0; n < 8; n++)
      arrayOfByte[n] = ((byte)0);
    if (paramArrayOfByte.length > 8)
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, 8);
    while (true)
    {
      AppMethodBeat.o(65136);
      return arrayOfByte;
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.a.a
 * JD-Core Version:    0.6.2
 */