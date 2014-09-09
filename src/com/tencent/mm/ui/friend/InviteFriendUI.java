package com.tencent.mm.ui.friend;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.a.f;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.pluginsdk.ui.tools.t;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;

public class InviteFriendUI extends MMActivity
  implements p
{
  private ImageView dtI;
  private String jIJ;
  private int jIK;
  private String jIL;
  private String jIM;
  private String jIN;
  private Button jIO;
  private int jIP;
  private int jIQ;
  private String jIR = null;
  private String jjw = null;

  protected final void DP()
  {
    this.dtI = ((ImageView)findViewById(com.tencent.mm.i.ayF));
    TextView localTextView1 = (TextView)findViewById(com.tencent.mm.i.ayH);
    TextView localTextView2 = (TextView)findViewById(com.tencent.mm.i.ayJ);
    TextView localTextView3 = (TextView)findViewById(com.tencent.mm.i.ayI);
    this.jIO = ((Button)findViewById(com.tencent.mm.i.ayG));
    Button localButton = (Button)findViewById(com.tencent.mm.i.ayK);
    localTextView1.setText(this.jIL);
    int i = n.ayI;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.jIL;
    localTextView3.setText(getString(i, arrayOfObject));
    String str;
    Bitmap localBitmap4;
    label211: long l;
    if (this.jIK == 1)
    {
      this.dtI.setBackgroundDrawable(a.n(this, h.Uv));
      localTextView2.setText(getString(n.btp) + this.jIJ);
      str = f.d(this.jIJ.getBytes());
      if (!bg.qW().isSDCardAvailable())
      {
        localBitmap4 = af.sh().x(ak.getContext());
        if (localBitmap4 == null)
          break label567;
        this.dtI.setImageBitmap(localBitmap4);
      }
    }
    else if (this.jIK == 0)
    {
      this.dtI.setBackgroundDrawable(a.n(this, h.Ux));
      localTextView2.setText(getString(n.btr) + this.jIJ);
      l = com.tencent.mm.a.k.ai(this.jIJ);
      if (l == 0L)
        break label638;
    }
    label306: label567: label596: label608: label625: label638: for (Bitmap localBitmap3 = c.A(l); ; localBitmap3 = null)
    {
      Bitmap localBitmap2;
      if (localBitmap3 == null)
      {
        this.dtI.setImageDrawable(a.n(this, h.Ux));
        localButton.setVisibility(0);
        if (this.jIK == 2)
        {
          this.jIO.setText(n.bMY);
          this.dtI.setBackgroundDrawable(a.n(this, h.Uu));
          localTextView2.setText(getString(n.btm) + this.jIJ);
          if (bg.qW().isSDCardAvailable())
            break label596;
          localBitmap2 = af.sh().x(ak.getContext());
          if (localBitmap2 == null)
            break label608;
          this.dtI.setImageBitmap(localBitmap2);
          if (TextUtils.isEmpty(this.jIL))
            localTextView1.setText(ch.xE(this.jIJ));
        }
        if (this.jIK == 3)
        {
          this.jIO.setText(n.cDq);
          Bitmap localBitmap1 = s.a(new t(this.jIR, this.jIR, 0, 0));
          if (localBitmap1 == null)
            break label625;
          this.dtI.setImageBitmap(localBitmap1);
        }
      }
      while (true)
      {
        localButton.setVisibility(8);
        this.jIO.setOnClickListener(new bi(this));
        localButton.setOnClickListener(new bp(this));
        a(new bq(this));
        return;
        com.tencent.mm.modelfriend.i locali = az.wZ().gn(str);
        if (locali != null)
        {
          localBitmap4 = aa.c(locali.vv(), this);
          break;
        }
        localBitmap4 = null;
        break;
        this.dtI.setImageDrawable(a.n(this, h.Uv));
        break label211;
        this.dtI.setImageBitmap(localBitmap3);
        break label306;
        localBitmap2 = c.eE(this.jIM);
        break label395;
        this.dtI.setImageDrawable(a.n(this, h.Uu));
        break label409;
        this.dtI.setImageResource(h.WL);
      }
    }
  }

  public final void eX(String paramString)
  {
    if ((this.jIJ == null) || (this.jIJ.equals("")));
    long l;
    do
    {
      return;
      l = c.eJ(paramString);
    }
    while ((l <= 0L) || (!this.jIJ.equals(String.valueOf(l))) || (this.jIK != 0));
    this.dtI.setImageBitmap(c.a(paramString, false, -1));
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bgQ;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bPb);
    Intent localIntent = getIntent();
    this.jIK = localIntent.getIntExtra("friend_type", -1);
    this.jIL = localIntent.getStringExtra("friend_nick");
    this.jIJ = localIntent.getStringExtra("friend_num");
    this.jIM = localIntent.getStringExtra("friend_googleID");
    this.jIN = localIntent.getStringExtra("friend_googleItemID");
    this.jIJ = ch.ja(this.jIJ);
    this.jjw = localIntent.getStringExtra("friend_linkedInID");
    this.jIR = localIntent.getStringExtra("friend_linkedInPicUrl");
    DP();
    this.jIP = localIntent.getIntExtra("search_kvstat_scene", 0);
    this.jIQ = localIntent.getIntExtra("search_kvstat_position", 0);
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    af.sh().e(this);
  }

  protected void onResume()
  {
    super.onResume();
    af.sh().d(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.InviteFriendUI
 * JD-Core Version:    0.6.2
 */