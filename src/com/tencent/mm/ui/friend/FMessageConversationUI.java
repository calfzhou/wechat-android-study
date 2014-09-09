package com.tencent.mm.ui.friend;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.aj.a;
import com.tencent.mm.aj.l;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.tools.ei;

public class FMessageConversationUI extends MMActivity
{
  private cm ekP = new ae(this);
  private String fDn;
  private m jHV;
  private ListView jIo;
  private e jIp;

  protected final void DP()
  {
    this.jHV = new m(aPI());
    l.AF().g(this.jHV);
    this.jHV.a(new w(this));
    this.jHV.a(new x(this));
    this.jHV.a(new y(this));
    this.jHV.a(new z(this));
    this.jIo = ((ListView)findViewById(i.aug));
    this.jIo.setAdapter(this.jHV);
    ei localei = new ei(this);
    this.jIo.setOnItemLongClickListener(new aa(this, localei));
    this.jIp = new e(aPI(), this.jHV);
    this.jIo.setOnItemClickListener(this.jIp);
    TextView localTextView = (TextView)findViewById(i.arE);
    localTextView.setOnClickListener(new ab(this));
    this.jIo.setEmptyView(localTextView);
    a(0, getString(n.bSv), new ac(this));
    a(new ad(this));
  }

  protected final int getLayoutId()
  {
    return k.bfL;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bJO);
    DP();
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    a locala = (a)this.jHV.getItem(localAdapterContextMenuInfo.position);
    if (locala == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "onItemLongClick, item is null, pos = " + localAdapterContextMenuInfo.position);
      return;
    }
    if (!ch.jb(locala.field_displayName))
      paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.e(this, locala.field_displayName, -1));
    paramContextMenu.add(0, 0, 0, n.bsS);
    this.fDn = locala.field_talker;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    l.AF().Av();
    l.AF().h(this.jHV);
  }

  protected void onPause()
  {
    super.onPause();
    bg.qW().oQ().set(143618, Integer.valueOf(0));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.FMessageConversationUI
 * JD-Core Version:    0.6.2
 */