package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.ei;

public class BizConversationUI extends MMActivity
  implements as
{
  private String cEh = "";
  private String dqM;
  private ei eQt;
  private TextView ekL;
  private boolean ekQ = false;
  private com.tencent.mm.q.a enO;
  private com.tencent.mm.ui.base.cm fqj = new f(this);
  private ListView jFa;
  private r jFb;
  private String jFc;
  private boolean jFd = false;
  private com.tencent.mm.sdk.platformtools.cm jFe;
  private com.tencent.mm.storage.r jyv;

  private void aYa()
  {
    if ((this.jFb == null) || (!this.jFd))
      return;
    if (this.jFe == null)
      this.jFe = new h(this);
    while (true)
    {
      this.jFe.sendEmptyMessageDelayed(1, 500L);
      return;
      this.jFe.removeMessages(1);
    }
  }

  protected final void DP()
  {
    Bt(this.jFc);
    this.jFa = ((ListView)findViewById(com.tencent.mm.i.aTn));
    this.ekL = ((TextView)findViewById(com.tencent.mm.i.ary));
    this.ekL.setText(com.tencent.mm.n.bFP);
    a(new a(this));
    new i(this);
    this.enO = com.tencent.mm.q.r.fE(this.dqM);
    if ((this.enO != null) && (this.enO.uh()))
    {
      this.ekL.setText(com.tencent.mm.n.bxZ);
      this.jFd = true;
      a(1, com.tencent.mm.n.brx, com.tencent.mm.h.QM, new j(this));
      com.tencent.mm.storage.i locali = bg.qW().oT().yt(this.dqM);
      if ((locali != null) && (locali.zZ()))
      {
        findViewById(com.tencent.mm.i.anx).setVisibility(0);
        this.ekL.setVisibility(8);
        this.jFa.setVisibility(8);
        return;
      }
      am.b(new g(this, this.dqM), 100L);
    }
    this.jFb = new q(this, this.dqM, new k(this));
    this.jFb.a(new l(this));
    this.jFb.a(new m(this));
    this.jFa.setAdapter(this.jFb);
    this.eQt = new ei(this);
    this.jFa.setOnItemClickListener(new n(this));
    this.jFa.setOnItemLongClickListener(new o(this));
    this.jFb.a(new p(this));
    this.jFb.a(new b(this));
    this.jFb.a(new c(this));
  }

  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    aYa();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.boG;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dqM = getIntent().getStringExtra("enterprise_biz_name");
    if (ch.jb(this.dqM))
      this.dqM = "officialaccounts";
    this.jFc = getIntent().getStringExtra("enterprise_biz_display_name");
    if (ch.jb(this.jFc))
      this.jFc = getString(com.tencent.mm.n.bxs);
    DP();
    bg.qW().oW().a(this.jFb);
    bg.qW().oW().a(this);
    aYa();
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    com.tencent.mm.storage.i locali = bg.qW().oT().ys(this.cEh);
    if (locali == null)
    {
      z.e("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "onCreateContextMenu, contact is null, talker = " + this.cEh);
      return;
    }
    String str = locali.od();
    if ((str.toLowerCase().endsWith("@chatroom")) && (ch.jb(locali.iV())))
      str = getString(com.tencent.mm.n.bAg);
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.e(this, str, -1));
    paramContextMenu.add(localAdapterContextMenuInfo.position, 1, 0, com.tencent.mm.n.bQU);
  }

  public void onDestroy()
  {
    if (bg.oE())
    {
      bg.qW().oW().b(this.jFb);
      bg.qW().oW().b(this);
    }
    if (this.jFb != null)
      this.jFb.onDestroy();
    super.onDestroy();
  }

  public void onPause()
  {
    z.v("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "on pause");
    bg.qW().oW().yF(this.dqM);
    if (this.jFb != null)
      this.jFb.onPause();
    super.onPause();
  }

  public void onResume()
  {
    z.v("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "on resume");
    if (this.jFb != null)
      this.jFb.onResume();
    super.onResume();
    if ((this.jFd) && (!y.di(this.dqM)))
      finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI
 * JD-Core Version:    0.6.2
 */