package com.tencent.mm.ui.bindqq;

import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ao;
import com.tencent.mm.modelfriend.aw;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cb;

public class QQGroupUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private TextView ekL = null;
  private ListView jla;
  private cb jlb;
  private View jlc = null;

  protected final void DP()
  {
    this.jla = ((ListView)findViewById(i.aIQ));
    this.ekL = ((TextView)findViewById(i.aIU));
    this.ekL.setText(n.bVU);
    this.jlb = new w(this, this, new q(this));
    this.jla.setAdapter(this.jlb);
    this.jla.setOnItemClickListener(new r(this));
    this.jlc = findViewById(i.aIS);
    this.jlc.setOnClickListener(new s(this));
    a(new t(this));
    new u(this);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpJ+zgjqUamJQQBKHm0O5o2b", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((ao)paramx).wy() != 0);
    do
    {
      return;
      if (this.dWT != null)
      {
        this.dWT.dismiss();
        this.dWT = null;
      }
    }
    while ((paramInt1 == 0) && (paramInt2 == 0));
    Toast.makeText(this, n.bVV, 0).show();
  }

  protected final int getLayoutId()
  {
    return k.bkG;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    z.d("!32@/B4Tb64lLpJ+zgjqUamJQQBKHm0O5o2b", "onConfigurationChanged: orientation = " + paramConfiguration.orientation);
    super.onConfigurationChanged(paramConfiguration);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bVY);
    bg.qX().a(143, this);
    DP();
    if (ch.a((Integer)bg.qW().oQ().get(9)) != 0);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        ao localao = new ao(0, 0);
        bg.qX().d(localao);
        ActionBarActivity localActionBarActivity = aPI();
        getString(n.buo);
        this.dWT = com.tencent.mm.ui.base.e.a(localActionBarActivity, getString(n.bVW), true, new v(this, localao));
      }
      return;
    }
  }

  public void onDestroy()
  {
    bg.qX().b(143, this);
    this.jlb.closeCursor();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    z.v("!32@/B4Tb64lLpJ+zgjqUamJQQBKHm0O5o2b", "qq group onKeyDown");
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    az.xc().h(this.jlb);
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    az.xc().g(this.jlb);
    this.jlb.a(null, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.QQGroupUI
 * JD-Core Version:    0.6.2
 */