package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.modelfriend.an;
import com.tencent.mm.modelfriend.au;
import com.tencent.mm.modelfriend.c;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.tools.fj;
import java.util.List;

public class MobileFriendUI extends MMActivity
  implements m
{
  private ListView dWQ;
  private View dWS;
  private ProgressDialog dWT = null;
  private String dWU;
  private TextView ekL = null;
  private TextView iOn = null;
  private bm jkO;
  private au jkP;

  private void Zw()
  {
    if (!aa.wa())
    {
      ActionBarActivity localActionBarActivity = aPI();
      getString(n.buo);
      this.dWT = e.a(localActionBarActivity, getString(n.bSJ), true, new bp(this));
      if (this.jkO.getCount() != 0)
        break label87;
      if ((!c.a(new bt(this))) && (this.dWT != null))
      {
        this.dWT.dismiss();
        this.dWT = null;
      }
    }
    return;
    label87: List localList1 = aa.vN();
    List localList2 = aa.wh();
    if (((localList1 != null) && (localList1.size() != 0)) || ((localList2 != null) && (localList2.size() != 0)))
    {
      this.jkP = new au(aa.vN(), aa.wh());
      bg.qX().d(this.jkP);
      return;
    }
    an localan = new an();
    bg.qX().d(localan);
  }

  protected final void DP()
  {
    this.ekL = ((TextView)findViewById(i.aEC));
    this.ekL.setText(n.bSH);
    this.iOn = ((TextView)findViewById(i.arx));
    this.iOn.setText(n.bSO);
    this.dWS = findViewById(i.aEF);
    this.dWQ = ((ListView)findViewById(i.aEE));
    fj localfj = new fj(true, true);
    localfj.a(new bu(this));
    a(localfj);
    this.jkO = new bm(this, new bv(this));
    this.dWQ.setAdapter(this.jkO);
    this.dWQ.setOnItemClickListener(new bw(this));
    this.jkO.a(new bx(this));
    if ((aa.wb() != ab.dtS) && (aa.wb() != ab.dtT))
    {
      this.dWS = findViewById(i.aEF);
      this.dWS.setVisibility(0);
      this.dWS.setOnClickListener(new by(this));
      this.dWQ.setVisibility(8);
    }
    a(new bz(this));
    new ca(this);
    if ((!com.tencent.mm.model.x.qe()) || (aa.wa()))
      e.a(this, n.bwc, n.buo, n.btQ, n.bsK, new bq(this), new br(this));
  }

  public final void DQ()
  {
    if (this.jkO != null)
      this.jkO.jI(this.dWU);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!32@/B4Tb64lLpLFDma4Qh7ELOVLkIWClC8Q", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramx.getType() == 32) && (this.dWT != null))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
      z.e("!32@/B4Tb64lLpLFDma4Qh7ELOVLkIWClC8Q", "onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramx.getType() == 133)
    {
      an localan = new an();
      bg.qX().d(localan);
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramx.getType() == 32)
        f.I(getApplicationContext());
      this.jkO.a(null, null);
    }
    while (paramx.getType() != 32)
      return;
    Toast.makeText(this, n.bSI, 0).show();
  }

  protected final int getLayoutId()
  {
    return k.bjN;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bSK);
    bg.qX().a(32, this);
    bg.qX().a(133, this);
    DP();
    Zw();
  }

  public void onDestroy()
  {
    bg.qX().b(32, this);
    bg.qX().b(133, this);
    this.jkO.closeCursor();
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    this.jkO.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.MobileFriendUI
 * JD-Core Version:    0.6.2
 */