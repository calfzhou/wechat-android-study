package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.q;
import com.tencent.mm.modelfriend.w;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.e;
import java.util.List;

public class FindMContactAddUI extends MMWizardActivity
{
  private m dDA = null;
  private ListView dWQ;
  private ProgressDialog dWT = null;
  private TextView ekL = null;
  private String fAX = null;
  private View fPf;
  private String fUt;
  private String iQR = "";
  private int iQS = 2;
  private int iQp;
  private q jIr;
  private TextView jIs = null;
  private TextView jIt = null;
  private TextView jIu = null;
  private TextView jIv = null;
  private Button jIw = null;
  private List jIx;
  private w jIy = new aj(this);

  private void afq()
  {
    b.jE(this.fUt);
    XF();
    aQl();
  }

  protected final void DP()
  {
    this.ekL = ((TextView)findViewById(i.aEC));
    this.ekL.setText(n.bSH);
    this.dWQ = ((ListView)findViewById(i.aEE));
    if ((this.iQS != 2) && (this.iQS == 1))
    {
      this.fPf = LayoutInflater.from(this).inflate(k.bfD, null);
      this.jIs = ((TextView)this.fPf.findViewById(i.atE));
      this.jIt = ((TextView)this.fPf.findViewById(i.atH));
      this.jIu = ((TextView)this.fPf.findViewById(i.atC));
      this.jIw = ((Button)this.fPf.findViewById(i.atB));
      this.jIt.setText(getString(n.bJI));
      this.jIu.setText(getString(n.bJJ));
      this.jIw.setText(getString(n.bJn));
    }
    while (true)
    {
      this.jIr = new q(this, this.jIy, 1);
      this.jIw.setOnClickListener(new ak(this));
      if (this.jIv != null)
      {
        this.jIv.setOnClickListener(new al(this));
        this.jIv.setVisibility(8);
      }
      this.dWQ.addHeaderView(this.fPf);
      this.dWQ.setAdapter(this.jIr);
      a(0, getString(n.btO), new am(this));
      new an(this);
      return;
      this.fPf = LayoutInflater.from(this).inflate(k.bfC, null);
      this.jIs = ((TextView)this.fPf.findViewById(i.atE));
      this.jIt = ((TextView)this.fPf.findViewById(i.atH));
      this.jIu = ((TextView)this.fPf.findViewById(i.atC));
      this.jIw = ((Button)this.fPf.findViewById(i.atB));
      this.jIt.setText(getString(n.bJI));
      this.jIu.setText(getString(n.bJJ));
      Button localButton = this.jIw;
      int i = n.bJm;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(0);
      localButton.setText(getString(i, arrayOfObject));
      this.jIv = ((TextView)this.fPf.findViewById(i.aEy));
    }
  }

  protected final int getLayoutId()
  {
    return k.bfB;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bJr);
    a.dWp.hY();
    this.fAX = getIntent().getStringExtra("regsetinfo_ticket");
    this.iQR = getIntent().getStringExtra("regsetinfo_NextStep");
    this.iQS = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.iQp = getIntent().getIntExtra("login_type", 0);
    this.fUt = b.DL();
    DP();
  }

  public void onDestroy()
  {
    if (this.dDA != null)
    {
      bg.qX().b(30, this.dDA);
      this.dDA = null;
    }
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      afq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
    if (this.iQp == 1)
    {
      b.b(false, bg.qS() + "," + getClass().getName() + ",R300_300_QQ," + bg.eg("R300_300_QQ") + ",2");
      return;
    }
    b.b(false, bg.qS() + "," + getClass().getName() + ",R300_300_phone," + bg.eg("R300_300_phone") + ",2");
  }

  protected void onResume()
  {
    super.onResume();
    this.jIr.notifyDataSetChanged();
    if (this.iQp == 1)
    {
      b.b(true, bg.qS() + "," + getClass().getName() + ",R300_300_QQ," + bg.eg("R300_300_QQ") + ",1");
      b.jD("R300_300_QQ");
    }
    while (true)
    {
      ActionBarActivity localActionBarActivity = aPI();
      getString(n.buo);
      this.dWT = e.a(localActionBarActivity, getString(n.bSJ), true, new af(this));
      bg.qQ().a(new ai(this));
      return;
      b.b(true, bg.qS() + "," + getClass().getName() + ",R300_300_phone," + bg.eg("R300_300_phone") + ",1");
      b.jD("R300_300_phone");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.FindMContactAddUI
 * JD-Core Version:    0.6.2
 */