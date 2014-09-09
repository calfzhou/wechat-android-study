package android.support.v7.app;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

final class j
  implements Window.Callback
{
  final Window.Callback hV;

  public j(i parami, Window.Callback paramCallback)
  {
    this.hV = paramCallback;
  }

  public final boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return this.hV.dispatchGenericMotionEvent(paramMotionEvent);
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return this.hV.dispatchKeyEvent(paramKeyEvent);
  }

  public final boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    return this.hV.dispatchKeyShortcutEvent(paramKeyEvent);
  }

  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return this.hV.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.hV.dispatchTouchEvent(paramMotionEvent);
  }

  public final boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    return this.hV.dispatchTrackballEvent(paramMotionEvent);
  }

  public final void onActionModeFinished(ActionMode paramActionMode)
  {
    this.hV.onActionModeFinished(paramActionMode);
    this.hW.onActionModeFinished(paramActionMode);
  }

  public final void onActionModeStarted(ActionMode paramActionMode)
  {
    this.hV.onActionModeStarted(paramActionMode);
    this.hW.onActionModeStarted(paramActionMode);
  }

  public final void onAttachedToWindow()
  {
    this.hV.onAttachedToWindow();
  }

  public final void onContentChanged()
  {
    this.hV.onContentChanged();
  }

  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return this.hV.onCreatePanelMenu(paramInt, paramMenu);
  }

  public final View onCreatePanelView(int paramInt)
  {
    return this.hV.onCreatePanelView(paramInt);
  }

  public final void onDetachedFromWindow()
  {
    this.hV.onDetachedFromWindow();
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return this.hV.onMenuItemSelected(paramInt, paramMenuItem);
  }

  public final boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return this.hV.onMenuOpened(paramInt, paramMenu);
  }

  public final void onPanelClosed(int paramInt, Menu paramMenu)
  {
    this.hV.onPanelClosed(paramInt, paramMenu);
  }

  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return this.hV.onPreparePanel(paramInt, paramView, paramMenu);
  }

  public final boolean onSearchRequested()
  {
    return this.hV.onSearchRequested();
  }

  public final void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    this.hV.onWindowAttributesChanged(paramLayoutParams);
  }

  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    this.hV.onWindowFocusChanged(paramBoolean);
  }

  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return this.hV.onWindowStartingActionMode(paramCallback);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.j
 * JD-Core Version:    0.6.2
 */