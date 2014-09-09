package android.support.v7.app;

import android.app.ActionBar.Tab;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

final class o extends ActionBar
{
  final Activity iF;
  final android.app.ActionBar iG;
  private ArrayList iH = new ArrayList();
  final a iu;

  public o(Activity paramActivity, a parama)
  {
    this.iF = paramActivity;
    this.iu = parama;
    this.iG = paramActivity.getActionBar();
  }

  public final void a(c paramc)
  {
    this.iG.addTab(((p)paramc).iI);
  }

  public final void aI()
  {
    this.iG.setDisplayShowHomeEnabled(false);
  }

  public final void aJ()
  {
    this.iG.setDisplayShowTitleEnabled(false);
  }

  public final void aK()
  {
    this.iG.setDisplayShowCustomEnabled(true);
  }

  public final c aL()
  {
    ActionBar.Tab localTab = this.iG.newTab();
    p localp = new p(this, localTab);
    localTab.setTag(localp);
    return localp;
  }

  public final View getCustomView()
  {
    return this.iG.getCustomView();
  }

  public final int getDisplayOptions()
  {
    return this.iG.getDisplayOptions();
  }

  public final int getHeight()
  {
    return this.iG.getHeight();
  }

  public final Context getThemedContext()
  {
    return this.iG.getThemedContext();
  }

  public final void hide()
  {
    this.iG.hide();
  }

  public final boolean isShowing()
  {
    return this.iG.isShowing();
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.iG.setBackgroundDrawable(paramDrawable);
  }

  public final void setCustomView(int paramInt)
  {
    this.iG.setCustomView(paramInt);
  }

  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    this.iG.setDisplayHomeAsUpEnabled(paramBoolean);
  }

  public final void setDisplayOptions(int paramInt)
  {
    this.iG.setDisplayOptions(paramInt);
  }

  public final void setIcon(int paramInt)
  {
    this.iG.setIcon(paramInt);
  }

  public final void setLogo(Drawable paramDrawable)
  {
    this.iG.setLogo(paramDrawable);
  }

  public final void show()
  {
    this.iG.show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.o
 * JD-Core Version:    0.6.2
 */