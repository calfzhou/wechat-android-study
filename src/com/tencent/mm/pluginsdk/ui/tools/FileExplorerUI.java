package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.f;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

public class FileExplorerUI extends MMActivity
{
  private int hKS = 0;
  private ListView hKT;
  private y hKU;
  private TextView hKV;
  private TextView hKW;
  private View hKX;
  private View hKY;
  private String hKZ;
  private String hLa;
  private File hLb;
  private File hLc;

  private void np(int paramInt)
  {
    if (1 == paramInt)
    {
      this.hKS = 1;
      this.hKW.setTextColor(getResources().getColor(f.Ph));
      this.hKV.setTextColor(getResources().getColor(f.OD));
      this.hKX.setVisibility(4);
      this.hKY.setVisibility(0);
      return;
    }
    this.hKS = 0;
    this.hKV.setTextColor(getResources().getColor(f.Ph));
    this.hKW.setTextColor(getResources().getColor(f.OD));
    this.hKX.setVisibility(0);
    this.hKY.setVisibility(4);
  }

  public static int we(String paramString)
  {
    String str1 = paramString.toLowerCase();
    String str2 = ch.ja(str1).toLowerCase();
    if ((str2.endsWith(".doc")) || (str2.endsWith(".docx")) || (str2.endsWith("wps")));
    for (int i = 1; i != 0; i = 0)
      return h.YT;
    if (wf(str1))
      return h.YX;
    String str3 = ch.ja(str1).toLowerCase();
    if ((str3.endsWith(".rar")) || (str3.endsWith(".zip")) || (str3.endsWith(".7z")) || (str3.endsWith("tar")) || (str3.endsWith(".iso")));
    for (int j = 1; j != 0; j = 0)
      return h.Zb;
    String str4 = ch.ja(str1).toLowerCase();
    if ((str4.endsWith(".txt")) || (str4.endsWith(".rtf")));
    for (int k = 1; k != 0; k = 0)
      return h.Zc;
    if (ch.ja(str1).toLowerCase().endsWith(".pdf"))
      return h.YZ;
    String str5 = ch.ja(str1).toLowerCase();
    if ((str5.endsWith(".ppt")) || (str5.endsWith(".pptx")));
    for (int m = 1; m != 0; m = 0)
      return h.Za;
    String str6 = ch.ja(str1).toLowerCase();
    int n;
    if (!str6.endsWith(".xls"))
    {
      boolean bool = str6.endsWith(".xlsx");
      n = 0;
      if (!bool);
    }
    else
    {
      n = 1;
    }
    if (n != 0)
      return h.Zd;
    return h.YY;
  }

  public static boolean wf(String paramString)
  {
    String str = ch.ja(paramString).toLowerCase();
    return (str.endsWith(".bmp")) || (str.endsWith(".png")) || (str.endsWith(".jpg")) || (str.endsWith(".jpeg")) || (str.endsWith(".gif"));
  }

  public static boolean wg(String paramString)
  {
    String str = ch.ja(paramString).toLowerCase();
    return (str.endsWith(".mp3")) || (str.endsWith(".wma")) || (str.endsWith(".mp4")) || (str.endsWith(".rm"));
  }

  protected final void DP()
  {
    int i = 1;
    this.hKT = ((ListView)findViewById(i.aJv));
    this.hKV = ((TextView)findViewById(i.aMF));
    this.hKX = findViewById(i.aMG);
    this.hKW = ((TextView)findViewById(i.aNd));
    this.hKY = findViewById(i.aNe);
    a(new u(this));
    this.hKZ = getString(com.tencent.mm.n.bVo);
    this.hLa = getString(com.tencent.mm.n.bVp);
    File localFile1;
    Object localObject1;
    label126: Object localObject2;
    label140: Object localObject3;
    label156: Object localObject4;
    label217: Object localObject5;
    label239: Object localObject6;
    label300: label359: label373: TextView localTextView2;
    if (ch.jb(com.tencent.mm.compatible.c.v.dNG.dNh))
    {
      localFile1 = Environment.getRootDirectory();
      if (!localFile1.canRead())
        break label482;
      localObject1 = localFile1;
      if (!bg.qW().isSDCardAvailable())
        break label513;
      localObject2 = m.getExternalStorageDirectory();
      e locale1 = bg.qW().oQ();
      if (localObject1 != null)
        break label578;
      localObject3 = null;
      String str1 = (String)locale1.get(131073, localObject3);
      if ((str1 == null) || (localObject1 == null) || (((File)localObject1).getAbsolutePath().equals(str1)))
        break label588;
      File localFile5 = new File(str1);
      if (!localFile5.exists())
        break label588;
      localObject4 = localFile5;
      this.hLb = ((File)localObject4);
      e locale2 = bg.qW().oQ();
      localObject5 = null;
      if (localObject2 != null)
        break label595;
      String str2 = (String)locale2.get(131074, localObject5);
      if ((str2 == null) || (localObject2 == null) || (((File)localObject2).getAbsolutePath().equals(str2)))
        break label605;
      File localFile4 = new File(str2);
      if (!localFile4.exists())
        break label605;
      localObject6 = localFile4;
      this.hLc = ((File)localObject6);
      this.hKU = new y(this, (byte)0);
      if (localObject2 == null)
        break label612;
      np(i);
      this.hKU.wh(((File)localObject2).getPath());
      this.hKU.c(this.hLc.getParentFile(), this.hLc);
      TextView localTextView1 = this.hKV;
      if (localObject1 == null)
        break label665;
      int k = i;
      localTextView1.setEnabled(k);
      localTextView2 = this.hKW;
      if (localObject2 == null)
        break label671;
    }
    while (true)
    {
      localTextView2.setEnabled(i);
      this.hKT.setAdapter(this.hKU);
      this.hKU.notifyDataSetChanged();
      this.hKT.setOnItemClickListener(new v(this));
      this.hKV.setOnClickListener(new w(this, (File)localObject1));
      this.hKW.setOnClickListener(new x(this, (File)localObject2));
      return;
      localFile1 = new File(com.tencent.mm.compatible.c.v.dNG.dNh);
      break;
      label482: File localFile2 = m.getDataDirectory();
      if (localFile2.canRead())
      {
        this.hKZ = localFile2.getName();
        localObject1 = localFile2;
        break label126;
      }
      localObject1 = null;
      break label126;
      label513: if (ch.jb(com.tencent.mm.compatible.c.v.dNG.dNj));
      for (File localFile3 = Environment.getDownloadCacheDirectory(); ; localFile3 = new File(com.tencent.mm.compatible.c.v.dNG.dNj))
      {
        if (!localFile3.canRead())
          break label572;
        this.hLa = localFile3.getName();
        localObject2 = localFile3;
        break;
      }
      label572: localObject2 = null;
      break label140;
      label578: localObject3 = ((File)localObject1).getAbsolutePath();
      break label156;
      label588: localObject4 = localObject1;
      break label217;
      label595: localObject5 = ((File)localObject2).getAbsolutePath();
      break label239;
      label605: localObject6 = localObject2;
      break label300;
      label612: if (localObject1 != null)
      {
        np(0);
        this.hKU.wh(((File)localObject1).getPath());
        this.hKU.c(this.hLb.getParentFile(), this.hLb);
        break label359;
      }
      z.d("!32@/B4Tb64lLpKKG/WupdUGi6Sns9bhKpSP", "left and right tag disabled in the same time.");
      return;
      label665: int m = 0;
      break label373;
      label671: int j = 0;
    }
  }

  protected final int getLayoutId()
  {
    return k.bhs;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getIntent().getStringExtra("key_title");
    if (ch.jb(str))
      oP(com.tencent.mm.n.bVq);
    while (true)
    {
      DP();
      return;
      Bt(str);
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (y.a(this.hKU) != null))
    {
      if (1 == this.hKS)
        this.hLc = y.a(this.hKU);
      while (true)
      {
        this.hKU.c(y.a(this.hKU).getParentFile(), y.a(this.hKU));
        this.hKU.notifyDataSetChanged();
        this.hKT.setSelection(0);
        return true;
        if (this.hKS == 0)
          this.hLb = y.a(this.hKU);
      }
    }
    if (this.hLc != null)
      bg.qW().oQ().set(131074, this.hLc.getAbsolutePath());
    if (this.hLb != null)
      bg.qW().oQ().set(131073, this.hLb.getAbsolutePath());
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI
 * JD-Core Version:    0.6.2
 */