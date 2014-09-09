package com.tencent.mm.n;

import android.graphics.Bitmap;
import com.tencent.mm.a.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class q
{
  public static r dnn = null;

  // ERROR //
  public static Bitmap F(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 18	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 21	java/lang/StringBuilder:<init>	()V
    //   7: aload_0
    //   8: invokevirtual 25	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11: ldc 27
    //   13: invokevirtual 25	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   19: astore_2
    //   20: new 33	java/io/File
    //   23: dup
    //   24: aload_2
    //   25: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   28: astore_3
    //   29: aload_3
    //   30: invokevirtual 40	java/io/File:exists	()Z
    //   33: ifne +20 -> 53
    //   36: ldc 42
    //   38: ldc 44
    //   40: iconst_1
    //   41: anewarray 4	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_2
    //   47: aastore
    //   48: invokestatic 50	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: aconst_null
    //   52: areturn
    //   53: aload_3
    //   54: invokevirtual 54	java/io/File:length	()J
    //   57: l2i
    //   58: istore 11
    //   60: iload 11
    //   62: ifle +17 -> 79
    //   65: iload 11
    //   67: ldc 55
    //   69: if_icmpeq +109 -> 178
    //   72: iload 11
    //   74: ldc 56
    //   76: if_icmpeq +102 -> 178
    //   79: aload_0
    //   80: invokestatic 60	com/tencent/mm/n/q:eZ	(Ljava/lang/String;)Z
    //   83: pop
    //   84: iconst_2
    //   85: anewarray 4	java/lang/Object
    //   88: astore 13
    //   90: aload 13
    //   92: iconst_0
    //   93: iload 11
    //   95: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   98: aastore
    //   99: aload 13
    //   101: iconst_1
    //   102: aload_2
    //   103: aastore
    //   104: ldc 42
    //   106: ldc 68
    //   108: aload 13
    //   110: invokestatic 71	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: aconst_null
    //   114: areturn
    //   115: astore 9
    //   117: aconst_null
    //   118: astore 5
    //   120: aconst_null
    //   121: astore 6
    //   123: iconst_2
    //   124: anewarray 4	java/lang/Object
    //   127: astore 10
    //   129: aload 10
    //   131: iconst_0
    //   132: aload 9
    //   134: invokevirtual 74	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   137: aastore
    //   138: aload 10
    //   140: iconst_1
    //   141: aload_2
    //   142: aastore
    //   143: ldc 42
    //   145: ldc 76
    //   147: aload 10
    //   149: invokestatic 71	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: aload 5
    //   154: ifnull +8 -> 162
    //   157: aload 5
    //   159: invokevirtual 81	java/nio/channels/FileChannel:close	()V
    //   162: aload 6
    //   164: ifnull +361 -> 525
    //   167: aload 6
    //   169: invokevirtual 84	java/io/FileInputStream:close	()V
    //   172: aconst_null
    //   173: areturn
    //   174: astore 8
    //   176: aconst_null
    //   177: areturn
    //   178: iload 11
    //   180: ldc 55
    //   182: if_icmpne +83 -> 265
    //   185: getstatic 10	com/tencent/mm/n/q:dnn	Lcom/tencent/mm/n/r;
    //   188: ifnull +77 -> 265
    //   191: getstatic 10	com/tencent/mm/n/q:dnn	Lcom/tencent/mm/n/r;
    //   194: aload_1
    //   195: invokeinterface 89 2 0
    //   200: ifeq +65 -> 265
    //   203: ldc 42
    //   205: ldc 91
    //   207: iconst_1
    //   208: anewarray 4	java/lang/Object
    //   211: dup
    //   212: iconst_0
    //   213: aload_0
    //   214: aastore
    //   215: invokestatic 50	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: aload_0
    //   219: invokestatic 60	com/tencent/mm/n/q:eZ	(Ljava/lang/String;)Z
    //   222: pop
    //   223: aconst_null
    //   224: areturn
    //   225: astore 4
    //   227: aconst_null
    //   228: astore 5
    //   230: aconst_null
    //   231: astore 6
    //   233: iconst_2
    //   234: anewarray 4	java/lang/Object
    //   237: astore 7
    //   239: aload 7
    //   241: iconst_0
    //   242: aload 4
    //   244: invokevirtual 92	java/lang/OutOfMemoryError:getMessage	()Ljava/lang/String;
    //   247: aastore
    //   248: aload 7
    //   250: iconst_1
    //   251: aload_2
    //   252: aastore
    //   253: ldc 42
    //   255: ldc 94
    //   257: aload 7
    //   259: invokestatic 71	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   262: goto -110 -> 152
    //   265: new 83	java/io/FileInputStream
    //   268: dup
    //   269: aload_2
    //   270: invokespecial 95	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   273: astore 6
    //   275: aload 6
    //   277: invokevirtual 99	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   280: astore 14
    //   282: aload 14
    //   284: astore 5
    //   286: ldc 55
    //   288: invokestatic 105	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   291: astore 15
    //   293: aload 5
    //   295: aload 15
    //   297: invokevirtual 109	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   300: pop
    //   301: aload 15
    //   303: iconst_0
    //   304: invokevirtual 113	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   307: pop
    //   308: iload 11
    //   310: ldc 56
    //   312: if_icmpne +207 -> 519
    //   315: bipush 16
    //   317: invokestatic 105	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   320: astore 18
    //   322: aload 5
    //   324: aload 18
    //   326: invokevirtual 109	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   329: pop
    //   330: aload 18
    //   332: iconst_0
    //   333: invokevirtual 117	java/nio/ByteBuffer:getLong	(I)J
    //   336: lstore 20
    //   338: lload 20
    //   340: lconst_1
    //   341: lcmp
    //   342: ifeq +190 -> 532
    //   345: iconst_3
    //   346: anewarray 4	java/lang/Object
    //   349: astore 22
    //   351: aload 22
    //   353: iconst_0
    //   354: lload 20
    //   356: invokestatic 122	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   359: aastore
    //   360: aload 22
    //   362: iconst_1
    //   363: iload 11
    //   365: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   368: aastore
    //   369: aload 22
    //   371: iconst_2
    //   372: aload_2
    //   373: aastore
    //   374: ldc 42
    //   376: ldc 124
    //   378: aload 22
    //   380: invokestatic 71	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   383: aload 5
    //   385: invokevirtual 81	java/nio/channels/FileChannel:close	()V
    //   388: aload 6
    //   390: invokevirtual 84	java/io/FileInputStream:close	()V
    //   393: aload_0
    //   394: invokestatic 60	com/tencent/mm/n/q:eZ	(Ljava/lang/String;)Z
    //   397: pop
    //   398: aconst_null
    //   399: areturn
    //   400: iconst_3
    //   401: anewarray 4	java/lang/Object
    //   404: astore 25
    //   406: aload 25
    //   408: iconst_0
    //   409: iload 11
    //   411: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   414: aastore
    //   415: aload 25
    //   417: iconst_1
    //   418: iload 24
    //   420: invokestatic 129	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   423: aastore
    //   424: aload 25
    //   426: iconst_2
    //   427: aload_2
    //   428: aastore
    //   429: ldc 42
    //   431: ldc 131
    //   433: aload 25
    //   435: invokestatic 134	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   438: aload 5
    //   440: invokevirtual 81	java/nio/channels/FileChannel:close	()V
    //   443: aload 6
    //   445: invokevirtual 84	java/io/FileInputStream:close	()V
    //   448: bipush 96
    //   450: bipush 96
    //   452: getstatic 140	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   455: invokestatic 146	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   458: astore 26
    //   460: aload 26
    //   462: aload 15
    //   464: invokevirtual 150	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
    //   467: iload 24
    //   469: ifeq +26 -> 495
    //   472: aload 26
    //   474: bipush 9
    //   476: bipush 9
    //   478: bipush 78
    //   480: bipush 78
    //   482: invokestatic 153	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   485: astore 27
    //   487: aload 26
    //   489: invokevirtual 156	android/graphics/Bitmap:recycle	()V
    //   492: aload 27
    //   494: areturn
    //   495: aload 26
    //   497: areturn
    //   498: astore 4
    //   500: aconst_null
    //   501: astore 5
    //   503: goto -270 -> 233
    //   506: astore 4
    //   508: goto -275 -> 233
    //   511: astore 9
    //   513: aconst_null
    //   514: astore 5
    //   516: goto -393 -> 123
    //   519: iconst_1
    //   520: istore 24
    //   522: goto -122 -> 400
    //   525: aconst_null
    //   526: areturn
    //   527: astore 9
    //   529: goto -406 -> 123
    //   532: iconst_0
    //   533: istore 24
    //   535: goto -135 -> 400
    //
    // Exception table:
    //   from	to	target	type
    //   20	51	115	java/lang/Exception
    //   53	60	115	java/lang/Exception
    //   79	113	115	java/lang/Exception
    //   185	223	115	java/lang/Exception
    //   265	275	115	java/lang/Exception
    //   448	467	115	java/lang/Exception
    //   472	492	115	java/lang/Exception
    //   157	162	174	java/lang/Exception
    //   167	172	174	java/lang/Exception
    //   20	51	225	java/lang/OutOfMemoryError
    //   53	60	225	java/lang/OutOfMemoryError
    //   79	113	225	java/lang/OutOfMemoryError
    //   185	223	225	java/lang/OutOfMemoryError
    //   265	275	225	java/lang/OutOfMemoryError
    //   448	467	225	java/lang/OutOfMemoryError
    //   472	492	225	java/lang/OutOfMemoryError
    //   275	282	498	java/lang/OutOfMemoryError
    //   443	448	498	java/lang/OutOfMemoryError
    //   286	308	506	java/lang/OutOfMemoryError
    //   315	338	506	java/lang/OutOfMemoryError
    //   345	398	506	java/lang/OutOfMemoryError
    //   400	443	506	java/lang/OutOfMemoryError
    //   275	282	511	java/lang/Exception
    //   443	448	511	java/lang/Exception
    //   286	308	527	java/lang/Exception
    //   315	338	527	java/lang/Exception
    //   345	398	527	java/lang/Exception
    //   400	443	527	java/lang/Exception
  }

  static boolean e(String paramString, Bitmap paramBitmap)
  {
    if (!m.b(paramBitmap));
    while (ch.jb(paramString))
      return false;
    String str = paramString + ".bm";
    try
    {
      int i = paramBitmap.getRowBytes() * paramBitmap.getHeight();
      if (i > 36864)
      {
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(i);
        arrayOfObject1[1] = str;
        z.e("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "SmallBM set bm invalid size:%d path:%s", arrayOfObject1);
        return false;
      }
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = str;
      z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "SmallBM set bm v2 size:%d path:%s", arrayOfObject2);
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(i + 16);
      localByteBuffer.position(0);
      paramBitmap.copyPixelsToBuffer(localByteBuffer);
      localByteBuffer.position(i);
      localByteBuffer.putLong(1L);
      FileOutputStream localFileOutputStream = new FileOutputStream(str);
      FileChannel localFileChannel = localFileOutputStream.getChannel();
      localByteBuffer.position(0);
      localFileChannel.write(localByteBuffer);
      localFileChannel.close();
      localFileOutputStream.close();
      return true;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      return false;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static String eY(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    return paramString + ".bm";
  }

  private static boolean eZ(String paramString)
  {
    String str = paramString + ".bm";
    c.deleteFile(paramString);
    c.deleteFile(str);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.q
 * JD-Core Version:    0.6.2
 */