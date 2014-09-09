package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.cu;

public class MMTextInputUI extends MMActivity
{
  private int emP;
  private TextView jTX;
  private int jTY;
  private boolean jTZ;
  private EditText jgF;
  private int yz;

  private void goBack()
  {
    if (getIntent().getBooleanExtra("key_show_confirm", false))
    {
      e.a(aPI(), getString(n.bWU), "", new er(this), null);
      return;
    }
    XF();
    setResult(0);
    finish();
  }

  protected int getLayoutId()
  {
    return k.bgO;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jgF = ((EditText)findViewById(i.aSC));
    this.jTX = ((TextView)findViewById(i.aRR));
    this.jgF.setHint(ch.Y(getIntent().getStringExtra("key_hint"), ""));
    this.jgF.append(ch.Y(getIntent().getStringExtra("key_value"), ""));
    this.yz = (getIntent().getIntExtra("key_max_count", -1) << 1);
    this.emP = 0;
    this.jTY = Math.max(-120 + this.yz, 9 * this.yz / 10);
    this.jTZ = getIntent().getBooleanExtra("key_nullable", false);
    a(new es(this));
    a(0, getString(n.btB), new et(this), cu.iMA);
    eB(this.jTZ);
    if ((!this.jTZ) || (this.yz > 0))
      this.jgF.addTextChangedListener(new eu(this));
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (4 == paramInt)
    {
      z.i("!32@/B4Tb64lLpL+PDaudyLPDxrxxQBpBrE1", "on back key down");
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
  }

  protected void r(CharSequence paramCharSequence)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMTextInputUI
 * JD-Core Version:    0.6.2
 */