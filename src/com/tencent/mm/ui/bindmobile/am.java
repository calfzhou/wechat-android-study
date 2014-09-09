package com.tencent.mm.ui.bindmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class am
  implements View.OnClickListener
{
  am(BindMContactVerifyUI paramBindMContactVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    this.jkn.XF();
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("bindmcontact_mobile", BindMContactVerifyUI.c(this.jkn));
    localBundle.putInt("voice_verify_type", 4);
    localIntent.putExtras(localBundle);
    a.dWo.e(this.jkn, localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.am
 * JD-Core Version:    0.6.2
 */