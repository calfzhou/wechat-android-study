package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ag.c;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;

public class ContactRemarkInfoViewUI extends MMActivity
{
  private String cUj;
  private String dBi;
  private com.tencent.mm.storage.i elz;
  private TextView jyQ;
  private TextView jyR;
  private ImageView jyU;
  private int jza;
  private String jzb;
  private boolean jzd = false;
  private View jzq;
  private View jzr;
  private String username;

  private void aWU()
  {
    Bitmap localBitmap = c.yU().hn(this.username);
    if (localBitmap != null)
    {
      this.jyU.setImageBitmap(localBitmap);
      this.jzd = true;
    }
  }

  private void initData()
  {
    this.elz = bg.qW().oT().ys(this.username);
    this.jzb = this.elz.od();
    this.cUj = this.elz.jC();
    this.dBi = this.elz.jD();
  }

  protected final void DP()
  {
    this.jyQ = ((TextView)findViewById(com.tencent.mm.i.anY));
    this.jyR = ((TextView)findViewById(com.tencent.mm.i.anW));
    this.jyU = ((ImageView)findViewById(com.tencent.mm.i.aLO));
    this.jzq = findViewById(com.tencent.mm.i.aot);
    this.jzr = findViewById(com.tencent.mm.i.aou);
    oP(n.bCg);
    this.jyU.setOnClickListener(new ce(this));
    a(0, getString(n.bta), new cf(this));
    a(new cg(this));
  }

  protected final int getLayoutId()
  {
    return k.bdM;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jza = getIntent().getIntExtra("Contact_Scene", 9);
    this.username = getIntent().getStringExtra("Contact_User");
    if (ap.jb(this.username))
    {
      finish();
      return;
    }
    initData();
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onResume()
  {
    super.onResume();
    initData();
    this.jyQ.setText(com.tencent.mm.ar.b.f(this, ap.ja(this.jzb), (int)this.jyQ.getTextSize()));
    if (!ap.jb(this.cUj))
    {
      this.jzq.setVisibility(0);
      this.jyR.setText(ap.ja(this.cUj));
    }
    while (!ap.jb(this.dBi))
    {
      this.jzr.setVisibility(0);
      if (!c.yU().hl(this.username))
      {
        c.yU().a(this.username, this.dBi, new ch(this));
        return;
        this.jzq.setVisibility(8);
      }
      else
      {
        aWU();
        return;
      }
    }
    this.jzr.setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoViewUI
 * JD-Core Version:    0.6.2
 */