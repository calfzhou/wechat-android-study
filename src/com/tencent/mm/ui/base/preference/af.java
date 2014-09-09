package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public final class af
{
  private static final Class[] jhA = { Context.class, AttributeSet.class };
  private static HashMap jhy = new HashMap();
  private final Object[] jhz = new Object[2];
  private final Context mContext;

  public af(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private Preference a(String paramString, AttributeSet paramAttributeSet)
  {
    try
    {
      if (-1 == paramString.indexOf('.'))
        return a(paramString, "com.tencent.mm.ui.base.preference.", paramAttributeSet);
      Preference localPreference = a(paramString, null, paramAttributeSet);
      return localPreference;
    }
    catch (InflateException localInflateException3)
    {
      throw localInflateException3;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      InflateException localInflateException2 = new InflateException(paramAttributeSet.getPositionDescription() + ": Error inflating class " + paramString);
      localInflateException2.initCause(localClassNotFoundException);
      throw localInflateException2;
    }
    catch (Exception localException)
    {
      InflateException localInflateException1 = new InflateException(paramAttributeSet.getPositionDescription() + ": Error inflating class " + paramString);
      localInflateException1.initCause(localException);
      throw localInflateException1;
    }
  }

  // ERROR //
  private Preference a(String paramString1, String paramString2, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: getstatic 21	com/tencent/mm/ui/base/preference/af:jhy	Ljava/util/HashMap;
    //   3: aload_1
    //   4: invokevirtual 83	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   7: checkcast 85	java/lang/reflect/Constructor
    //   10: astore 4
    //   12: aload 4
    //   14: ifnonnull +268 -> 282
    //   17: aload_0
    //   18: getfield 35	com/tencent/mm/ui/base/preference/af:mContext	Landroid/content/Context;
    //   21: invokevirtual 89	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   24: astore 18
    //   26: aload_2
    //   27: ifnull +78 -> 105
    //   30: new 56	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   37: aload_2
    //   38: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_1
    //   42: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: astore 19
    //   50: aload 18
    //   52: aload 19
    //   54: invokevirtual 95	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   57: getstatic 29	com/tencent/mm/ui/base/preference/af:jhA	[Ljava/lang/Class;
    //   60: invokevirtual 99	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   63: astore 20
    //   65: aload 20
    //   67: astore 5
    //   69: getstatic 21	com/tencent/mm/ui/base/preference/af:jhy	Ljava/util/HashMap;
    //   72: aload_1
    //   73: aload 5
    //   75: invokevirtual 103	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   78: pop
    //   79: aload_0
    //   80: getfield 33	com/tencent/mm/ui/base/preference/af:jhz	[Ljava/lang/Object;
    //   83: astore 16
    //   85: aload 16
    //   87: iconst_1
    //   88: aload_3
    //   89: aastore
    //   90: aload 5
    //   92: aload 16
    //   94: invokevirtual 107	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   97: checkcast 109	com/tencent/mm/ui/base/preference/Preference
    //   100: astore 17
    //   102: aload 17
    //   104: areturn
    //   105: aload_1
    //   106: astore 19
    //   108: goto -58 -> 50
    //   111: astore 12
    //   113: new 56	java/lang/StringBuilder
    //   116: dup
    //   117: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   120: aload_3
    //   121: invokeinterface 61 1 0
    //   126: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: ldc 67
    //   131: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: astore 13
    //   136: aload_2
    //   137: ifnull +22 -> 159
    //   140: new 56	java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   147: aload_2
    //   148: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload_1
    //   152: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: astore_1
    //   159: new 39	android/view/InflateException
    //   162: dup
    //   163: aload 13
    //   165: aload_1
    //   166: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: invokespecial 73	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   175: astore 14
    //   177: aload 14
    //   179: aload 12
    //   181: invokevirtual 77	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   184: pop
    //   185: aload 14
    //   187: athrow
    //   188: astore 11
    //   190: aload 11
    //   192: athrow
    //   193: astore 7
    //   195: aload_3
    //   196: ifnull +33 -> 229
    //   199: aload_3
    //   200: invokeinterface 61 1 0
    //   205: astore 8
    //   207: new 39	android/view/InflateException
    //   210: dup
    //   211: aload 8
    //   213: invokespecial 73	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   216: astore 9
    //   218: aload 9
    //   220: aload 7
    //   222: invokevirtual 77	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   225: pop
    //   226: aload 9
    //   228: athrow
    //   229: new 56	java/lang/StringBuilder
    //   232: dup
    //   233: ldc 111
    //   235: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   238: aload 4
    //   240: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   243: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   246: ifnull +16 -> 262
    //   249: aload 4
    //   251: invokevirtual 119	java/lang/Object:getClass	()Ljava/lang/Class;
    //   254: invokevirtual 122	java/lang/Class:getName	()Ljava/lang/String;
    //   257: astore 8
    //   259: goto -52 -> 207
    //   262: ldc 124
    //   264: astore 8
    //   266: goto -59 -> 207
    //   269: astore 6
    //   271: aload 5
    //   273: astore 4
    //   275: aload 6
    //   277: astore 7
    //   279: goto -84 -> 195
    //   282: aload 4
    //   284: astore 5
    //   286: goto -207 -> 79
    //
    // Exception table:
    //   from	to	target	type
    //   17	26	111	java/lang/NoSuchMethodException
    //   30	50	111	java/lang/NoSuchMethodException
    //   50	65	111	java/lang/NoSuchMethodException
    //   69	79	111	java/lang/NoSuchMethodException
    //   79	102	111	java/lang/NoSuchMethodException
    //   17	26	188	java/lang/ClassNotFoundException
    //   30	50	188	java/lang/ClassNotFoundException
    //   50	65	188	java/lang/ClassNotFoundException
    //   69	79	188	java/lang/ClassNotFoundException
    //   79	102	188	java/lang/ClassNotFoundException
    //   17	26	193	java/lang/Exception
    //   30	50	193	java/lang/Exception
    //   50	65	193	java/lang/Exception
    //   69	79	269	java/lang/Exception
    //   79	102	269	java/lang/Exception
  }

  private void a(XmlPullParser paramXmlPullParser, o paramo, AttributeSet paramAttributeSet)
  {
    int i = paramXmlPullParser.getDepth();
    int j = paramXmlPullParser.next();
    while (((j != 3) || (paramXmlPullParser.getDepth() > i)) && (j != 1))
      if (j != 2)
      {
        j = paramXmlPullParser.next();
      }
      else
      {
        paramo.a(a(paramXmlPullParser.getName(), paramAttributeSet), -1);
        j = paramXmlPullParser.next();
      }
  }

  // ERROR //
  public final void a(int paramInt, o paramo)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/tencent/mm/ui/base/preference/af:mContext	Landroid/content/Context;
    //   4: invokevirtual 151	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   7: iload_1
    //   8: invokevirtual 157	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   11: astore_3
    //   12: aload_0
    //   13: getfield 33	com/tencent/mm/ui/base/preference/af:jhz	[Ljava/lang/Object;
    //   16: astore 5
    //   18: aload 5
    //   20: monitorenter
    //   21: aload_3
    //   22: invokestatic 163	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   25: astore 7
    //   27: aload_0
    //   28: getfield 33	com/tencent/mm/ui/base/preference/af:jhz	[Ljava/lang/Object;
    //   31: iconst_0
    //   32: aload_0
    //   33: getfield 35	com/tencent/mm/ui/base/preference/af:mContext	Landroid/content/Context;
    //   36: aastore
    //   37: aload_3
    //   38: invokeinterface 134 1 0
    //   43: istore 15
    //   45: iload 15
    //   47: iconst_2
    //   48: if_icmpeq +20 -> 68
    //   51: iload 15
    //   53: iconst_1
    //   54: if_icmpeq +14 -> 68
    //   57: aload_3
    //   58: invokeinterface 134 1 0
    //   63: istore 15
    //   65: goto -20 -> 45
    //   68: iload 15
    //   70: iconst_2
    //   71: if_icmpeq +59 -> 130
    //   74: new 39	android/view/InflateException
    //   77: dup
    //   78: new 56	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   85: aload_3
    //   86: invokeinterface 164 1 0
    //   91: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc 166
    //   96: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokespecial 73	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   105: athrow
    //   106: astore 14
    //   108: aload 14
    //   110: athrow
    //   111: astore 6
    //   113: aload 5
    //   115: monitorexit
    //   116: aload 6
    //   118: athrow
    //   119: astore 4
    //   121: aload_3
    //   122: invokeinterface 171 1 0
    //   127: aload 4
    //   129: athrow
    //   130: aload_0
    //   131: aload_3
    //   132: invokeinterface 135 1 0
    //   137: aload 7
    //   139: invokespecial 137	com/tencent/mm/ui/base/preference/af:a	(Ljava/lang/String;Landroid/util/AttributeSet;)Lcom/tencent/mm/ui/base/preference/Preference;
    //   142: pop
    //   143: aload_0
    //   144: aload_3
    //   145: aload_2
    //   146: aload 7
    //   148: invokespecial 173	com/tencent/mm/ui/base/preference/af:a	(Lorg/xmlpull/v1/XmlPullParser;Lcom/tencent/mm/ui/base/preference/o;Landroid/util/AttributeSet;)V
    //   151: aload 5
    //   153: monitorexit
    //   154: aload_3
    //   155: invokeinterface 171 1 0
    //   160: return
    //   161: astore 11
    //   163: new 39	android/view/InflateException
    //   166: dup
    //   167: aload 11
    //   169: invokevirtual 176	org/xmlpull/v1/XmlPullParserException:getMessage	()Ljava/lang/String;
    //   172: invokespecial 73	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   175: astore 12
    //   177: aload 12
    //   179: aload 11
    //   181: invokevirtual 77	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   184: pop
    //   185: aload 12
    //   187: athrow
    //   188: astore 8
    //   190: new 39	android/view/InflateException
    //   193: dup
    //   194: new 56	java/lang/StringBuilder
    //   197: dup
    //   198: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   201: aload_3
    //   202: invokeinterface 164 1 0
    //   207: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: ldc 178
    //   212: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: aload 8
    //   217: invokevirtual 179	java/io/IOException:getMessage	()Ljava/lang/String;
    //   220: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokespecial 73	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   229: astore 9
    //   231: aload 9
    //   233: aload 8
    //   235: invokevirtual 77	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   238: pop
    //   239: aload 9
    //   241: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   37	45	106	android/view/InflateException
    //   57	65	106	android/view/InflateException
    //   74	106	106	android/view/InflateException
    //   130	151	106	android/view/InflateException
    //   21	37	111	finally
    //   37	45	111	finally
    //   57	65	111	finally
    //   74	106	111	finally
    //   108	111	111	finally
    //   130	151	111	finally
    //   151	154	111	finally
    //   163	188	111	finally
    //   190	242	111	finally
    //   12	21	119	finally
    //   113	119	119	finally
    //   37	45	161	org/xmlpull/v1/XmlPullParserException
    //   57	65	161	org/xmlpull/v1/XmlPullParserException
    //   74	106	161	org/xmlpull/v1/XmlPullParserException
    //   130	151	161	org/xmlpull/v1/XmlPullParserException
    //   37	45	188	java/io/IOException
    //   57	65	188	java/io/IOException
    //   74	106	188	java/io/IOException
    //   130	151	188	java/io/IOException
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.af
 * JD-Core Version:    0.6.2
 */