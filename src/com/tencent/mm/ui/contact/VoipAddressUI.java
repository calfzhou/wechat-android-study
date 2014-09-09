package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import com.tencent.mm.f.c;
import com.tencent.mm.f.e;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.a;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.fy;

public class VoipAddressUI extends MMActivity
{
  private ListView feW;
  private fy fqC = new gj(this);
  private da fqy;
  private AlphabetScrollBar fqz;
  private cn hos;
  private View jBH;
  private View jBI;
  private MultiSelectContactView jBJ;
  private boolean jCF = false;
  private boolean jCG = false;

  public static void ct(Context paramContext)
  {
    boolean bool;
    com.tencent.mm.plugin.f.c.n localn;
    Object[] arrayOfObject;
    int i;
    if (1 == ch.getInt(e.or().getValue("VOIPCallType"), 0))
    {
      bool = true;
      Intent localIntent = new Intent(paramContext, VoipAddressUI.class);
      localIntent.putExtra("Add_address_titile", paramContext.getString(com.tencent.mm.n.bsw));
      localIntent.putExtra("voip_video", bool);
      paramContext.startActivity(localIntent);
      localn = com.tencent.mm.plugin.f.c.n.fTF;
      arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(1);
      i = 0;
      if (!bool)
        break label107;
    }
    while (true)
    {
      arrayOfObject[1] = Integer.valueOf(i);
      localn.d(11034, arrayOfObject);
      return;
      bool = false;
      break;
      label107: i = 1;
    }
  }

  protected final void DP()
  {
    this.feW = ((ListView)findViewById(i.aeA));
    this.fqy = new da(this);
    this.fqy.a(new gi(this));
    this.fqy.aXl();
    this.fqy.aXm();
    this.fqy.RM();
    this.jBJ = ((MultiSelectContactView)findViewById(i.aeH));
    this.jBJ.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, -2147483648), View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, -2147483648));
    this.jBI = new View(aPI());
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, this.jBJ.getMeasuredHeight());
    this.jBI.setLayoutParams(localLayoutParams);
    this.jBI.setVisibility(4);
    this.feW.addHeaderView(this.jBI);
    this.jBJ.a(new gr(this));
    this.feW.setAdapter(this.fqy);
    this.feW.setOnItemClickListener(new gk(this));
    int i = ViewConfiguration.get(this).getScaledTouchSlop();
    this.feW.setOnTouchListener(new gl(this, i));
    this.feW.setOnScrollListener(new a(new gm(this)));
    a(new gn(this));
    this.jBH = findViewById(i.aPq);
    this.fqz = ((AlphabetScrollBar)findViewById(i.aeL));
    this.fqz.setVisibility(0);
    this.fqz.a(this.fqC);
    a(new go(this));
  }

  protected final int getLayoutId()
  {
    return k.bmA;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str1 = getIntent().getStringExtra("LauncherUI.Shortcut.LaunchType");
    this.jCG = getIntent().getBooleanExtra("voip_video", true);
    if (str1 != null)
    {
      this.jCF = true;
      if (!str1.equals("launch_type_voip"))
        break label93;
      this.jCG = true;
    }
    while (true)
    {
      String str2 = getIntent().getStringExtra("Add_address_titile");
      if ((str2 == null) || (str2.length() <= 0))
        str2 = getString(com.tencent.mm.n.bsw);
      Bt(str2);
      DP();
      return;
      label93: if (str1.equals("launch_type_voip_audio"))
        this.jCG = false;
    }
  }

  public void onDestroy()
  {
    this.fqz.aTw();
    this.fqy.Cc();
    this.fqy.a(null);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (this.jCF))
    {
      Intent localIntent = new Intent(this, LauncherUI.class);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
      finish();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    if (this.hos != null)
      this.hos.dismiss();
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.fqy.RM();
    if (this.fqy != null)
      this.fqy.a(null, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.VoipAddressUI
 * JD-Core Version:    0.6.2
 */