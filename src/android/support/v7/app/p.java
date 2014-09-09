package android.support.v7.app;

import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.support.v4.app.l;
import android.support.v4.app.v;
import android.view.View;

final class p extends c
  implements ActionBar.TabListener
{
  final ActionBar.Tab iI;
  private v iJ;
  private CharSequence iK;
  private d iL;

  public p(o paramo, ActionBar.Tab paramTab)
  {
    this.iI = paramTab;
  }

  private v bb()
  {
    if (this.iJ == null)
      this.iJ = this.iM.iu.o().p().g();
    return this.iJ;
  }

  private void bc()
  {
    if ((this.iJ != null) && (!this.iJ.isEmpty()))
      this.iJ.commit();
    this.iJ = null;
  }

  public final c a(d paramd)
  {
    this.iL = paramd;
    ActionBar.Tab localTab = this.iI;
    if (paramd != null);
    for (p localp = this; ; localp = null)
    {
      localTab.setTabListener(localp);
      return this;
    }
  }

  public final c c(CharSequence paramCharSequence)
  {
    this.iI.setText(paramCharSequence);
    return this;
  }

  public final CharSequence getContentDescription()
  {
    return this.iK;
  }

  public final View getCustomView()
  {
    return this.iI.getCustomView();
  }

  public final Drawable getIcon()
  {
    return this.iI.getIcon();
  }

  public final int getPosition()
  {
    return this.iI.getPosition();
  }

  public final CharSequence getText()
  {
    return this.iI.getText();
  }

  public final void onTabReselected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction)
  {
    if (paramFragmentTransaction != null)
      bb();
    bc();
  }

  public final void onTabSelected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction)
  {
    if (paramFragmentTransaction != null)
      bb();
    bc();
  }

  public final void onTabUnselected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction)
  {
    if (paramFragmentTransaction != null)
      bb();
  }

  public final void select()
  {
    this.iI.select();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.p
 * JD-Core Version:    0.6.2
 */