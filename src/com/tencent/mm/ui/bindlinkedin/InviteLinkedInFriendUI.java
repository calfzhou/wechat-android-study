package com.tencent.mm.ui.bindlinkedin;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.aa.c;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.bj;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.cu;

public class InviteLinkedInFriendUI extends MMActivity
  implements m
{
  private Dialog jjs = null;
  private c jjt = null;
  private EditText jju = null;
  private EditText jjv = null;
  private String jjw = null;
  private String jjx = null;

  protected final void DP()
  {
    a(new s(this));
    this.jjw = getIntent().getStringExtra("intent.key.linkedin.id");
    this.jju = ((EditText)findViewById(i.bZs));
    this.jjv = ((EditText)findViewById(i.bXA));
    this.jjx = getIntent().getStringExtra("intent.key.linkedin.from.name");
    String str1 = getString(n.cDC);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = ch.ja(this.jjx);
    String str2 = String.format(str1, arrayOfObject1);
    this.jju.setText(str2);
    this.jju.setHint(str2);
    this.jju.addTextChangedListener(new aa(this, (byte)0));
    this.jju.clearFocus();
    String str3 = com.tencent.mm.model.x.pH();
    String str4 = com.tencent.mm.model.x.pG();
    String str5 = getString(n.cDz);
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = ch.ja(this.jjx);
    arrayOfObject2[1] = ch.ja(this.jjx);
    if (ch.jb(str3));
    while (true)
    {
      arrayOfObject2[2] = str4;
      String str6 = String.format(str5, arrayOfObject2);
      this.jjv.setText(str6);
      this.jjv.setHint(str6);
      this.jjv.addTextChangedListener(new aa(this, (byte)0));
      this.jjv.clearFocus();
      a(2, getString(n.cDB), new t(this), cu.iMA);
      XF();
      TextView localTextView = (TextView)findViewById(i.caI);
      localTextView.setFocusable(true);
      localTextView.setFocusableInTouchMode(true);
      localTextView.requestFocus();
      localTextView.requestFocusFromTouch();
      return;
      str4 = str3;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (this.jjs != null)
    {
      this.jjs.dismiss();
      this.jjs = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpKrZa84cfNw0U3hfN9RVIOUCExlyxSgXhc=", "[oneliang][onSceneEnd]:ok");
      az.CG().jn(this.jjw);
      finish();
      return;
    }
    if (paramInt2 == 2)
    {
      this.jjs = e.a(this, false, getString(n.cDv), "", getString(n.cDs), getString(n.cDt), new v(this), new w(this));
      return;
    }
    if (paramInt2 == 4)
    {
      this.jjs = e.a(this, getString(n.cDA), "", new x(this));
      return;
    }
    this.jjs = e.a(this, false, getString(n.cDy), "", getString(n.cDw), getString(n.cDt), new y(this), new z(this));
  }

  protected final int getLayoutId()
  {
    return k.cBs;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.cDr);
    DP();
  }

  protected void onPause()
  {
    bg.qX().b(677, this);
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(677, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.InviteLinkedInFriendUI
 * JD-Core Version:    0.6.2
 */