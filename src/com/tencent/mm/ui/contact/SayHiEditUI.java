package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.ui.tools.av;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.cu;

public class SayHiEditUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private EditText jAU;

  protected final void DP()
  {
    this.jAU = ((EditText)findViewById(i.aMJ));
    this.jAU.setFilters(av.hLZ);
    String str = getIntent().getStringExtra("Contact_User");
    int i = getIntent().getIntExtra("Contact_Scene", 18);
    a(0, getString(n.buh), new dm(this, str, i), cu.iMA);
    a(new do(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    int i = 1;
    z.i("!32@/B4Tb64lLpLV0em2rB59lAbnFb3mbD93", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    try
    {
      if (this.dWT == null)
        break label157;
      this.dWT.dismiss();
      this.dWT = null;
      break label157;
      Toast.makeText(this, n.bTQ, 0).show();
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLV0em2rB59lAbnFb3mbD93", "exception in onSceneEnd : " + localException.getMessage());
      return;
    }
    Toast.makeText(this, n.bTS, 0).show();
    label157: 
    while (i == 0)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        e.aw(this, getString(n.bAR));
        finish();
        return;
      }
      Toast.makeText(this, n.bTR, 0).show();
      return;
      switch (paramInt2)
      {
      case -22:
      case -34:
      case -24:
      }
      i = 0;
    }
  }

  protected final int getLayoutId()
  {
    return k.blO;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(30, this);
    oP(n.bTP);
    DP();
  }

  public void onDestroy()
  {
    bg.qX().b(30, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SayHiEditUI
 * JD-Core Version:    0.6.2
 */