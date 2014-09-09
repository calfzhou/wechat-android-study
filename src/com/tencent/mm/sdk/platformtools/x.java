package com.tencent.mm.sdk.platformtools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class x
{
  private static boolean iEj = false;

  public static Map AL(String paramString)
  {
    Object localObject;
    if ((paramString == null) || (paramString.length() <= 0))
      localObject = null;
    do
    {
      return localObject;
      localObject = new HashMap();
      for (String str1 : paramString.split("\n"))
        if ((str1 != null) && (str1.length() > 0))
        {
          String[] arrayOfString2 = str1.trim().split("=", 2);
          if ((arrayOfString2 != null) && (arrayOfString2.length >= 2))
          {
            String str2 = arrayOfString2[0];
            String str3 = arrayOfString2[1];
            if ((str2 != null) && (str2.length() > 0) && (str2.matches("^[a-zA-Z0-9_.]*")))
              ((Map)localObject).put(str2, str3);
          }
        }
    }
    while (!iEj);
    t((Map)localObject);
    return localObject;
  }

  private static void a(Map paramMap, String paramString1, String paramString2, Node paramNode, int paramInt)
  {
    int i = 0;
    if (paramNode.getNodeName().equals("#text"))
    {
      paramMap.put(paramString1, paramNode.getNodeValue());
      paramMap.put(paramString2, paramNode.getNodeValue());
    }
    while (true)
    {
      return;
      if (paramNode.getNodeName().equals("#cdata-section"))
      {
        paramMap.put(paramString1, paramNode.getNodeValue());
        paramMap.put(paramString2, paramNode.getNodeValue());
        return;
      }
      String str1 = paramString1 + "." + paramNode.getNodeName();
      String str2 = paramString2 + "." + paramNode.getNodeName();
      String str6;
      String str3;
      if (paramInt > 0)
      {
        String str5 = str1 + paramInt;
        paramMap.put(str5, paramNode.getNodeValue());
        str6 = str2 + "#" + paramInt;
        paramMap.put(str6, paramNode.getNodeValue());
        str3 = str5;
      }
      for (String str4 = str6; ; str4 = str2)
      {
        NamedNodeMap localNamedNodeMap = paramNode.getAttributes();
        if (localNamedNodeMap == null)
          break;
        for (int k = 0; k < localNamedNodeMap.getLength(); k++)
        {
          Node localNode2 = localNamedNodeMap.item(k);
          paramMap.put(str3 + ".$" + localNode2.getNodeName(), localNode2.getNodeValue());
          paramMap.put(str4 + ".$" + localNode2.getNodeName(), localNode2.getNodeValue());
        }
        paramMap.put(str1, paramNode.getNodeValue());
        paramMap.put(str2, paramNode.getNodeValue());
        str3 = str1;
      }
      HashMap localHashMap = new HashMap();
      NodeList localNodeList = paramNode.getChildNodes();
      while (i < localNodeList.getLength())
      {
        Node localNode1 = localNodeList.item(i);
        int j = ch.a((Integer)localHashMap.get(localNode1.getNodeName()));
        a(paramMap, str3, str4, localNode1, j);
        localHashMap.put(localNode1.getNodeName(), Integer.valueOf(j + 1));
        i++;
      }
    }
  }

  // ERROR //
  public static Map bB(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +18 -> 19
    //   4: iconst_m1
    //   5: istore_2
    //   6: iload_2
    //   7: ifge +22 -> 29
    //   10: ldc 144
    //   12: ldc 146
    //   14: invokestatic 152	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aconst_null
    //   18: areturn
    //   19: aload_0
    //   20: bipush 60
    //   22: invokevirtual 156	java/lang/String:indexOf	(I)I
    //   25: istore_2
    //   26: goto -20 -> 6
    //   29: iload_2
    //   30: ifle +32 -> 62
    //   33: iconst_1
    //   34: anewarray 4	java/lang/Object
    //   37: astore 16
    //   39: aload 16
    //   41: iconst_0
    //   42: iload_2
    //   43: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: ldc 144
    //   49: ldc 158
    //   51: aload 16
    //   53: invokestatic 162	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   56: aload_0
    //   57: iload_2
    //   58: invokevirtual 166	java/lang/String:substring	(I)Ljava/lang/String;
    //   61: astore_0
    //   62: aload_0
    //   63: ifnull -46 -> 17
    //   66: aload_0
    //   67: invokevirtual 18	java/lang/String:length	()I
    //   70: ifle -53 -> 17
    //   73: new 20	java/util/HashMap
    //   76: dup
    //   77: invokespecial 23	java/util/HashMap:<init>	()V
    //   80: astore_3
    //   81: invokestatic 172	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   84: astore 4
    //   86: aload 4
    //   88: invokevirtual 176	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   91: astore 6
    //   93: aload 6
    //   95: ifnonnull +12 -> 107
    //   98: ldc 144
    //   100: ldc 178
    //   102: invokestatic 152	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: aconst_null
    //   106: areturn
    //   107: aload 6
    //   109: new 180	org/xml/sax/InputSource
    //   112: dup
    //   113: new 182	java/io/ByteArrayInputStream
    //   116: dup
    //   117: aload_0
    //   118: invokevirtual 186	java/lang/String:getBytes	()[B
    //   121: invokespecial 189	java/io/ByteArrayInputStream:<init>	([B)V
    //   124: invokespecial 192	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   127: invokevirtual 198	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   130: astore 14
    //   132: aload 14
    //   134: astore 8
    //   136: aload 8
    //   138: invokeinterface 203 1 0
    //   143: aload 8
    //   145: ifnonnull +12 -> 157
    //   148: ldc 144
    //   150: ldc 205
    //   152: invokestatic 152	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: aconst_null
    //   156: areturn
    //   157: aload 8
    //   159: invokeinterface 209 1 0
    //   164: astore 9
    //   166: aload 9
    //   168: ifnonnull +12 -> 180
    //   171: ldc 144
    //   173: ldc 211
    //   175: invokestatic 152	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: aconst_null
    //   179: areturn
    //   180: aload_1
    //   181: aload 9
    //   183: invokeinterface 214 1 0
    //   188: invokevirtual 67	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   191: ifeq +26 -> 217
    //   194: aload_3
    //   195: ldc 216
    //   197: ldc 216
    //   199: aload 9
    //   201: iconst_0
    //   202: invokestatic 125	com/tencent/mm/sdk/platformtools/x:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/Node;I)V
    //   205: getstatic 10	com/tencent/mm/sdk/platformtools/x:iEj	Z
    //   208: ifeq +7 -> 215
    //   211: aload_3
    //   212: invokestatic 54	com/tencent/mm/sdk/platformtools/x:t	(Ljava/util/Map;)V
    //   215: aload_3
    //   216: areturn
    //   217: aload 9
    //   219: aload_1
    //   220: invokeinterface 220 2 0
    //   225: astore 10
    //   227: aload 10
    //   229: invokeinterface 111 1 0
    //   234: ifgt +12 -> 246
    //   237: ldc 144
    //   239: ldc 222
    //   241: invokestatic 152	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   244: aconst_null
    //   245: areturn
    //   246: aload 10
    //   248: invokeinterface 111 1 0
    //   253: iconst_1
    //   254: if_icmple +10 -> 264
    //   257: ldc 144
    //   259: ldc 224
    //   261: invokestatic 226	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload_3
    //   265: ldc 216
    //   267: ldc 216
    //   269: aload 10
    //   271: iconst_0
    //   272: invokeinterface 112 2 0
    //   277: iconst_0
    //   278: invokestatic 125	com/tencent/mm/sdk/platformtools/x:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/Node;I)V
    //   281: goto -76 -> 205
    //   284: astore 5
    //   286: aconst_null
    //   287: areturn
    //   288: astore 13
    //   290: aconst_null
    //   291: areturn
    //   292: astore 12
    //   294: aconst_null
    //   295: areturn
    //   296: astore 11
    //   298: aconst_null
    //   299: areturn
    //   300: astore 7
    //   302: aconst_null
    //   303: astore 8
    //   305: goto -162 -> 143
    //   308: astore 15
    //   310: goto -167 -> 143
    //
    // Exception table:
    //   from	to	target	type
    //   86	93	284	javax/xml/parsers/ParserConfigurationException
    //   107	132	288	java/lang/Exception
    //   136	143	288	java/lang/Exception
    //   107	132	292	java/io/IOException
    //   136	143	292	java/io/IOException
    //   107	132	296	org/xml/sax/SAXException
    //   136	143	296	org/xml/sax/SAXException
    //   107	132	300	org/w3c/dom/DOMException
    //   136	143	308	org/w3c/dom/DOMException
  }

  private static void t(Map paramMap)
  {
    if (paramMap.size() <= 0)
      z.v("!32@/B4Tb64lLpL0kVyHeA8M6nJRdTdS8jEg", "empty values");
    while (true)
    {
      return;
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        z.v("!32@/B4Tb64lLpL0kVyHeA8M6nJRdTdS8jEg", "key=" + (String)localEntry.getKey() + " value=" + (String)localEntry.getValue());
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.x
 * JD-Core Version:    0.6.2
 */