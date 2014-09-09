package com.tencent.mm.ui.contact;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.pluginsdk.ui.tools.be;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.dy;
import com.tencent.mm.ui.tools.ei;
import com.tencent.mm.ui.voicesearch.j;

public class ChatroomContactUI extends MMActivity
  implements m
{
  private TextView eOM;
  private ei eQt;
  private com.tencent.mm.pluginsdk.ui.e eue = new com.tencent.mm.pluginsdk.ui.e(new at(this));
  private ListView feW;
  private VoiceSearchLayout iJM;
  private j jxB;
  private String jxD;
  private ContactCountView jxM;
  private cm jxT = new an(this);
  private be jyo;
  private aj jyp;

  private void VC()
  {
    if (this.jyp != null)
      this.jyp.a(null, null);
    if (this.jxB != null)
      this.jxB.a(null, null);
  }

  public final void DP()
  {
    ((TextView)findViewById(i.arK)).setVisibility(8);
    this.feW = ((ListView)findViewById(i.aeA));
    this.feW.setAdapter(null);
    this.eOM = ((TextView)findViewById(i.arK));
    this.eOM.setText(n.bse);
    this.jyp = new aj(this, "@all.chatroom.contact");
    this.jyp.aPz();
    this.jxB = new j(aPI(), 1);
    this.jxB.Dx("@all.chatroom.contact");
    this.jyo = new be((byte)0);
    this.jyo.a(new au(this));
    a(this.jyo);
    this.jyp.a(new av(this));
    this.jyp.a(new aw(this));
    this.jyp.a(new ax(this));
    this.feW.setOnScrollListener(this.eue);
    this.jyp.a(this.eue);
    this.eQt = new ei(aPI());
    this.feW.setOnItemClickListener(new ay(this));
    this.feW.setOnItemLongClickListener(new az(this));
    this.feW.setOnTouchListener(new ba(this));
    ListView localListView = this.feW;
    ContactCountView localContactCountView = new ContactCountView(this);
    this.jxM = localContactCountView;
    localListView.addFooterView(localContactCountView, null, false);
    a(new ao(this));
    a(0, n.brw, h.QB, new ap(this));
    new aq(this);
    this.feW.setAdapter(this.jyp);
    this.jxB.gm(false);
    this.feW.setVisibility(0);
    this.iJM = new VoiceSearchLayout(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(14);
    this.iJM.setLayoutParams(localLayoutParams);
    this.iJM.mw(com.tencent.mm.sdk.platformtools.e.a(this, 100.0F));
    this.iJM.setVisibility(8);
    ((ViewGroup)findViewById(i.aWn)).addView(this.iJM);
    if (this.iJM != null)
      this.iJM.a(new ar(this));
    if (this.jyp.getCount() == 0)
    {
      this.eOM.setSingleLine(false);
      this.eOM.setPadding(40, 0, 40, 0);
      this.eOM.setVisibility(0);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (!com.tencent.mm.platformtools.ap.S(this));
    while ((dy.a(this, paramInt1, paramInt2, paramString, 4)) || (paramInt1 != 0) || (paramInt2 != 0))
      return;
    switch (paramx.getType())
    {
    default:
      return;
    case 38:
    }
    VC();
  }

  protected final int getLayoutId()
  {
    return k.bcc;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.brW);
    DP();
    bg.qX().a(38, this);
    bg.qW().oT().a(this.jyp);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    if (bg.qW().oT().ys(this.jxD) == null)
      z.e("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "onCreateContextMenu, contact is null, username = " + this.jxD);
    while (!com.tencent.mm.model.y.de(this.jxD))
      return;
    paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.e(paramView.getContext(), com.tencent.mm.model.y.dh(this.jxD), -1));
    paramContextMenu.add(localAdapterContextMenuInfo.position, 1, 0, n.bsc);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    bg.qX().b(38, this);
    bg.qW().oT().b(this.jyp);
    this.jyp.detach();
    this.jyp.closeCursor();
    this.jyp.aOD();
    this.jxB.detach();
    this.jxB.closeCursor();
  }

  protected void onPause()
  {
    super.onPause();
    if (this.jyo != null)
      this.jyo.onPause();
    if (this.jxB != null)
      this.jxB.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    if (this.jxM != null)
    {
      this.jxM.aWQ();
      this.jxM.aWR();
    }
    if ((this.jyo != null) && (this.iJM != null))
    {
      a.aCl();
      if ((com.tencent.mm.z.b.ys()) || (!com.tencent.mm.sdk.platformtools.y.aGW().equals("zh_CN")))
        break label95;
      this.jyo.dZ(true);
      this.jyo.r(this.iJM);
    }
    while (true)
    {
      if (this.jxB != null)
        this.jxB.onResume();
      return;
      label95: this.jyo.dZ(false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI
 * JD-Core Version:    0.6.2
 */