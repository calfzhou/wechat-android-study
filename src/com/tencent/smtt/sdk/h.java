package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.libwebp;
import java.io.File;

final class h
{
  private static h kdT = null;
  private static int kea = 0;
  private static String keb = null;
  private static int kec = 0;
  private static boolean ked = false;
  private WebViewWizardBase kdQ = null;
  private File kdR = null;
  private boolean kdS = false;
  private File kdU = null;
  private File kdV = null;
  private File kdW = null;
  private HandlerThread kdX = null;
  private Handler kdY = null;
  private Handler kdZ = null;

  private static Context aG(Context paramContext, String paramString)
  {
    try
    {
      Context localContext = paramContext.createPackageContext(paramString, 2);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      return null;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  // ERROR //
  private boolean bdv()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/tencent/smtt/sdk/h:kdR	Ljava/io/File;
    //   4: invokevirtual 99	java/io/File:listFiles	()[Ljava/io/File;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnull +9 -> 18
    //   12: aload_1
    //   13: arraylength
    //   14: iconst_1
    //   15: if_icmpgt +5 -> 20
    //   18: iconst_1
    //   19: ireturn
    //   20: new 95	java/io/File
    //   23: dup
    //   24: aload_0
    //   25: getfield 45	com/tencent/smtt/sdk/h:kdR	Ljava/io/File;
    //   28: ldc 101
    //   30: invokespecial 104	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   33: astore_2
    //   34: aload_2
    //   35: invokevirtual 107	java/io/File:exists	()Z
    //   38: ifeq -20 -> 18
    //   41: new 109	java/io/FileInputStream
    //   44: dup
    //   45: aload_2
    //   46: invokespecial 112	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   49: astore_3
    //   50: new 114	java/util/Properties
    //   53: dup
    //   54: invokespecial 115	java/util/Properties:<init>	()V
    //   57: astore 4
    //   59: aload 4
    //   61: aload_3
    //   62: invokevirtual 119	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   65: aload 4
    //   67: ldc 121
    //   69: invokevirtual 125	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   72: astore 9
    //   74: aload 9
    //   76: ifnull +18 -> 94
    //   79: aload 9
    //   81: invokestatic 131	com/tencent/smtt/sdk/e:bds	()Ljava/lang/String;
    //   84: invokevirtual 137	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   87: istore 10
    //   89: iload 10
    //   91: ifne +13 -> 104
    //   94: aload_3
    //   95: invokevirtual 140	java/io/FileInputStream:close	()V
    //   98: iconst_1
    //   99: ireturn
    //   100: astore 12
    //   102: iconst_1
    //   103: ireturn
    //   104: aload_3
    //   105: invokevirtual 140	java/io/FileInputStream:close	()V
    //   108: iconst_0
    //   109: ireturn
    //   110: astore 13
    //   112: aconst_null
    //   113: astore_3
    //   114: aload_3
    //   115: ifnull -97 -> 18
    //   118: aload_3
    //   119: invokevirtual 140	java/io/FileInputStream:close	()V
    //   122: iconst_1
    //   123: ireturn
    //   124: astore 6
    //   126: iconst_1
    //   127: ireturn
    //   128: astore 7
    //   130: aconst_null
    //   131: astore_3
    //   132: aload_3
    //   133: ifnull +7 -> 140
    //   136: aload_3
    //   137: invokevirtual 140	java/io/FileInputStream:close	()V
    //   140: aload 7
    //   142: athrow
    //   143: astore 11
    //   145: goto -37 -> 108
    //   148: astore 8
    //   150: goto -10 -> 140
    //   153: astore 7
    //   155: goto -23 -> 132
    //   158: astore 5
    //   160: goto -46 -> 114
    //
    // Exception table:
    //   from	to	target	type
    //   94	98	100	java/io/IOException
    //   41	50	110	java/lang/Exception
    //   118	122	124	java/io/IOException
    //   41	50	128	finally
    //   104	108	143	java/io/IOException
    //   136	140	148	java/io/IOException
    //   50	74	153	finally
    //   79	89	153	finally
    //   50	74	158	java/lang/Exception
    //   79	89	158	java/lang/Exception
  }

  // ERROR //
  private static void cR(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 32	com/tencent/smtt/sdk/h:kea	I
    //   3: ifeq +4 -> 7
    //   6: return
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_0
    //   10: ldc 145
    //   12: invokestatic 87	com/tencent/smtt/sdk/h:aG	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;
    //   15: astore 8
    //   17: aload 8
    //   19: ifnull -13 -> 6
    //   22: new 95	java/io/File
    //   25: dup
    //   26: new 95	java/io/File
    //   29: dup
    //   30: aload 8
    //   32: ldc 147
    //   34: iconst_0
    //   35: invokevirtual 151	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   38: ldc 153
    //   40: invokespecial 104	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   43: ldc 155
    //   45: invokespecial 104	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   48: astore 9
    //   50: new 114	java/util/Properties
    //   53: dup
    //   54: invokespecial 115	java/util/Properties:<init>	()V
    //   57: astore 10
    //   59: new 109	java/io/FileInputStream
    //   62: dup
    //   63: aload 9
    //   65: invokespecial 112	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   68: astore 5
    //   70: aload 10
    //   72: aload 5
    //   74: invokevirtual 119	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   77: aload 5
    //   79: invokevirtual 140	java/io/FileInputStream:close	()V
    //   82: aload 10
    //   84: ldc 157
    //   86: invokevirtual 125	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   89: astore 12
    //   91: aload 12
    //   93: putstatic 34	com/tencent/smtt/sdk/h:keb	Ljava/lang/String;
    //   96: aload 12
    //   98: ifnonnull +12 -> 110
    //   101: aload 5
    //   103: invokevirtual 140	java/io/FileInputStream:close	()V
    //   106: return
    //   107: astore 14
    //   109: return
    //   110: getstatic 34	com/tencent/smtt/sdk/h:keb	Ljava/lang/String;
    //   113: invokestatic 163	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   116: putstatic 32	com/tencent/smtt/sdk/h:kea	I
    //   119: aload 5
    //   121: invokevirtual 140	java/io/FileInputStream:close	()V
    //   124: getstatic 32	com/tencent/smtt/sdk/h:kea	I
    //   127: ifne -121 -> 6
    //   130: aload_0
    //   131: invokestatic 166	com/tencent/smtt/sdk/e:cQ	(Landroid/content/Context;)V
    //   134: return
    //   135: astore 4
    //   137: aconst_null
    //   138: astore 5
    //   140: iconst_0
    //   141: putstatic 32	com/tencent/smtt/sdk/h:kea	I
    //   144: aload 5
    //   146: ifnull -22 -> 124
    //   149: aload 5
    //   151: invokevirtual 140	java/io/FileInputStream:close	()V
    //   154: goto -30 -> 124
    //   157: astore 7
    //   159: goto -35 -> 124
    //   162: astore_2
    //   163: aload_1
    //   164: ifnull +7 -> 171
    //   167: aload_1
    //   168: invokevirtual 140	java/io/FileInputStream:close	()V
    //   171: aload_2
    //   172: athrow
    //   173: astore 13
    //   175: goto -51 -> 124
    //   178: astore_3
    //   179: goto -8 -> 171
    //   182: astore 6
    //   184: aload 5
    //   186: astore_1
    //   187: aload 6
    //   189: astore_2
    //   190: goto -27 -> 163
    //   193: astore 11
    //   195: goto -55 -> 140
    //
    // Exception table:
    //   from	to	target	type
    //   101	106	107	java/io/IOException
    //   9	17	135	java/lang/Exception
    //   22	70	135	java/lang/Exception
    //   149	154	157	java/io/IOException
    //   9	17	162	finally
    //   22	70	162	finally
    //   119	124	173	java/io/IOException
    //   167	171	178	java/io/IOException
    //   70	96	182	finally
    //   110	119	182	finally
    //   140	144	182	finally
    //   70	96	193	java/lang/Exception
    //   110	119	193	java/lang/Exception
  }

  public static int getQQBrowserCoreVersion(Context paramContext)
  {
    cR(paramContext);
    return kea;
  }

  public static h gt(boolean paramBoolean)
  {
    if ((kdT == null) && (paramBoolean))
      kdT = new h();
    return kdT;
  }

  private static boolean rH(int paramInt)
  {
    while (true)
    {
      try
      {
        if (ked)
          break label51;
        if ((paramInt <= 25206) && (paramInt >= 25200))
        {
          bool = false;
          ked = true;
          return bool;
        }
      }
      catch (Throwable localThrowable)
      {
        return false;
      }
      finally
      {
        ked = true;
      }
      boolean bool = true;
      continue;
      label51: bool = true;
    }
  }

  public final WebViewWizardBase bdw()
  {
    return this.kdQ;
  }

  public final boolean bdx()
  {
    return this.kdS;
  }

  public final void init(Context paramContext)
  {
    while (true)
    {
      try
      {
        kec = 1 + kec;
        this.kdR = paramContext.getDir("x5core", 0);
        boolean bool1 = e.cO(paramContext);
        cR(paramContext);
        if (kea < 25102)
        {
          if (kea != 0)
          {
            f.e("QbSdk", "sys WebView: version too low");
            bool1 = false;
          }
        }
        else
        {
          int i = kea;
          this.kdR.toString();
          if (!rH(i))
          {
            e.bdt();
            f.e("QbSdk", "sys WebView: not Compatible");
            bool1 = false;
          }
          if (!bool1)
            break label700;
          if (!bdv())
            continue;
          if (this.kdX == null)
          {
            this.kdX = new HandlerThread("X5DexOptimize");
            this.kdX.start();
          }
          if (this.kdY == null)
          {
            this.kdY = new Handler(this.kdX.getLooper());
            this.kdY.post(new j(this, paramContext));
          }
          this.kdQ = new WebViewWizardBase();
          this.kdS = false;
          this.kdQ.setWizardMode(false, false);
          f.e("QbSdk", "sys WebView: need dexopt");
          return;
        }
        f.i("QbSdk", "sys WebView: no x5");
        bool1 = false;
        continue;
        boolean bool2 = this.kdS;
        if (bool2)
          continue;
        try
        {
          if (paramContext.getPackageManager().getPackageInfo("com.tencent.mtt", 64).signatures[0].toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a"))
            break label338;
          this.kdS = false;
          this.kdQ = new WebViewWizardBase();
          this.kdQ.setWizardMode(false, false);
          e.bdt();
          f.e("QbSdk", "sys WebView: signature check failed");
        }
        catch (Exception localException)
        {
          this.kdS = false;
          this.kdQ = new WebViewWizardBase();
          this.kdQ.setWizardMode(false, false);
          e.bdt();
          f.e("QbSdk", "sys WebView: check sig exception");
        }
        continue;
      }
      finally
      {
      }
      label338: this.kdQ = new WebViewWizardBase();
      this.kdQ.setWizardMode(true, true);
      Context localContext = aG(paramContext, "com.tencent.mtt");
      if (localContext == null)
      {
        this.kdS = false;
        this.kdQ.setWizardMode(false, false);
        e.bdt();
        f.e("QbSdk", "sys WebView: null x5 context");
      }
      else
      {
        try
        {
          this.kdV = localContext.getDir("x5_share", 0);
          this.kdU = new File(this.kdV, "x5core");
          WebViewWizardBase localWebViewWizardBase = this.kdQ;
          String[] arrayOfString = new String[2];
          arrayOfString[0] = new File(this.kdV, "webview_interfaces_dex.jar").getAbsolutePath();
          arrayOfString[1] = new File(this.kdU, "webview_dex.jar").getAbsolutePath();
          localWebViewWizardBase.setDexLoader(paramContext, arrayOfString, this.kdR.getAbsolutePath());
          this.kdW = new File(localContext.getApplicationInfo().nativeLibraryDir);
          libwebp.loadWepLibraryIfNeed(paramContext, this.kdW.getAbsolutePath());
          this.kdQ.setContextHolderDevelopMode(true);
          boolean bool4 = this.kdQ.setContextHolderParams(paramContext, this.kdW.getAbsolutePath());
          bool3 = bool4;
          if (!bool3)
          {
            this.kdS = false;
            this.kdQ.setContextHolderDevelopMode(false);
            this.kdQ.setWizardMode(false, false);
            e.bdt();
            f.e("QbSdk", "sys WebView: failed to load so.");
          }
        }
        catch (Throwable localThrowable)
        {
          while (true)
          {
            f.e("QbSdk", "sys WebView: exception while loading so.");
            boolean bool3 = false;
          }
          if (kec == 1)
          {
            this.kdQ.setContextHolderDevelopMode(true);
            this.kdQ.setSdkVersion(1);
            this.kdQ.initCookieModule(paramContext);
            this.kdQ.SmttResource_UpdateContext(localContext);
            this.kdS = true;
            continue;
          }
          this.kdQ = new WebViewWizardBase();
          this.kdS = false;
          this.kdQ.setWizardMode(false, false);
          e.bdt();
          f.e("QbSdk", "sys WebView: not first time.");
        }
        continue;
        label700: this.kdQ = new WebViewWizardBase();
        this.kdS = false;
        this.kdQ.setWizardMode(false, false);
        f.e("QbSdk", "canload5 is false.");
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.h
 * JD-Core Version:    0.6.2
 */