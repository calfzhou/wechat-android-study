package com.tencent.mm.ui.bindlinkedin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.model.x;

final class v
  implements DialogInterface.OnClickListener
{
  v(InviteLinkedInFriendUI paramInviteLinkedInFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", "http://www.linkedin.com/bind/plugin/");
    localIntent.putExtra("geta8key_username", x.pG());
    localIntent.putExtra("geta8key_scene", 17);
    a.a(this.jjy, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent, 100);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.v
 * JD-Core Version:    0.6.2
 */