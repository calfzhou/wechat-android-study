package com.tencent.mm.ad;

import com.tencent.mm.a.c;
import com.tencent.mm.c.a.dm;
import com.tencent.mm.c.a.hn;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.fr;
import com.tencent.mm.protocal.a.fs;
import com.tencent.mm.protocal.a.ha;
import com.tencent.mm.protocal.a.hb;
import com.tencent.mm.protocal.a.he;
import com.tencent.mm.protocal.a.ud;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class j extends x
  implements com.tencent.mm.network.ab, com.tencent.mm.o.ab
{
  private int cJN;
  private int dAu;
  private com.tencent.mm.o.m dlH;
  private com.tencent.mm.o.a dmI;
  private int offset;

  public j(int paramInt1, int paramInt2)
  {
    this.dAu = paramInt1;
    this.cJN = paramInt2;
    this.offset = 0;
    l locall = s.yO().C(paramInt1, paramInt2);
    if (locall == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "doScene get info null, id:" + paramInt1);
      return;
    }
    locall.setStatus(3);
    locall.db(64);
    s.yO().b(locall);
    if (paramInt2 == 5)
    {
      String str = bg.qW().pt();
      c.deleteFile(str + "brand_i18n.apk");
      return;
    }
    m localm = s.yO();
    c.deleteFile(localm.yL() + localm.E(paramInt1, paramInt2));
  }

  // ERROR //
  private boolean Q(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 116	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   4: ifne +10 -> 14
    //   7: aload_2
    //   8: invokestatic 116	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   11: ifeq +63 -> 74
    //   14: ldc 41
    //   16: new 43	java/lang/StringBuilder
    //   19: dup
    //   20: ldc 118
    //   22: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 120
    //   31: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_2
    //   35: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: invokestatic 62	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: invokestatic 33	com/tencent/mm/ad/s:yO	()Lcom/tencent/mm/ad/m;
    //   47: aload_0
    //   48: getfield 23	com/tencent/mm/ad/j:dAu	I
    //   51: aload_0
    //   52: getfield 25	com/tencent/mm/ad/j:cJN	I
    //   55: invokevirtual 123	com/tencent/mm/ad/m:G	(II)V
    //   58: aload_0
    //   59: getfield 125	com/tencent/mm/ad/j:dlH	Lcom/tencent/mm/o/m;
    //   62: iconst_3
    //   63: iconst_0
    //   64: ldc 127
    //   66: aload_0
    //   67: invokeinterface 133 5 0
    //   72: iconst_0
    //   73: ireturn
    //   74: new 135	java/io/File
    //   77: dup
    //   78: new 43	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   85: aload_1
    //   86: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: aload_2
    //   90: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: invokespecial 136	java/io/File:<init>	(Ljava/lang/String;)V
    //   99: astore_3
    //   100: aload_3
    //   101: invokevirtual 140	java/io/File:exists	()Z
    //   104: ifne +63 -> 167
    //   107: ldc 41
    //   109: new 43	java/lang/StringBuilder
    //   112: dup
    //   113: ldc 142
    //   115: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   118: aload_1
    //   119: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: ldc 120
    //   124: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload_2
    //   128: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 62	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: invokestatic 33	com/tencent/mm/ad/s:yO	()Lcom/tencent/mm/ad/m;
    //   140: aload_0
    //   141: getfield 23	com/tencent/mm/ad/j:dAu	I
    //   144: aload_0
    //   145: getfield 25	com/tencent/mm/ad/j:cJN	I
    //   148: invokevirtual 123	com/tencent/mm/ad/m:G	(II)V
    //   151: aload_0
    //   152: getfield 125	com/tencent/mm/ad/j:dlH	Lcom/tencent/mm/o/m;
    //   155: iconst_3
    //   156: iconst_0
    //   157: ldc 144
    //   159: aload_0
    //   160: invokeinterface 133 5 0
    //   165: iconst_0
    //   166: ireturn
    //   167: new 146	java/util/HashMap
    //   170: dup
    //   171: invokespecial 147	java/util/HashMap:<init>	()V
    //   174: astore 4
    //   176: new 149	java/io/FileInputStream
    //   179: dup
    //   180: aload_3
    //   181: invokespecial 152	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   184: astore 5
    //   186: new 154	java/io/InputStreamReader
    //   189: dup
    //   190: aload 5
    //   192: ldc 156
    //   194: invokespecial 159	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   197: astore 6
    //   199: new 161	java/io/BufferedReader
    //   202: dup
    //   203: aload 6
    //   205: invokespecial 164	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   208: astore 7
    //   210: aload 7
    //   212: invokevirtual 167	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   215: astore 19
    //   217: aload 19
    //   219: ifnull +404 -> 623
    //   222: aload 19
    //   224: invokevirtual 172	java/lang/String:trim	()Ljava/lang/String;
    //   227: ldc 174
    //   229: invokevirtual 178	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   232: astore 20
    //   234: aload 20
    //   236: arraylength
    //   237: iconst_2
    //   238: if_icmplt +23 -> 261
    //   241: aload 20
    //   243: iconst_0
    //   244: aaload
    //   245: invokestatic 116	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   248: ifne +13 -> 261
    //   251: aload 20
    //   253: iconst_1
    //   254: aaload
    //   255: invokestatic 116	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   258: ifeq +128 -> 386
    //   261: ldc 41
    //   263: new 43	java/lang/StringBuilder
    //   266: dup
    //   267: ldc 180
    //   269: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   272: aload 19
    //   274: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   280: invokestatic 62	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   283: goto -73 -> 210
    //   286: astore 13
    //   288: aload 5
    //   290: astore 14
    //   292: invokestatic 33	com/tencent/mm/ad/s:yO	()Lcom/tencent/mm/ad/m;
    //   295: aload_0
    //   296: getfield 23	com/tencent/mm/ad/j:dAu	I
    //   299: aload_0
    //   300: getfield 25	com/tencent/mm/ad/j:cJN	I
    //   303: invokevirtual 123	com/tencent/mm/ad/m:G	(II)V
    //   306: aload_0
    //   307: getfield 125	com/tencent/mm/ad/j:dlH	Lcom/tencent/mm/o/m;
    //   310: iconst_3
    //   311: iconst_0
    //   312: aload 13
    //   314: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   317: aload_0
    //   318: invokeinterface 133 5 0
    //   323: aload 14
    //   325: ifnull +8 -> 333
    //   328: aload 14
    //   330: invokevirtual 188	java/io/InputStream:close	()V
    //   333: aload 4
    //   335: invokeinterface 194 1 0
    //   340: invokeinterface 200 1 0
    //   345: astore 17
    //   347: aload 17
    //   349: invokeinterface 205 1 0
    //   354: ifeq +30 -> 384
    //   357: aload 17
    //   359: invokeinterface 209 1 0
    //   364: checkcast 211	java/io/BufferedWriter
    //   367: astore 18
    //   369: aload 18
    //   371: ifnull -24 -> 347
    //   374: aload 18
    //   376: invokevirtual 212	java/io/BufferedWriter:close	()V
    //   379: goto -32 -> 347
    //   382: astore 16
    //   384: iconst_0
    //   385: ireturn
    //   386: aload 4
    //   388: aload 20
    //   390: iconst_0
    //   391: aaload
    //   392: invokeinterface 216 2 0
    //   397: checkcast 211	java/io/BufferedWriter
    //   400: astore 21
    //   402: aload 21
    //   404: ifnonnull +161 -> 565
    //   407: invokestatic 222	com/tencent/mm/storage/RegionCodeDecoder:aKA	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   410: pop
    //   411: aload 20
    //   413: iconst_0
    //   414: aaload
    //   415: invokestatic 226	com/tencent/mm/storage/RegionCodeDecoder:zR	(Ljava/lang/String;)Ljava/lang/String;
    //   418: astore 23
    //   420: aload 23
    //   422: invokestatic 116	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   425: ifeq +83 -> 508
    //   428: ldc 41
    //   430: ldc 228
    //   432: invokestatic 62	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   435: goto -225 -> 210
    //   438: astore 8
    //   440: aload 8
    //   442: astore 9
    //   444: aload 5
    //   446: ifnull +8 -> 454
    //   449: aload 5
    //   451: invokevirtual 188	java/io/InputStream:close	()V
    //   454: aload 4
    //   456: invokeinterface 194 1 0
    //   461: invokeinterface 200 1 0
    //   466: astore 11
    //   468: aload 11
    //   470: invokeinterface 205 1 0
    //   475: ifeq +30 -> 505
    //   478: aload 11
    //   480: invokeinterface 209 1 0
    //   485: checkcast 211	java/io/BufferedWriter
    //   488: astore 12
    //   490: aload 12
    //   492: ifnull -24 -> 468
    //   495: aload 12
    //   497: invokevirtual 212	java/io/BufferedWriter:close	()V
    //   500: goto -32 -> 468
    //   503: astore 10
    //   505: aload 9
    //   507: athrow
    //   508: new 135	java/io/File
    //   511: dup
    //   512: aload 23
    //   514: invokespecial 136	java/io/File:<init>	(Ljava/lang/String;)V
    //   517: astore 24
    //   519: aload 24
    //   521: invokevirtual 140	java/io/File:exists	()Z
    //   524: ifne +9 -> 533
    //   527: aload 24
    //   529: invokevirtual 231	java/io/File:createNewFile	()Z
    //   532: pop
    //   533: new 211	java/io/BufferedWriter
    //   536: dup
    //   537: new 233	java/io/FileWriter
    //   540: dup
    //   541: aload 24
    //   543: invokespecial 234	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   546: invokespecial 237	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   549: astore 21
    //   551: aload 4
    //   553: aload 20
    //   555: iconst_0
    //   556: aaload
    //   557: aload 21
    //   559: invokeinterface 241 3 0
    //   564: pop
    //   565: new 243	java/lang/StringBuffer
    //   568: dup
    //   569: invokespecial 244	java/lang/StringBuffer:<init>	()V
    //   572: astore 26
    //   574: aload 26
    //   576: aload 20
    //   578: iconst_1
    //   579: aaload
    //   580: invokevirtual 247	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   583: pop
    //   584: aload 26
    //   586: bipush 124
    //   588: invokevirtual 250	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   591: pop
    //   592: aload 26
    //   594: aload 20
    //   596: iconst_2
    //   597: aaload
    //   598: invokevirtual 247	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   601: pop
    //   602: aload 26
    //   604: bipush 10
    //   606: invokevirtual 250	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   609: pop
    //   610: aload 21
    //   612: aload 26
    //   614: invokevirtual 251	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   617: invokevirtual 254	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   620: goto -410 -> 210
    //   623: aload 7
    //   625: invokevirtual 255	java/io/BufferedReader:close	()V
    //   628: aload 6
    //   630: invokevirtual 256	java/io/InputStreamReader:close	()V
    //   633: aload_3
    //   634: invokevirtual 259	java/io/File:delete	()Z
    //   637: pop
    //   638: aload 5
    //   640: invokevirtual 188	java/io/InputStream:close	()V
    //   643: aload 4
    //   645: invokeinterface 194 1 0
    //   650: invokeinterface 200 1 0
    //   655: astore 34
    //   657: aload 34
    //   659: invokeinterface 205 1 0
    //   664: ifeq +30 -> 694
    //   667: aload 34
    //   669: invokeinterface 209 1 0
    //   674: checkcast 211	java/io/BufferedWriter
    //   677: astore 35
    //   679: aload 35
    //   681: ifnull -24 -> 657
    //   684: aload 35
    //   686: invokevirtual 212	java/io/BufferedWriter:close	()V
    //   689: goto -32 -> 657
    //   692: astore 33
    //   694: iconst_1
    //   695: ireturn
    //   696: astore 36
    //   698: aload 36
    //   700: astore 9
    //   702: aconst_null
    //   703: astore 5
    //   705: goto -261 -> 444
    //   708: astore 15
    //   710: aload 15
    //   712: astore 9
    //   714: aload 14
    //   716: astore 5
    //   718: goto -274 -> 444
    //   721: astore 13
    //   723: aconst_null
    //   724: astore 14
    //   726: goto -434 -> 292
    //
    // Exception table:
    //   from	to	target	type
    //   186	210	286	java/lang/Exception
    //   210	217	286	java/lang/Exception
    //   222	261	286	java/lang/Exception
    //   261	283	286	java/lang/Exception
    //   386	402	286	java/lang/Exception
    //   407	435	286	java/lang/Exception
    //   508	533	286	java/lang/Exception
    //   533	565	286	java/lang/Exception
    //   565	620	286	java/lang/Exception
    //   623	638	286	java/lang/Exception
    //   328	333	382	java/io/IOException
    //   333	347	382	java/io/IOException
    //   347	369	382	java/io/IOException
    //   374	379	382	java/io/IOException
    //   186	210	438	finally
    //   210	217	438	finally
    //   222	261	438	finally
    //   261	283	438	finally
    //   386	402	438	finally
    //   407	435	438	finally
    //   508	533	438	finally
    //   533	565	438	finally
    //   565	620	438	finally
    //   623	638	438	finally
    //   449	454	503	java/io/IOException
    //   454	468	503	java/io/IOException
    //   468	490	503	java/io/IOException
    //   495	500	503	java/io/IOException
    //   638	657	692	java/io/IOException
    //   657	679	692	java/io/IOException
    //   684	689	692	java/io/IOException
    //   176	186	696	finally
    //   292	323	708	finally
    //   176	186	721	java/lang/Exception
  }

  private static boolean hb(String paramString)
  {
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang][updateExposeScene]update expose scene,xml:%s", new Object[] { paramString });
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang][updateExposeScene]update expose scene start");
    DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
    while (true)
    {
      ha localha;
      int j;
      NamedNodeMap localNamedNodeMap;
      ArrayList localArrayList;
      int m;
      try
      {
        Document localDocument = localDocumentBuilderFactory.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes("utf-8"))));
        localDocument.normalize();
        NodeList localNodeList1 = localDocument.getDocumentElement().getElementsByTagName("scene");
        if (localNodeList1 == null)
          break label558;
        localha = new ha();
        int i = localNodeList1.getLength();
        j = 0;
        if (j >= i)
          break label538;
        Node localNode1 = localNodeList1.item(j);
        localNamedNodeMap = localNode1.getAttributes();
        localArrayList = new ArrayList();
        NodeList localNodeList2 = localNode1.getChildNodes();
        if (localNodeList2 == null)
          break label372;
        int k = localNodeList2.getLength();
        m = 0;
        if (m >= k)
          break label372;
        Node localNode2 = localNodeList2.item(m);
        hb localhb = new hb();
        if ((localNode2 == null) || (localNode2.getNodeName() == null) || (!localNode2.getNodeName().equals("reason")))
          break label568;
        Node localNode3 = localNode2.getAttributes().getNamedItem("id");
        if (localNode3 != null);
        try
        {
          localhb.id = Integer.parseInt(localNode3.getNodeValue());
          if (!ch.jb(localNode2.getTextContent()))
          {
            str1 = localNode2.getTextContent().trim();
            localhb.value = str1;
            localArrayList.add(localhb);
          }
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang][updateExposeScene]reason id parse exception." + localNumberFormatException1.getMessage());
          continue;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang]update expose scene exception:%s", arrayOfObject);
        return false;
      }
      String str1 = "";
      continue;
      label372: Node localNode4 = localNamedNodeMap.getNamedItem("id");
      if (localNode4 != null)
      {
        String[] arrayOfString = localNode4.getNodeValue().split(",");
        int n = arrayOfString.length;
        for (int i1 = 0; ; i1++)
        {
          if (i1 >= n)
            break label580;
          String str2 = arrayOfString[i1];
          if (!ch.jb(str2))
          {
            he localhe = new he();
            try
            {
              localhe.id = Integer.parseInt(str2);
              Node localNode5 = localNamedNodeMap.getNamedItem("value");
              if (localNode5 != null)
                localhe.value = localNode5.getNodeValue();
              localhe.hWR.addAll(localArrayList);
              localha.dxT.add(localhe);
            }
            catch (NumberFormatException localNumberFormatException2)
            {
              while (true)
                com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang][updateExposeScene]scene id parse exception." + localNumberFormatException2.getMessage());
            }
            label538: bg.qW().oQ().set(327760, ch.cH(localha.toByteArray()));
            label558: com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang]update expose scene end");
            return true;
            label568: m++;
            break;
          }
        }
      }
      label580: j++;
    }
  }

  protected final int a(aj paramaj)
  {
    fr localfr = (fr)((com.tencent.mm.o.a)paramaj).sO();
    l locall = s.yO().C(this.dAu, this.cJN);
    if (locall == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "securityVerificationChecked get Theme failed id:" + this.dAu);
      return com.tencent.mm.o.aa.doN;
    }
    if ((localfr.hVw.hWU != this.dAu) || (localfr.hQd != this.offset) || (localfr.hQd >= locall.getSize()) || (localfr.hVx != 65536) || (locall.getSize() <= 0) || (locall.getStatus() != 3))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "securityVerificationChecked Theme failed id:" + this.dAu);
      return com.tencent.mm.o.aa.doN;
    }
    return com.tencent.mm.o.aa.doM;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.dAu);
    arrayOfObject[1] = Integer.valueOf(this.cJN);
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "dkregcode doScene pkgId:%d packageType:%d", arrayOfObject);
    l locall = s.yO().C(this.dAu, this.cJN);
    if (locall == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "doScene get Theme failed id:" + this.dAu + " type:" + this.cJN);
      return -1;
    }
    if (locall.getStatus() != 3)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "doScene get Theme stat failed id:" + this.dAu + " stat:" + locall.getStatus());
      return -1;
    }
    if (locall.getSize() <= 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "doScene Theme size err id:" + this.dAu + " size:" + locall.getSize());
      return -1;
    }
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new fr());
    localb.b(new fs());
    localb.fi("/cgi-bin/micromsg-bin/downloadpackage");
    localb.de(160);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    fr localfr = (fr)this.dmI.sO();
    ud localud = new ud();
    localud.hWU = locall.getId();
    localud.hWt = locall.getVersion();
    localfr.hVw = localud;
    localfr.hQd = this.offset;
    localfr.hVx = 65536;
    localfr.ewb = this.cJN;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd id:" + this.dAu + " + id:" + paramInt1 + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
      s.yO().G(this.dAu, this.cJN);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    fs localfs = (fs)((com.tencent.mm.o.a)paramaj).sP();
    if (localfs.ewb != this.cJN)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "packageType is not consistent");
      s.yO().G(this.dAu, this.cJN);
      this.dlH.a(3, -1, "", this);
      return;
    }
    byte[] arrayOfByte = ai.a(localfs.hVy);
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd get pkgBuf failed id:" + this.dAu);
      s.yO().G(this.dAu, this.cJN);
      this.dlH.a(3, -1, paramString, this);
      return;
    }
    l locall = s.yO().C(this.dAu, this.cJN);
    if (locall == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd info is null, pkgId = " + this.dAu);
      s.yO().G(this.dAu, this.cJN);
      this.dlH.a(3, -1, paramString, this);
      return;
    }
    if (locall.getSize() != localfs.hVz)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd totalSize is incorrect");
      s.yO().G(this.dAu, this.cJN);
      k localk = new k(this.cJN);
      bg.qX().d(localk);
      this.dlH.a(3, -1, paramString, this);
      return;
    }
    String str1;
    if (this.cJN == 5)
      str1 = bg.qW().pt();
    for (String str2 = "brand_i18n.apk"; ; str2 = s.yO().E(this.dAu, this.cJN))
    {
      com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "packagePath " + str1);
      com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "packageName " + str2);
      int i = c.c(str1, str2, arrayOfByte);
      if (i == 0)
        break;
      s.yO().G(this.dAu, this.cJN);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd write file fail, ret = " + i);
      this.dlH.a(3, -1, paramString, this);
      return;
      str1 = s.yO().yL();
    }
    this.offset += arrayOfByte.length;
    boolean bool1;
    label739: String str3;
    if (this.offset >= locall.getSize())
    {
      int j = this.cJN;
      bool1 = false;
      if (j == 1)
      {
        String str4 = s.yO().F(this.dAu, this.cJN);
        int n = ch.bo(str1 + str2, str4);
        if (n < 0)
        {
          com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "unzip fail, ret = " + n + ", zipFilePath = " + str1 + str2 + ", unzipPath = " + str4);
          s.yO().G(this.dAu, this.cJN);
          this.dlH.a(3, 0, "unzip fail", this);
          bool1 = false;
        }
      }
      else
      {
        if (this.cJN == 8)
          bool1 = Q(str1, str2);
        if (this.cJN == 7)
          bool1 = true;
        if (this.cJN == 9)
          bool1 = true;
        if (this.cJN == 5)
        {
          bool1 = true;
          com.tencent.mm.q.aa.vc();
        }
        if (this.cJN == 12)
        {
          hn localhn = new hn();
          localhn.cMe.cMg = (str1 + str2);
          com.tencent.mm.sdk.c.a.aGB().g(localhn);
          bool1 = true;
        }
        if (this.cJN != 18)
          break label1209;
        str3 = s.yO().F(this.dAu, this.cJN);
        int m = ch.bo(str1 + str2, str3);
        if (m >= 0)
          break label1097;
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "unzip fail, ret = " + m + ", zipFilePath = " + str1 + str2 + ", unzipPath = " + str3);
        s.yO().G(this.dAu, this.cJN);
        this.dlH.a(3, 0, "unzip fail", this);
      }
    }
    label1209: for (int k = 0; ; k = bool1)
    {
      while (true)
      {
        if (this.cJN == 19);
        try
        {
          boolean bool2 = hb(new String(arrayOfByte, "utf-8"));
          k = bool2;
          if (this.cJN == 20)
            k = 1;
          if (this.cJN == 21)
            k = 1;
          if (k == 0)
            break;
          locall.setStatus(2);
          locall.db(64);
          s.yO().b(locall);
          this.dlH.a(0, 0, "", this);
          return;
          bool1 = true;
          break label739;
          label1097: com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "Unzip Path %s", new Object[] { str3 });
          dm localdm = new dm();
          localdm.cJH.path = str3;
          com.tencent.mm.sdk.c.a.aGB().g(localdm);
          k = 1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          while (true)
            com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", localUnsupportedEncodingException.getMessage());
        }
      }
      if (a(tp(), this.dlH) >= 0)
        break;
      s.yO().G(this.dAu, this.cJN);
      this.dlH.a(3, -1, paramString, this);
      return;
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
    s.yO().G(this.dAu, this.cJN);
  }

  public final int getType()
  {
    return 160;
  }

  protected final int sB()
  {
    return 50;
  }

  public final int tu()
  {
    return this.cJN;
  }

  public final int yI()
  {
    return this.dAu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.j
 * JD-Core Version:    0.6.2
 */