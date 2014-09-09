package com.tencent.mm.ui.pluginapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;

final class f
  implements View.OnClickListener
{
  f(AddMoreFriendsUI paramAddMoreFriendsUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
    a.b(this.jKD, "search", ".ui.SearchUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.f
 * JD-Core Version:    0.6.2
 */