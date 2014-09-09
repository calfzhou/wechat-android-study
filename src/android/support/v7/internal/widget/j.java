package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class j extends DataSetObservable
{
  private static final String LOG_TAG = j.class.getSimpleName();
  private static final Object ny = new Object();
  private static final Map nz = new HashMap();
  private Intent jB;
  private final Context mContext;
  private final Object nA;
  private final List nB;
  private final List nC;
  private final String nD;
  private l nE;
  private int nF;
  private boolean nG;
  private boolean nH;
  private boolean nI;
  private boolean nJ;
  private n nK;

  private boolean a(m paramm)
  {
    boolean bool = this.nC.add(paramm);
    if (bool)
    {
      this.nI = true;
      cE();
      if (!this.nH)
        throw new IllegalStateException("No preceding call to #readHistoricalData");
      if (this.nI)
      {
        this.nI = false;
        if (!TextUtils.isEmpty(this.nD))
        {
          if (Build.VERSION.SDK_INT < 11)
            break label137;
          o localo1 = new o(this, (byte)0);
          Executor localExecutor = AsyncTask.SERIAL_EXECUTOR;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = new ArrayList(this.nC);
          arrayOfObject1[1] = this.nD;
          localo1.executeOnExecutor(localExecutor, arrayOfObject1);
        }
      }
    }
    while (true)
    {
      cD();
      notifyChanged();
      return bool;
      label137: o localo2 = new o(this, (byte)0);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = new ArrayList(this.nC);
      arrayOfObject2[1] = this.nD;
      localo2.execute(arrayOfObject2);
    }
  }

  private void cC()
  {
    boolean bool = true;
    int i;
    if ((this.nJ) && (this.jB != null))
    {
      this.nJ = false;
      this.nB.clear();
      List localList = this.mContext.getPackageManager().queryIntentActivities(this.jB, 0);
      int k = localList.size();
      for (int m = 0; m < k; m++)
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localList.get(m);
        this.nB.add(new k(this, localResolveInfo));
      }
      i = bool;
      if ((!this.nG) || (!this.nI) || (TextUtils.isEmpty(this.nD)))
        break label173;
      this.nG = false;
      this.nH = bool;
      cF();
    }
    while (true)
    {
      int j = i | bool;
      cE();
      if (j != 0)
      {
        cD();
        notifyChanged();
      }
      return;
      i = 0;
      break;
      label173: bool = false;
    }
  }

  private boolean cD()
  {
    if ((this.nE != null) && (this.jB != null) && (!this.nB.isEmpty()) && (!this.nC.isEmpty()))
    {
      Collections.unmodifiableList(this.nC);
      return true;
    }
    return false;
  }

  private void cE()
  {
    int i = this.nC.size() - this.nF;
    if (i <= 0);
    while (true)
    {
      return;
      this.nI = true;
      for (int j = 0; j < i; j++)
        this.nC.remove(0);
    }
  }

  // ERROR //
  private void cF()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	android/support/v7/internal/widget/j:mContext	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 81	android/support/v7/internal/widget/j:nD	Ljava/lang/String;
    //   8: invokevirtual 194	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 200	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 13
    //   17: aload 13
    //   19: aload_2
    //   20: aconst_null
    //   21: invokeinterface 206 3 0
    //   26: iconst_0
    //   27: istore 14
    //   29: iload 14
    //   31: iconst_1
    //   32: if_icmpeq +21 -> 53
    //   35: iload 14
    //   37: iconst_2
    //   38: if_icmpeq +15 -> 53
    //   41: aload 13
    //   43: invokeinterface 209 1 0
    //   48: istore 14
    //   50: goto -21 -> 29
    //   53: ldc 211
    //   55: aload 13
    //   57: invokeinterface 214 1 0
    //   62: invokevirtual 219	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   65: ifne +45 -> 110
    //   68: new 188	org/xmlpull/v1/XmlPullParserException
    //   71: dup
    //   72: ldc 221
    //   74: invokespecial 222	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    //   78: astore 9
    //   80: getstatic 40	android/support/v7/internal/widget/j:LOG_TAG	Ljava/lang/String;
    //   83: pop
    //   84: new 224	java/lang/StringBuilder
    //   87: dup
    //   88: ldc 226
    //   90: invokespecial 227	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: aload_0
    //   94: getfield 81	android/support/v7/internal/widget/j:nD	Ljava/lang/String;
    //   97: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_2
    //   102: ifnull +7 -> 109
    //   105: aload_2
    //   106: invokevirtual 236	java/io/FileInputStream:close	()V
    //   109: return
    //   110: aload_0
    //   111: getfield 59	android/support/v7/internal/widget/j:nC	Ljava/util/List;
    //   114: astore 15
    //   116: aload 15
    //   118: invokeinterface 139 1 0
    //   123: aload 13
    //   125: invokeinterface 209 1 0
    //   130: istore 16
    //   132: iload 16
    //   134: iconst_1
    //   135: if_icmpeq +141 -> 276
    //   138: iload 16
    //   140: iconst_3
    //   141: if_icmpeq -18 -> 123
    //   144: iload 16
    //   146: iconst_4
    //   147: if_icmpeq -24 -> 123
    //   150: ldc 238
    //   152: aload 13
    //   154: invokeinterface 214 1 0
    //   159: invokevirtual 219	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   162: ifne +48 -> 210
    //   165: new 188	org/xmlpull/v1/XmlPullParserException
    //   168: dup
    //   169: ldc 240
    //   171: invokespecial 222	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   174: athrow
    //   175: astore 5
    //   177: getstatic 40	android/support/v7/internal/widget/j:LOG_TAG	Ljava/lang/String;
    //   180: pop
    //   181: new 224	java/lang/StringBuilder
    //   184: dup
    //   185: ldc 226
    //   187: invokespecial 227	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: aload_0
    //   191: getfield 81	android/support/v7/internal/widget/j:nD	Ljava/lang/String;
    //   194: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload_2
    //   199: ifnull -90 -> 109
    //   202: aload_2
    //   203: invokevirtual 236	java/io/FileInputStream:close	()V
    //   206: return
    //   207: astore 8
    //   209: return
    //   210: aload 15
    //   212: new 242	android/support/v7/internal/widget/m
    //   215: dup
    //   216: aload 13
    //   218: aconst_null
    //   219: ldc 244
    //   221: invokeinterface 248 3 0
    //   226: aload 13
    //   228: aconst_null
    //   229: ldc 250
    //   231: invokeinterface 248 3 0
    //   236: invokestatic 256	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   239: aload 13
    //   241: aconst_null
    //   242: ldc_w 258
    //   245: invokeinterface 248 3 0
    //   250: invokestatic 264	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   253: invokespecial 267	android/support/v7/internal/widget/m:<init>	(Ljava/lang/String;JF)V
    //   256: invokeinterface 65 2 0
    //   261: pop
    //   262: goto -139 -> 123
    //   265: astore_3
    //   266: aload_2
    //   267: ifnull +7 -> 274
    //   270: aload_2
    //   271: invokevirtual 236	java/io/FileInputStream:close	()V
    //   274: aload_3
    //   275: athrow
    //   276: aload_2
    //   277: ifnull -168 -> 109
    //   280: aload_2
    //   281: invokevirtual 236	java/io/FileInputStream:close	()V
    //   284: return
    //   285: astore 17
    //   287: return
    //   288: astore 12
    //   290: return
    //   291: astore 4
    //   293: goto -19 -> 274
    //   296: astore_1
    //   297: return
    //
    // Exception table:
    //   from	to	target	type
    //   12	26	78	org/xmlpull/v1/XmlPullParserException
    //   41	50	78	org/xmlpull/v1/XmlPullParserException
    //   53	78	78	org/xmlpull/v1/XmlPullParserException
    //   110	123	78	org/xmlpull/v1/XmlPullParserException
    //   123	132	78	org/xmlpull/v1/XmlPullParserException
    //   150	175	78	org/xmlpull/v1/XmlPullParserException
    //   210	262	78	org/xmlpull/v1/XmlPullParserException
    //   12	26	175	java/io/IOException
    //   41	50	175	java/io/IOException
    //   53	78	175	java/io/IOException
    //   110	123	175	java/io/IOException
    //   123	132	175	java/io/IOException
    //   150	175	175	java/io/IOException
    //   210	262	175	java/io/IOException
    //   202	206	207	java/io/IOException
    //   12	26	265	finally
    //   41	50	265	finally
    //   53	78	265	finally
    //   80	101	265	finally
    //   110	123	265	finally
    //   123	132	265	finally
    //   150	175	265	finally
    //   177	198	265	finally
    //   210	262	265	finally
    //   280	284	285	java/io/IOException
    //   105	109	288	java/io/IOException
    //   270	274	291	java/io/IOException
    //   0	12	296	java/io/FileNotFoundException
  }

  public final ResolveInfo E(int paramInt)
  {
    synchronized (this.nA)
    {
      cC();
      ResolveInfo localResolveInfo = ((k)this.nB.get(paramInt)).resolveInfo;
      return localResolveInfo;
    }
  }

  public final Intent F(int paramInt)
  {
    synchronized (this.nA)
    {
      if (this.jB == null)
        return null;
      cC();
      k localk = (k)this.nB.get(paramInt);
      ComponentName localComponentName = new ComponentName(localk.resolveInfo.activityInfo.packageName, localk.resolveInfo.activityInfo.name);
      Intent localIntent = new Intent(this.jB);
      localIntent.setComponent(localComponentName);
      if (this.nK != null)
      {
        new Intent(localIntent);
        if (this.nK.cH())
          return null;
      }
      a(new m(localComponentName, System.currentTimeMillis(), 1.0F));
      return localIntent;
    }
  }

  public final void G(int paramInt)
  {
    synchronized (this.nA)
    {
      cC();
      k localk1 = (k)this.nB.get(paramInt);
      k localk2 = (k)this.nB.get(0);
      if (localk2 != null)
      {
        f = 5.0F + (localk2.weight - localk1.weight);
        a(new m(new ComponentName(localk1.resolveInfo.activityInfo.packageName, localk1.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
        return;
      }
      float f = 1.0F;
    }
  }

  public final int a(ResolveInfo paramResolveInfo)
  {
    synchronized (this.nA)
    {
      cC();
      List localList = this.nB;
      int i = localList.size();
      for (int j = 0; j < i; j++)
        if (((k)localList.get(j)).resolveInfo == paramResolveInfo)
          return j;
      return -1;
    }
  }

  public final int cA()
  {
    synchronized (this.nA)
    {
      cC();
      int i = this.nB.size();
      return i;
    }
  }

  public final ResolveInfo cB()
  {
    synchronized (this.nA)
    {
      cC();
      if (!this.nB.isEmpty())
      {
        ResolveInfo localResolveInfo = ((k)this.nB.get(0)).resolveInfo;
        return localResolveInfo;
      }
      return null;
    }
  }

  public final int getHistorySize()
  {
    synchronized (this.nA)
    {
      cC();
      int i = this.nC.size();
      return i;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.j
 * JD-Core Version:    0.6.2
 */