package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public class SendImgProxyUI extends Activity
{
  private static boolean dmB = false;
  private cr iIO = null;

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(dmB);
    arrayOfObject[1] = Integer.valueOf(hashCode());
    z.i("!32@/B4Tb64lLpLg4gwftVtZgiXDZ+lAxGZd", "onCreate isRunning:%b ,%d", arrayOfObject);
    if (dmB)
    {
      z.w("!32@/B4Tb64lLpLg4gwftVtZgiXDZ+lAxGZd", "duplicate instance");
      finish();
      return;
    }
    dmB = true;
    setContentView(k.bkq);
    if (!bg.oE())
    {
      z.i("!32@/B4Tb64lLpLg4gwftVtZgiXDZ+lAxGZd", "AccHasNotReady");
      bg.rb();
    }
    this.iIO = e.a(this, getString(n.bRf), false, null);
    bg.qQ().aHo();
    bg.qQ().n(new nf(this));
  }

  protected void onDestroy()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(dmB);
    arrayOfObject[1] = Integer.valueOf(hashCode());
    z.i("!32@/B4Tb64lLpLg4gwftVtZgiXDZ+lAxGZd", "onDestroy isRunning:%b , %d", arrayOfObject);
    super.onDestroy();
  }

  public void onResume()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(dmB);
    arrayOfObject[1] = Integer.valueOf(hashCode());
    z.i("!32@/B4Tb64lLpLg4gwftVtZgiXDZ+lAxGZd", "onResume isRunning:%b ,%d", arrayOfObject);
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.SendImgProxyUI
 * JD-Core Version:    0.6.2
 */