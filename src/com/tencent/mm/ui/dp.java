package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.mm.modelsimple.f;

final class dp
  implements DialogInterface.OnCancelListener
{
  dp(Intent paramIntent, Runnable paramRunnable, MMActivity paramMMActivity)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.iMS != null)
    {
      if (this.iMT != null)
        this.iMT.run();
      f.H(this.cHe);
      this.cHe.finish();
      this.cHe.startActivity(this.iMS);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dp
 * JD-Core Version:    0.6.2
 */