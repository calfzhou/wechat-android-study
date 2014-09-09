package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.storage.ar;

final class fm extends cj
{
  public fm()
  {
    super(38);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = paramLayoutInflater.inflate(k.bdd, null);
      paramView.setTag(new pi(this.fjl).aB(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    paramck.eTC.setVisibility(0);
    TextView localTextView = paramck.eTC;
    Activity localActivity = paramhd.agh();
    long l = paramar.kn();
    localTextView.setText(localActivity.getString(n.bLr) + DateFormat.format(localActivity.getString(n.bLp), l));
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }

  protected final boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.fm
 * JD-Core Version:    0.6.2
 */