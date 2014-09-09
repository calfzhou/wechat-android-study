package com.tencent.mm.ui.friend;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class j
  implements View.OnClickListener
{
  j(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    z.d("!44@/B4Tb64lLpISOYcLaKm7W93grpYn2xfC5yJeWqznlqY=", "initNoNew, goto FMessageConversationUI");
    Intent localIntent = new Intent(f.d(this.jIa), FMessageConversationUI.class);
    f.d(this.jIa).startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.j
 * JD-Core Version:    0.6.2
 */