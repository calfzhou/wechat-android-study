package com.tencent.mm.pluginsdk.ui.tools;

import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.pluginsdk.model.x;
import com.tencent.mm.pluginsdk.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AppChooserUI extends MMActivity
{
  private int cCn = 0;
  private k hJW;
  private Intent hJX = null;
  private int hJY;
  private String hJZ = null;
  private Bundle hKa = null;
  private x hKb = null;
  private ArrayList hKc = null;
  private m hKd = null;
  private m hKe = new m(this);
  private List hKf;
  private String hKg;
  private int hKh;
  private int hKi;
  private boolean hKj = false;
  private boolean hKk = false;
  private boolean hKl = false;
  private long hKm;
  private o hKn;
  private AdapterView.OnItemClickListener hKo = new d(this);
  private View.OnClickListener hKp = new e(this);
  private View.OnClickListener hKq = new f(this);
  private View.OnClickListener hKr = new g(this);
  private DialogInterface.OnDismissListener hKs = new h(this);
  private com.tencent.mm.pluginsdk.model.downloader.n hKt = new i(this);
  private PackageManager mPackageManager;
  private String mimeType = null;

  private static Drawable a(Resources paramResources, int paramInt)
  {
    try
    {
      Drawable localDrawable = paramResources.getDrawable(paramInt);
      return localDrawable;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
    }
    return null;
  }

  private List a(Intent paramIntent, boolean paramBoolean, ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = this.mPackageManager.queryIntentActivities(paramIntent, 65536);
    y localy = y.ayB();
    int i = this.hJY;
    com.tencent.mm.pluginsdk.model.z localz = new com.tencent.mm.pluginsdk.model.z(localy);
    int j;
    int i1;
    label228: ResolveInfo localResolveInfo;
    switch (i)
    {
    default:
      localz.huz = com.tencent.mm.n.bVP;
      localz.huA = com.tencent.mm.n.bVR;
      localz.huy = com.tencent.mm.h.VS;
      this.hJZ = getResources().getString(localz.huz);
      this.hKe.hKD = getResources().getDrawable(localz.huy);
      this.hKe.hKC = getResources().getString(localz.huA);
      this.hKe.hKE = true;
      this.hKe.hKF = this.hKj;
      if (this.hKj)
        this.hKe.eZh = true;
      if (this.hKk)
        this.hKe.hKG = true;
      j = 0;
      if (localList == null)
        break label465;
      int m = localList.size();
      j = 0;
      if (m <= 0)
        break label465;
      int n = localList.size();
      i1 = 0;
      if (i1 >= n)
        break label465;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = ((ResolveInfo)localList.get(i1)).activityInfo.name;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "cpan name:%s", arrayOfObject3);
      localResolveInfo = (ResolveInfo)localList.get(i1);
      if (localResolveInfo != null)
      {
        String str2 = localResolveInfo.activityInfo.packageName;
        if ((paramArrayList == null) || (paramArrayList.isEmpty()) || (paramArrayList.contains(str2)))
          if (this.hKb.uS(str2))
          {
            this.hKe.hKB = localResolveInfo;
            this.hKe.eZh = true;
            if (((paramBoolean) || (!this.hKj)) && ((paramBoolean) || (!this.hKe.eZh)))
              break label458;
            localArrayList.add(0, this.hKe);
          }
      }
      break;
    case 1:
    }
    label458: for (int i2 = 1; ; i2 = j)
    {
      i1++;
      j = i2;
      break label228;
      localz.huz = com.tencent.mm.n.cmk;
      localz.huA = com.tencent.mm.n.cml;
      localz.huy = com.tencent.mm.h.VT;
      break;
      localArrayList.add(new m(this, localResolveInfo, this.hKb.a(aPI(), localResolveInfo)));
    }
    label465: if ((paramBoolean) && (j == 0))
    {
      if ((this.hJY != 0) || (this.mimeType == null))
        break label694;
      if (s.uR(this.mimeType))
      {
        localArrayList.add(0, this.hKe);
        if (!this.hKk)
          break label651;
        com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(2);
        arrayOfObject2[1] = Integer.valueOf(this.cCn);
        localn2.d(11168, arrayOfObject2);
      }
    }
    while (true)
    {
      HashSet localHashSet = new HashSet();
      for (int k = -1 + localArrayList.size(); k >= 0; k--)
      {
        m localm = (m)localArrayList.get(k);
        if (localm.hKB != null)
        {
          String str1 = localm.hKB.activityInfo.packageName;
          if ((!ch.jb(str1)) && (!localHashSet.add(str1)))
            localArrayList.remove(k);
        }
      }
      label651: com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(1);
      arrayOfObject1[1] = Integer.valueOf(this.cCn);
      localn1.d(11168, arrayOfObject1);
      continue;
      label694: localArrayList.add(0, this.hKe);
    }
    return localArrayList;
  }

  private boolean aEQ()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Boolean.valueOf(this.hKl);
    arrayOfObject[1] = Integer.valueOf(this.hKh);
    arrayOfObject[2] = Integer.valueOf(this.hKi);
    arrayOfObject[3] = Boolean.valueOf(ch.ys());
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "mShouldShowRecommendApp %s | mAppRecommendCount %d | mAppMaxRecommendCount %d | isOverseasUser %s", arrayOfObject);
    return (this.hKl) && (this.hKh < this.hKi) && (!ch.ys());
  }

  private Drawable b(ResolveInfo paramResolveInfo)
  {
    Drawable localDrawable1;
    try
    {
      if ((paramResolveInfo.resolvePackageName != null) && (paramResolveInfo.icon != 0))
      {
        Drawable localDrawable2 = a(this.mPackageManager.getResourcesForApplication(paramResolveInfo.resolvePackageName), paramResolveInfo.icon);
        if (localDrawable2 != null)
          return localDrawable2;
      }
      int i = paramResolveInfo.getIconResource();
      if (i != 0)
      {
        localDrawable1 = a(this.mPackageManager.getResourcesForApplication(paramResolveInfo.activityInfo.packageName), i);
        if (localDrawable1 != null);
      }
      else
      {
        return paramResolveInfo.loadIcon(this.mPackageManager);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "Couldn't find resources for package", new Object[] { localNameNotFoundException });
    }
    return localDrawable1;
  }

  private void b(int paramInt, String paramString, boolean paramBoolean)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("selectpkg", paramString);
    localIntent.putExtra("isalways", paramBoolean);
    localIntent.putExtra("transferback", this.hKa);
    setResult(paramInt, localIntent);
    finish();
  }

  private int nm(int paramInt)
  {
    if (this.mimeType != null)
      return paramInt + this.hJY + this.mimeType.hashCode();
    return paramInt + this.hJY;
  }

  public final void cD(long paramLong)
  {
    if (FileDownloadManger.cs(paramLong))
    {
      String str = FileDownloadManger.cx(paramLong).field_filePath;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "filepath:%s", new Object[] { str });
      if (!TextUtils.isEmpty(str))
      {
        File localFile = new File(str);
        if (u.c(aPI(), Uri.fromFile(localFile)))
          break label108;
        bg.qW().oQ().set(nm(274560), Long.valueOf(0L));
        if (this.hJW != null)
        {
          this.hJW.no(p.hKN);
          this.hJW.notifyDataSetChanged();
        }
      }
    }
    label108: 
    while (this.hJW == null)
      return;
    this.hJW.no(p.hKP);
    this.hJW.notifyDataSetChanged();
  }

  protected final int getLayoutId()
  {
    return -1;
  }

  public void onBackPressed()
  {
    super.onBackPressed();
    b(0, null, false);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    y.ayB();
    y.mk(this.hJY);
    Intent localIntent1 = getIntent();
    Parcelable localParcelable = localIntent1.getParcelableExtra("targetintent");
    if (!(localParcelable instanceof Intent))
    {
      com.tencent.mm.sdk.platformtools.z.w("ChooseActivity", "Target is not an intent: " + localParcelable);
      b(0, null, false);
      return;
    }
    this.hJX = ((Intent)localParcelable);
    String str = localIntent1.getStringExtra("title");
    this.hJY = localIntent1.getIntExtra("type", 0);
    this.hKa = localIntent1.getBundleExtra("transferback");
    this.hKc = localIntent1.getStringArrayListExtra("targetwhitelist");
    this.hKk = localIntent1.getBooleanExtra("needupate", false);
    this.mimeType = localIntent1.getStringExtra("mimetype");
    this.cCn = localIntent1.getIntExtra("scene", 0);
    this.hKg = ((String)bg.qW().oQ().get(nm(274528), ""));
    int i;
    if ((!TextUtils.isEmpty(this.hKg)) && (u.d(aPI(), this.hKg)) && ((this.hKc == null) || (this.hKc.isEmpty()) || (this.hKc.contains(this.hKg))))
    {
      Intent localIntent2 = new Intent(this.hJX);
      localIntent2.setPackage(this.hKg);
      if (ch.i(this, localIntent2))
        i = 1;
    }
    while (true)
      if (i != 0)
      {
        b(-1, this.hKg, true);
        return;
        i = 0;
      }
      else
      {
        this.mPackageManager = getPackageManager();
        this.hJW = new k(this);
        y.ayB();
        this.hKb = y.mi(this.hJY);
        this.hKj = this.hKb.bb(aPI());
        this.hKh = ((Integer)bg.qW().oQ().get(274496 + this.hJY, Integer.valueOf(0))).intValue();
        y.ayB();
        this.hKi = y.mj(this.hJY);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = String.valueOf(this.hKj);
        arrayOfObject[1] = Integer.valueOf(this.hKh);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "jiaminchen mRecommendAppAvailable is %s, mAppRecommendCount is %d", arrayOfObject);
        this.hKl = true;
        int j;
        if (this.hKh >= this.hKi)
        {
          j = 1;
          this.hKf = a(this.hJX, aEQ(), this.hKc);
          if ((j == 0) && (!this.hKj))
            bg.qW().oQ().set(274496 + this.hJY, Integer.valueOf(1 + this.hKh));
          if (!this.hKj)
            break label610;
          y.ayB();
          y.mm(this.hJY);
        }
        while (true)
          if ((this.hKf != null) && (this.hKf.size() == 1) && ((!aEQ()) || (this.hKj)))
          {
            m localm = (m)this.hKf.get(0);
            if (localm != null)
            {
              if (localm.hKB != null)
              {
                b(-1, localm.hKB.activityInfo.packageName, false);
                return;
                j = 0;
                break;
                label610: if (j != 0)
                  continue;
                y.ayB();
                y.ml(this.hJY);
                continue;
              }
              b(4098, null, false);
              return;
            }
            b(4097, null, false);
            return;
          }
        oO(8);
        if ((this.hKf != null) && (!this.hKf.isEmpty()))
        {
          this.hJW.x(this.hKf);
          this.hKm = ((Long)bg.qW().oQ().get(nm(274560), Long.valueOf(0L))).longValue();
          an localan = FileDownloadManger.cx(this.hKm);
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "downloadId:" + this.hKm + ", status:" + localan.field_status);
          if ((0L != this.hKm) && (!TextUtils.isEmpty(localan.field_filePath)) && (8 == localan.field_status))
            FileDownloadManger.a(this.hKm, new j(this));
          this.hKn = new o(this, aPI());
          this.hKn.setTitle(str);
          this.hKn.setOnItemClickListener(this.hKo);
          this.hKn.k(this.hKq);
          this.hKn.j(this.hKp);
          this.hKn.a(this.hJW);
          this.hKn.setOnDismissListener(this.hKs);
          this.hKn.show();
          if ((!this.hKk) && (this.hKj) && (j == 0))
          {
            this.hKd = this.hKe;
            this.hKn.dY(true);
          }
          FileDownloadManger.a(this.hKt);
          return;
        }
        b(4097, null, false);
        return;
        i = 0;
      }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    FileDownloadManger.b(this.hKt);
    if (this.hKn != null)
      this.hKn.dismiss();
  }

  protected void onResume()
  {
    super.onResume();
    if ((this.hKk) && (this.hJX != null) && (this.hKb.h(this, this.hJX)))
    {
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpIg3+3oVdUfy4qJrktshWRo", "user installed lasted recommend app");
      this.hKk = false;
      this.hKe.hKG = false;
    }
    this.hKj = this.hKb.bb(aPI());
    this.hKf = a(this.hJX, aEQ(), this.hKc);
    if ((this.hKj) && (this.hKd == null))
    {
      this.hKd = this.hKe;
      this.hKn.dY(true);
    }
    if (this.hJW != null)
    {
      this.hJW.x(this.hKf);
      this.hJW.notifyDataSetChanged();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI
 * JD-Core Version:    0.6.2
 */