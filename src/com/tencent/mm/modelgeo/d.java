package com.tencent.mm.modelgeo;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class d
  implements com.tencent.mm.o.m
{
  public static String TAG = "!32@/B4Tb64lLpIu6Y+BscdrxLFPH/GImPSD";
  private static d dvi;
  private g dvj = null;
  private LinkedList dvk = new LinkedList();
  private HashMap dvl = new HashMap();
  private bp dvm = new bp(1, "addr_worker");

  private void a(Addr paramAddr)
  {
    if (paramAddr == null)
      paramAddr = new Addr();
    Object localObject;
    String str2;
    if (this.dvj.dvh == null)
    {
      localObject = new Object();
      paramAddr.dvh = localObject;
      paramAddr.dvf = ((float)this.dvj.cGO);
      paramAddr.dvg = ((float)this.dvj.cGP);
      if (!ch.jb(paramAddr.duY))
      {
        str2 = ak.getContext().getResources().getString(n.bIZ);
        z.d(TAG, "city %s", new Object[] { str2 });
        if ((ch.ys()) || (ch.jb(str2)) || (!paramAddr.duY.endsWith(str2)))
          break label250;
        paramAddr.duZ = paramAddr.duY;
        paramAddr.duY = paramAddr.duY.substring(0, paramAddr.duY.length() - str2.length());
      }
    }
    while (true)
    {
      LinkedList localLinkedList = (LinkedList)this.dvl.get(this.dvj.toString());
      if (localLinkedList == null)
        break label316;
      Iterator localIterator = localLinkedList.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null))
          ((e)localWeakReference.get()).b(paramAddr);
      }
      localObject = this.dvj.dvh;
      break;
      label250: if ((!ch.ys()) && (!ch.jb(str2)) && (paramAddr.duW.indexOf(str2) >= 0))
        paramAddr.duZ = (paramAddr.duY + str2);
      else
        paramAddr.duZ = paramAddr.duY;
    }
    label316: this.dvl.remove(this.dvj.toString());
    String str1 = TAG;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.dvl.size());
    z.d(str1, "postexecute2 listeners %d", arrayOfObject);
    this.dvj = null;
    xk();
    if ((this.dvj == null) && (this.dvk.size() > 0))
      bg.qX().b(655, this);
  }

  private static boolean a(LinkedList paramLinkedList, e parame)
  {
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((e)localWeakReference.get()).equals(parame)))
        return true;
    }
    return false;
  }

  // ERROR //
  private static Addr b(double paramDouble1, double paramDouble2)
  {
    // Byte code:
    //   0: invokestatic 228	com/tencent/mm/sdk/platformtools/y:aGW	()Ljava/lang/String;
    //   3: astore 4
    //   5: new 53	com/tencent/mm/modelgeo/Addr
    //   8: dup
    //   9: invokespecial 54	com/tencent/mm/modelgeo/Addr:<init>	()V
    //   12: astore 5
    //   14: iconst_3
    //   15: anewarray 4	java/lang/Object
    //   18: astore 6
    //   20: aload 6
    //   22: iconst_0
    //   23: dload_0
    //   24: invokestatic 233	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   27: aastore
    //   28: aload 6
    //   30: iconst_1
    //   31: dload_2
    //   32: invokestatic 233	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   35: aastore
    //   36: aload 6
    //   38: iconst_2
    //   39: aload 4
    //   41: aastore
    //   42: ldc 235
    //   44: aload 6
    //   46: invokestatic 239	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   49: astore 7
    //   51: getstatic 24	com/tencent/mm/modelgeo/d:TAG	Ljava/lang/String;
    //   54: new 175	java/lang/StringBuilder
    //   57: dup
    //   58: ldc 241
    //   60: invokespecial 244	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   63: aload 7
    //   65: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokestatic 247	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: aload 7
    //   76: invokestatic 253	com/tencent/mm/network/k:jr	(Ljava/lang/String;)Lcom/tencent/mm/network/be;
    //   79: astore 15
    //   81: aload 15
    //   83: astore 12
    //   85: aload 12
    //   87: sipush 10000
    //   90: invokevirtual 259	com/tencent/mm/network/be:setConnectTimeout	(I)V
    //   93: aload 12
    //   95: ldc_w 261
    //   98: invokevirtual 264	com/tencent/mm/network/be:setRequestMethod	(Ljava/lang/String;)V
    //   101: getstatic 24	com/tencent/mm/modelgeo/d:TAG	Ljava/lang/String;
    //   104: new 175	java/lang/StringBuilder
    //   107: dup
    //   108: ldc_w 266
    //   111: invokespecial 244	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   114: aload 12
    //   116: invokevirtual 269	com/tencent/mm/network/be:getResponseCode	()I
    //   119: invokevirtual 272	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   122: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: invokestatic 247	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: new 274	java/io/InputStreamReader
    //   131: dup
    //   132: aload 12
    //   134: invokevirtual 278	com/tencent/mm/network/be:getInputStream	()Ljava/io/InputStream;
    //   137: invokespecial 281	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   140: astore 9
    //   142: new 283	java/io/BufferedReader
    //   145: dup
    //   146: aload 9
    //   148: invokespecial 286	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   151: astore 18
    //   153: new 288	java/lang/StringBuffer
    //   156: dup
    //   157: invokespecial 289	java/lang/StringBuffer:<init>	()V
    //   160: astore 19
    //   162: aload 18
    //   164: invokevirtual 292	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   167: astore 22
    //   169: aload 22
    //   171: ifnull +52 -> 223
    //   174: aload 19
    //   176: aload 22
    //   178: invokevirtual 295	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   181: pop
    //   182: goto -20 -> 162
    //   185: astore 21
    //   187: aload 12
    //   189: astore 10
    //   191: getstatic 24	com/tencent/mm/modelgeo/d:TAG	Ljava/lang/String;
    //   194: ldc_w 297
    //   197: invokestatic 247	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: aload 10
    //   202: ifnull +8 -> 210
    //   205: aload 10
    //   207: invokevirtual 300	com/tencent/mm/network/be:disconnect	()V
    //   210: aload 9
    //   212: ifnull +8 -> 220
    //   215: aload 9
    //   217: invokevirtual 303	java/io/InputStreamReader:close	()V
    //   220: aload 5
    //   222: areturn
    //   223: getstatic 24	com/tencent/mm/modelgeo/d:TAG	Ljava/lang/String;
    //   226: new 175	java/lang/StringBuilder
    //   229: dup
    //   230: ldc_w 305
    //   233: invokespecial 244	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   236: aload 19
    //   238: invokevirtual 306	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   241: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   247: invokestatic 247	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   250: new 308	org/json/JSONObject
    //   253: dup
    //   254: aload 19
    //   256: invokevirtual 306	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   259: invokespecial 309	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   262: ldc_w 311
    //   265: invokevirtual 315	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   268: astore 24
    //   270: aload 5
    //   272: aload 24
    //   274: iconst_0
    //   275: invokevirtual 321	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   278: ldc_w 323
    //   281: invokevirtual 326	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   284: putfield 169	com/tencent/mm/modelgeo/Addr:duW	Ljava/lang/String;
    //   287: aload 24
    //   289: iconst_0
    //   290: invokevirtual 321	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   293: ldc_w 328
    //   296: invokevirtual 315	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   299: astore 25
    //   301: iconst_0
    //   302: istore 26
    //   304: iload 26
    //   306: aload 25
    //   308: invokevirtual 329	org/json/JSONArray:length	()I
    //   311: if_icmpge +177 -> 488
    //   314: aload 25
    //   316: iload 26
    //   318: invokevirtual 321	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   321: astore 27
    //   323: aload 27
    //   325: ldc_w 331
    //   328: invokevirtual 326	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   331: astore 29
    //   333: aload 27
    //   335: ldc_w 333
    //   338: invokevirtual 315	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   341: iconst_0
    //   342: invokevirtual 334	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   345: astore 30
    //   347: aload 30
    //   349: ldc_w 336
    //   352: invokevirtual 337	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   355: ifeq +13 -> 368
    //   358: aload 5
    //   360: aload 29
    //   362: putfield 340	com/tencent/mm/modelgeo/Addr:duX	Ljava/lang/String;
    //   365: goto +224 -> 589
    //   368: aload 30
    //   370: ldc_w 342
    //   373: invokevirtual 337	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   376: ifeq +13 -> 389
    //   379: aload 5
    //   381: aload 29
    //   383: putfield 78	com/tencent/mm/modelgeo/Addr:duY	Ljava/lang/String;
    //   386: goto +203 -> 589
    //   389: aload 30
    //   391: ldc_w 344
    //   394: invokevirtual 337	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   397: ifeq +28 -> 425
    //   400: aload 5
    //   402: aload 29
    //   404: putfield 347	com/tencent/mm/modelgeo/Addr:dva	Ljava/lang/String;
    //   407: goto +182 -> 589
    //   410: astore 11
    //   412: aload 12
    //   414: ifnull +8 -> 422
    //   417: aload 12
    //   419: invokevirtual 300	com/tencent/mm/network/be:disconnect	()V
    //   422: aload 11
    //   424: athrow
    //   425: aload 30
    //   427: ldc_w 349
    //   430: invokevirtual 337	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   433: ifeq +13 -> 446
    //   436: aload 5
    //   438: aload 29
    //   440: putfield 352	com/tencent/mm/modelgeo/Addr:dvb	Ljava/lang/String;
    //   443: goto +146 -> 589
    //   446: aload 30
    //   448: ldc_w 354
    //   451: invokevirtual 337	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   454: ifeq +13 -> 467
    //   457: aload 5
    //   459: aload 29
    //   461: putfield 357	com/tencent/mm/modelgeo/Addr:dvc	Ljava/lang/String;
    //   464: goto +125 -> 589
    //   467: aload 30
    //   469: ldc_w 359
    //   472: invokevirtual 337	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   475: ifeq +114 -> 589
    //   478: aload 5
    //   480: aload 29
    //   482: putfield 362	com/tencent/mm/modelgeo/Addr:dvd	Ljava/lang/String;
    //   485: goto +104 -> 589
    //   488: aload 12
    //   490: ifnull -280 -> 210
    //   493: aload 12
    //   495: invokevirtual 300	com/tencent/mm/network/be:disconnect	()V
    //   498: goto -288 -> 210
    //   501: astore 14
    //   503: aconst_null
    //   504: astore 9
    //   506: aconst_null
    //   507: astore 12
    //   509: getstatic 24	com/tencent/mm/modelgeo/d:TAG	Ljava/lang/String;
    //   512: ldc_w 364
    //   515: invokestatic 247	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   518: aload 12
    //   520: ifnull -310 -> 210
    //   523: aload 12
    //   525: invokevirtual 300	com/tencent/mm/network/be:disconnect	()V
    //   528: goto -318 -> 210
    //   531: astore 13
    //   533: aload 5
    //   535: areturn
    //   536: astore 11
    //   538: aconst_null
    //   539: astore 12
    //   541: goto -129 -> 412
    //   544: astore 11
    //   546: aload 10
    //   548: astore 12
    //   550: goto -138 -> 412
    //   553: astore 17
    //   555: aconst_null
    //   556: astore 9
    //   558: goto -49 -> 509
    //   561: astore 20
    //   563: goto -54 -> 509
    //   566: astore 8
    //   568: aconst_null
    //   569: astore 9
    //   571: aconst_null
    //   572: astore 10
    //   574: goto -383 -> 191
    //   577: astore 16
    //   579: aload 12
    //   581: astore 10
    //   583: aconst_null
    //   584: astore 9
    //   586: goto -395 -> 191
    //   589: iinc 26 1
    //   592: goto -288 -> 304
    //   595: astore 28
    //   597: goto -8 -> 589
    //
    // Exception table:
    //   from	to	target	type
    //   142	162	185	java/io/IOException
    //   162	169	185	java/io/IOException
    //   174	182	185	java/io/IOException
    //   223	301	185	java/io/IOException
    //   304	323	185	java/io/IOException
    //   323	365	185	java/io/IOException
    //   368	386	185	java/io/IOException
    //   389	407	185	java/io/IOException
    //   425	443	185	java/io/IOException
    //   446	464	185	java/io/IOException
    //   467	485	185	java/io/IOException
    //   85	142	410	finally
    //   142	162	410	finally
    //   162	169	410	finally
    //   174	182	410	finally
    //   223	301	410	finally
    //   304	323	410	finally
    //   323	365	410	finally
    //   368	386	410	finally
    //   389	407	410	finally
    //   425	443	410	finally
    //   446	464	410	finally
    //   467	485	410	finally
    //   509	518	410	finally
    //   74	81	501	java/lang/Exception
    //   215	220	531	java/io/IOException
    //   74	81	536	finally
    //   191	200	544	finally
    //   85	142	553	java/lang/Exception
    //   142	162	561	java/lang/Exception
    //   162	169	561	java/lang/Exception
    //   174	182	561	java/lang/Exception
    //   223	301	561	java/lang/Exception
    //   304	323	561	java/lang/Exception
    //   74	81	566	java/io/IOException
    //   85	142	577	java/io/IOException
    //   323	365	595	java/lang/Exception
    //   368	386	595	java/lang/Exception
    //   389	407	595	java/lang/Exception
    //   425	443	595	java/lang/Exception
    //   446	464	595	java/lang/Exception
    //   467	485	595	java/lang/Exception
  }

  private static boolean b(LinkedList paramLinkedList, e parame)
  {
    if (paramLinkedList == null)
      return false;
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((e)localWeakReference.get()).equals(parame)))
      {
        paramLinkedList.remove(localWeakReference);
        return true;
      }
    }
    return false;
  }

  public static d xj()
  {
    if (dvi == null)
      dvi = new d();
    return dvi;
  }

  private void xk()
  {
    if ((this.dvj == null) && (this.dvk != null) && (this.dvk.size() > 0))
    {
      this.dvj = ((g)this.dvk.removeFirst());
      if (ch.ys())
        this.dvm.c(new f(this));
    }
    else
    {
      return;
    }
    bg.qX().a(655, this);
    bg.qX().d(new m(this.dvj.cGO, this.dvj.cGP));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Addr localAddr;
    if (paramx.getType() == 655)
    {
      localAddr = ((m)paramx).xo();
      if ((localAddr == null) || (localAddr.duW == null) || (localAddr.duW.equals("")))
        this.dvm.c(new f(this));
    }
    else
    {
      return;
    }
    a(localAddr);
  }

  public final boolean a(double paramDouble1, double paramDouble2, e parame)
  {
    return a(paramDouble1, paramDouble2, parame, null);
  }

  public final boolean a(double paramDouble1, double paramDouble2, e parame, Object paramObject)
  {
    if (paramObject != null)
    {
      Iterator localIterator2 = this.dvk.iterator();
      while (localIterator2.hasNext())
      {
        g localg3 = (g)localIterator2.next();
        if ((localg3 != null) && (localg3.dvh != null) && (localg3.dvh.equals(paramObject)))
          this.dvk.remove(localg3);
      }
    }
    g localg1 = new g(this, paramDouble1, paramDouble2, paramObject);
    LinkedList localLinkedList = (LinkedList)this.dvl.get(localg1.toString());
    if (localLinkedList == null)
      localLinkedList = new LinkedList();
    if (!a(localLinkedList, parame))
      localLinkedList.add(new WeakReference(parame));
    this.dvl.put(localg1.toString(), localLinkedList);
    Iterator localIterator1 = this.dvk.iterator();
    while (localIterator1.hasNext())
      if (((g)localIterator1.next()).equals(localg1))
      {
        xk();
        return false;
      }
    if ((this.dvj != null) && (localg1.equals(this.dvj)))
      return false;
    this.dvk.add(localg1);
    String str = TAG;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.dvk.size());
    arrayOfObject[1] = Integer.valueOf(this.dvl.size());
    z.i(str, "push task size %d listeners %d", arrayOfObject);
    while (this.dvk.size() > 30)
    {
      z.i(TAG, "force remove task");
      g localg2 = (g)this.dvk.removeFirst();
      if (localg2 != null)
        this.dvl.remove(localg2.toString());
    }
    xk();
    return true;
  }

  public final boolean a(e parame)
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator1 = this.dvl.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str3 = (String)localIterator1.next();
      LinkedList localLinkedList4 = (LinkedList)this.dvl.get(str3);
      b(localLinkedList4, parame);
      this.dvl.put(str3, localLinkedList4);
      if ((localLinkedList4 == null) || (localLinkedList4.size() == 0))
        localLinkedList2.add(str3);
    }
    Iterator localIterator2 = localLinkedList2.iterator();
    while (localIterator2.hasNext())
    {
      String str2 = (String)localIterator2.next();
      this.dvl.remove(str2);
    }
    Iterator localIterator3 = this.dvk.iterator();
    while (localIterator3.hasNext())
    {
      g localg2 = (g)localIterator3.next();
      LinkedList localLinkedList3 = (LinkedList)this.dvl.get(localg2.toString());
      if ((localLinkedList3 != null) && (localLinkedList3.size() == 0))
      {
        localLinkedList1.add(localg2);
        this.dvl.remove(localg2.toString());
      }
    }
    Iterator localIterator4 = localLinkedList1.iterator();
    while (localIterator4.hasNext())
    {
      g localg1 = (g)localIterator4.next();
      this.dvk.remove(localg1);
    }
    String str1 = TAG;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.dvk.size());
    arrayOfObject[1] = Integer.valueOf(this.dvl.size());
    z.i(str1, "remove taskLists %d listeners size %d", arrayOfObject);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.d
 * JD-Core Version:    0.6.2
 */