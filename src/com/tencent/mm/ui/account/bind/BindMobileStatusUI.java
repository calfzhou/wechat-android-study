package com.tencent.mm.ui.account.bind;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.x;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.n;
import com.tencent.mm.protocal.a.je;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BindMobileStatusUI extends MMWizardActivity
{
  private SharedPreferences dkI;
  private Button efk;

  @SuppressLint({"UseSparseArrays"})
  private HashMap els = new HashMap();
  private SparseArray iTA = new SparseArray(3);
  private ImageView iTn;
  private TextView iTo;
  private TextView iTp;
  private ImageView iTq;
  private ImageView iTr;
  private Boolean iTs = Boolean.valueOf(true);
  private Boolean iTt = Boolean.valueOf(true);
  private RelativeLayout iTu;
  private RelativeLayout iTv;
  private BindWordingContent iTw;
  private int iTx;
  private boolean iTy;
  private boolean iTz;
  private int status;

  public static void a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0);
    SharedPreferences.Editor localEditor1 = localSharedPreferences.edit();
    int m;
    int n;
    label117: int i1;
    label129: je localje1;
    int i2;
    label168: je localje2;
    if (!paramBoolean1)
    {
      int j = i;
      localEditor1.putBoolean("settings_find_me_by_mobile", j).commit();
      SharedPreferences.Editor localEditor2 = localSharedPreferences.edit();
      boolean bool = false;
      if (!paramBoolean2)
        bool = i;
      localEditor2.putBoolean("settings_recommend_mobilefriends_to_me", bool).commit();
      m = x.pK();
      if (!paramBoolean1)
        break label256;
      n = m | 0x200;
      if (!paramBoolean2)
        break label267;
      i1 = n | 0x100;
      com.tencent.mm.model.bg.qW().oQ().set(7, Integer.valueOf(i1));
      localje1 = new je();
      localje1.iad = 8;
      if (!paramBoolean2)
        break label278;
      i2 = i;
      localje1.iae = i2;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje1));
      localje2 = new je();
      localje2.iad = 7;
      if (!paramBoolean1)
        break label284;
    }
    while (true)
    {
      localje1.iae = i;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje2));
      com.tencent.mm.plugin.a.a.dWp.hT();
      return;
      int k = 0;
      break;
      label256: n = m & 0xFFFFFDFF;
      break label117;
      label267: i1 = n & 0xFFFFFEFF;
      break label129;
      label278: i2 = 2;
      break label168;
      label284: i = 2;
    }
  }

  private boolean b(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    z.d("!44@/B4Tb64lLpK6HdUbIC2x6nap1KI81Qmag7wenJvehsk=", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    int i;
    label60: String str;
    Boolean localBoolean;
    if (paramBoolean)
    {
      this.status = (paramInt1 | this.status);
      if (!paramBoolean)
        break label186;
      i = 1;
      this.els.put(Integer.valueOf(paramInt2), Integer.valueOf(i));
      str = (String)this.iTA.get(paramInt2);
      if ((this.dkI != null) && (str != null) && (str.length() > 0))
      {
        localBoolean = Boolean.valueOf(paramBoolean);
        if ((paramInt2 == 8) || (paramInt2 == 7))
          if (paramBoolean)
            break label192;
      }
    }
    label186: label192: for (boolean bool = true; ; bool = false)
    {
      localBoolean = Boolean.valueOf(bool);
      this.dkI.edit().putBoolean(str, localBoolean.booleanValue()).commit();
      return true;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
      i = 2;
      break label60;
    }
  }

  protected final void DP()
  {
    boolean bool1 = true;
    this.iTn = ((ImageView)findViewById(i.aiQ));
    this.iTp = ((TextView)findViewById(i.aiO));
    this.iTo = ((TextView)findViewById(i.aiN));
    this.efk = ((Button)findViewById(i.aiP));
    this.iTq = ((ImageView)findViewById(i.ajm));
    this.iTr = ((ImageView)findViewById(i.ajl));
    this.iTu = ((RelativeLayout)findViewById(i.aiK));
    this.iTv = ((RelativeLayout)findViewById(i.aiL));
    switch (this.iTx)
    {
    default:
      if (this.iTw != null);
      switch (this.iTw.dBZ.intValue())
      {
      case 0:
      case 1:
      default:
        label184: this.efk.setVisibility(8);
        a(0, getString(n.btB), new a(this));
        if (aa.wb() == ab.dtS)
        {
          this.iTn.setImageResource(h.Sr);
          String str = (String)com.tencent.mm.model.bg.qW().oQ().get(6);
          if ((str == null) || (str.equals("")))
            com.tencent.mm.model.bg.qW().oQ().get(4097);
        }
        break;
      case 2:
      }
      break;
    case 0:
    case 1:
    }
    while (true)
    {
      this.iTq.setOnClickListener(new b(this));
      this.iTr.setOnClickListener(new c(this));
      this.efk.setOnClickListener(new d(this));
      return;
      this.iTu.setVisibility(8);
      this.iTv.setVisibility(8);
      boolean bool2;
      if (!this.iTy)
      {
        bool2 = bool1;
        label348: b(bool2, 512, 8);
        if (this.iTz)
          break label387;
      }
      while (true)
      {
        b(bool1, 256, 7);
        break;
        bool2 = false;
        break label348;
        label387: bool1 = false;
      }
      this.iTu.setVisibility(0);
      this.iTu.setBackgroundResource(h.St);
      this.iTv.setVisibility(8);
      break;
      this.iTo.setVisibility(8);
      break label184;
      this.iTn.setImageResource(h.So);
      this.iTo.setVisibility(8);
      this.iTp.setText(getString(n.bwd));
    }
  }

  protected final int getLayoutId()
  {
    return k.bbB;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dkI = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.status = x.pK();
    this.iTA.put(8, "settings_find_me_by_mobile");
    this.iTA.put(7, "settings_recommend_mobilefriends_to_me");
    this.iTA.put(32, "settings_autoadd_mobilefriends");
    b(false, 512, 8);
    b(false, 256, 7);
    oP(n.bwD);
    this.iTw = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.iTx = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.iTy = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
    this.iTz = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      aQl();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    com.tencent.mm.model.bg.qW().oQ().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.els.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int i = ((Integer)localEntry.getKey()).intValue();
      int j = ((Integer)localEntry.getValue()).intValue();
      je localje = new je();
      localje.iad = i;
      localje.iae = j;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje));
      z.d("!44@/B4Tb64lLpK6HdUbIC2x6nap1KI81Qmag7wenJvehsk=", "switch  " + i + " " + j);
    }
    com.tencent.mm.plugin.a.a.dWp.hT();
    this.els.clear();
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.BindMobileStatusUI
 * JD-Core Version:    0.6.2
 */