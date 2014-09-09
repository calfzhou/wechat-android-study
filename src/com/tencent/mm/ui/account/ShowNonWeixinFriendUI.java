package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.ui.MMActivity;

public class ShowNonWeixinFriendUI extends MMActivity
  implements p
{
  private long iSG = 0L;
  private String iSH = "";

  protected final void DP()
  {
    ImageView localImageView = (ImageView)findViewById(i.ayF);
    TextView localTextView1 = (TextView)findViewById(i.ayH);
    TextView localTextView2 = (TextView)findViewById(i.ayI);
    localImageView.setBackgroundDrawable(a.n(this, h.Uv));
    localImageView.setImageBitmap(c.eH(this.iSG));
    localTextView1.setText(this.iSH);
    int i = n.ayI;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.iSH;
    localTextView2.setText(getString(i, arrayOfObject));
    a(new jt(this));
    ((Button)findViewById(i.ayG)).setOnClickListener(new ju(this));
  }

  public final void eX(String paramString)
  {
    DP();
  }

  protected final int getLayoutId()
  {
    return k.beM;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bPb);
    this.iSG = getIntent().getLongExtra("Contact_KFacebookId", 0L);
    this.iSH = getIntent().getStringExtra("Contact_KFacebookName");
    DP();
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
 * Qualified Name:     com.tencent.mm.ui.account.ShowNonWeixinFriendUI
 * JD-Core Version:    0.6.2
 */