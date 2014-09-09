package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;

public class SendFeedBackUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private EditText fGo;
  private TextView jLN = null;

  protected final void DP()
  {
    oP(n.cfD);
    this.fGo = ((EditText)findViewById(i.content));
    String str = getIntent().getStringExtra("intentKeyFrom");
    if ((str != null) && (str.equals("fromEnjoyAppDialog")))
    {
      this.jLN = ((TextView)findViewById(i.aVy));
      this.jLN.setVisibility(0);
      this.jLN.setOnClickListener(new s(this));
    }
    a(new t(this));
    a(0, getString(n.buh), new u(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      e.a(this, getString(n.cfC), getString(n.buo), new w(this));
      return;
    }
    e.a(this, getString(n.cfB), getString(n.buo), new x(this));
  }

  protected final int getLayoutId()
  {
    return k.bek;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onDestroy()
  {
    bg.qX().b(153, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SendFeedBackUI
 * JD-Core Version:    0.6.2
 */