package com.tencent.mm.n;

import android.annotation.SuppressLint;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ay;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

@SuppressLint({"DefaultLocale"})
final class t
  implements br
{
  private l ddn;
  public x dmZ = null;
  public String dns = null;
  public boolean dnt = true;

  public t(s params, x paramx)
  {
    this.dmZ = paramx;
    this.dns = af.sh().g(paramx.getUsername(), true);
    this.ddn = new l();
  }

  // ERROR //
  public final boolean rD()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 28	com/tencent/mm/n/t:dmZ	Lcom/tencent/mm/n/x;
    //   4: ifnonnull +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: getfield 28	com/tencent/mm/n/t:dmZ	Lcom/tencent/mm/n/x;
    //   13: invokevirtual 62	com/tencent/mm/n/x:st	()Ljava/lang/String;
    //   16: astore_1
    //   17: ldc 64
    //   19: astore_2
    //   20: invokestatic 69	com/tencent/mm/model/bg:oE	()Z
    //   23: ifeq +66 -> 89
    //   26: iconst_4
    //   27: anewarray 4	java/lang/Object
    //   30: astore 22
    //   32: aload 22
    //   34: iconst_0
    //   35: getstatic 75	com/tencent/mm/protocal/a:hrn	I
    //   38: invokestatic 81	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   41: aastore
    //   42: aload 22
    //   44: iconst_1
    //   45: invokestatic 85	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   48: invokevirtual 91	com/tencent/mm/model/b:oD	()I
    //   51: invokestatic 97	com/tencent/mm/a/k:getString	(I)Ljava/lang/String;
    //   54: aastore
    //   55: aload 22
    //   57: iconst_2
    //   58: invokestatic 103	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   61: invokestatic 109	com/tencent/mm/sdk/platformtools/bc:bX	(Landroid/content/Context;)I
    //   64: invokestatic 81	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   67: aastore
    //   68: aload 22
    //   70: iconst_3
    //   71: invokestatic 103	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   74: invokestatic 112	com/tencent/mm/sdk/platformtools/bc:bY	(Landroid/content/Context;)I
    //   77: invokestatic 81	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aastore
    //   81: ldc 114
    //   83: aload 22
    //   85: invokestatic 120	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   88: astore_2
    //   89: iconst_3
    //   90: anewarray 4	java/lang/Object
    //   93: astore_3
    //   94: aload_3
    //   95: iconst_0
    //   96: aload_0
    //   97: getfield 28	com/tencent/mm/n/t:dmZ	Lcom/tencent/mm/n/x;
    //   100: invokevirtual 44	com/tencent/mm/n/x:getUsername	()Ljava/lang/String;
    //   103: aastore
    //   104: aload_3
    //   105: iconst_1
    //   106: aload_2
    //   107: aastore
    //   108: aload_3
    //   109: iconst_2
    //   110: aload_1
    //   111: aastore
    //   112: ldc 122
    //   114: ldc 124
    //   116: aload_3
    //   117: invokestatic 130	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: aload_0
    //   121: iconst_1
    //   122: putfield 32	com/tencent/mm/n/t:dnt	Z
    //   125: aload_1
    //   126: invokestatic 136	com/tencent/mm/network/k:jr	(Ljava/lang/String;)Lcom/tencent/mm/network/be;
    //   129: astore 13
    //   131: aload 13
    //   133: ldc 138
    //   135: invokevirtual 144	com/tencent/mm/network/be:setRequestMethod	(Ljava/lang/String;)V
    //   138: aload 13
    //   140: ldc 146
    //   142: aload_2
    //   143: invokevirtual 150	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   146: aload 13
    //   148: sipush 5000
    //   151: invokevirtual 154	com/tencent/mm/network/be:setConnectTimeout	(I)V
    //   154: aload 13
    //   156: sipush 5000
    //   159: invokevirtual 157	com/tencent/mm/network/be:setReadTimeout	(I)V
    //   162: aload 13
    //   164: invokestatic 161	com/tencent/mm/network/k:a	(Lcom/tencent/mm/network/be;)I
    //   167: ifeq +20 -> 187
    //   170: ldc 122
    //   172: ldc 163
    //   174: iconst_1
    //   175: anewarray 4	java/lang/Object
    //   178: dup
    //   179: iconst_0
    //   180: aload_1
    //   181: aastore
    //   182: invokestatic 166	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: iconst_1
    //   186: ireturn
    //   187: aload 13
    //   189: invokevirtual 170	com/tencent/mm/network/be:getInputStream	()Ljava/io/InputStream;
    //   192: astore 15
    //   194: aload 15
    //   196: astore 5
    //   198: aload 5
    //   200: ifnonnull +20 -> 220
    //   203: ldc 122
    //   205: ldc 172
    //   207: iconst_1
    //   208: anewarray 4	java/lang/Object
    //   211: dup
    //   212: iconst_0
    //   213: aload_1
    //   214: aastore
    //   215: invokestatic 130	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: iconst_1
    //   219: ireturn
    //   220: sipush 1024
    //   223: newarray byte
    //   225: astore 17
    //   227: new 174	java/io/FileOutputStream
    //   230: dup
    //   231: new 176	java/lang/StringBuilder
    //   234: dup
    //   235: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   238: aload_0
    //   239: getfield 30	com/tencent/mm/n/t:dns	Ljava/lang/String;
    //   242: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: ldc 183
    //   247: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: invokevirtual 186	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   253: invokespecial 188	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   256: astore 18
    //   258: aload 5
    //   260: aload 17
    //   262: invokevirtual 194	java/io/InputStream:read	([B)I
    //   265: istore 20
    //   267: iload 20
    //   269: iconst_m1
    //   270: if_icmpeq +75 -> 345
    //   273: aload 18
    //   275: aload 17
    //   277: iconst_0
    //   278: iload 20
    //   280: invokevirtual 200	java/io/OutputStream:write	([BII)V
    //   283: goto -25 -> 258
    //   286: astore 19
    //   288: aload 18
    //   290: astore 6
    //   292: aload 13
    //   294: astore 7
    //   296: aload_0
    //   297: iconst_1
    //   298: putfield 32	com/tencent/mm/n/t:dnt	Z
    //   301: aload 5
    //   303: astore 8
    //   305: aload 6
    //   307: astore 9
    //   309: aload 8
    //   311: astore 10
    //   313: aload 7
    //   315: ifnull +8 -> 323
    //   318: aload 7
    //   320: invokevirtual 203	com/tencent/mm/network/be:disconnect	()V
    //   323: aload 10
    //   325: ifnull +8 -> 333
    //   328: aload 10
    //   330: invokevirtual 206	java/io/InputStream:close	()V
    //   333: aload 9
    //   335: ifnull +8 -> 343
    //   338: aload 9
    //   340: invokevirtual 207	java/io/OutputStream:close	()V
    //   343: iconst_1
    //   344: ireturn
    //   345: aload_0
    //   346: iconst_0
    //   347: putfield 32	com/tencent/mm/n/t:dnt	Z
    //   350: aload 18
    //   352: invokevirtual 207	java/io/OutputStream:close	()V
    //   355: aload 13
    //   357: invokevirtual 203	com/tencent/mm/network/be:disconnect	()V
    //   360: aload 5
    //   362: invokevirtual 206	java/io/InputStream:close	()V
    //   365: aconst_null
    //   366: astore 9
    //   368: aconst_null
    //   369: astore 10
    //   371: aconst_null
    //   372: astore 7
    //   374: goto -61 -> 313
    //   377: astore 11
    //   379: iconst_1
    //   380: anewarray 4	java/lang/Object
    //   383: astore 12
    //   385: aload 12
    //   387: iconst_0
    //   388: aload 11
    //   390: invokevirtual 210	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   393: aastore
    //   394: ldc 122
    //   396: ldc 212
    //   398: aload 12
    //   400: invokestatic 166	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: goto -60 -> 343
    //   406: astore 4
    //   408: aconst_null
    //   409: astore 5
    //   411: aconst_null
    //   412: astore 6
    //   414: aconst_null
    //   415: astore 7
    //   417: goto -121 -> 296
    //   420: astore 14
    //   422: aload 13
    //   424: astore 7
    //   426: aconst_null
    //   427: astore 5
    //   429: aconst_null
    //   430: astore 6
    //   432: goto -136 -> 296
    //   435: astore 16
    //   437: aload 13
    //   439: astore 7
    //   441: aconst_null
    //   442: astore 6
    //   444: goto -148 -> 296
    //   447: astore 21
    //   449: aconst_null
    //   450: astore 6
    //   452: aconst_null
    //   453: astore 7
    //   455: goto -159 -> 296
    //
    // Exception table:
    //   from	to	target	type
    //   258	267	286	java/lang/Exception
    //   273	283	286	java/lang/Exception
    //   345	355	286	java/lang/Exception
    //   318	323	377	java/lang/Exception
    //   328	333	377	java/lang/Exception
    //   338	343	377	java/lang/Exception
    //   125	131	406	java/lang/Exception
    //   131	185	420	java/lang/Exception
    //   187	194	420	java/lang/Exception
    //   203	218	435	java/lang/Exception
    //   220	258	435	java/lang/Exception
    //   355	360	435	java/lang/Exception
    //   360	365	447	java/lang/Exception
  }

  public final boolean rE()
  {
    if (this.dnu.dnq)
      return false;
    if ((this.dnt) || (ch.jb(this.dns)))
    {
      this.dnu.dno.A(4, -1);
      return false;
    }
    z.d("!44@/B4Tb64lLpInTscHU+IPGhJ+o4yZb+hjE0RNiSZcohg=", "dkavatar user:" + this.dmZ.getUsername() + " urltime:" + this.ddn.nM());
    if (at.qy() != null)
      at.qy().x(c.ab(this.dns + ".tmp"), 0);
    c.deleteFile(this.dns);
    new File(this.dns + ".tmp").renameTo(new File(this.dns));
    aa.G(this.dns, this.dnu.dnd.getUsername());
    this.dnu.dno.A(0, 0);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.t
 * JD-Core Version:    0.6.2
 */