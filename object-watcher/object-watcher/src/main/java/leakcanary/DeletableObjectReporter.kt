package leakcanary

interface DeletableObjectReporter {

  /**
   * Start tracking the provided [target] object, with the expectation that it should be eligible
   * for automatic garbage collection soon, i.e. stop being strongly reachable soon. If [target]
   * stays strongly reachable, [target] will be considered retained. The time at which [target] is
   * considered retained is determined by the [DeletableObjectReporter] implementation.
   *
   * @param target an object expected to not be strongly reachable soon.
   *
   * @param reason reason why the passed in object should be deleted.
   * For example, "MyPresenter received the destroy() callback".
   */
  fun expectDeletionFor(
    target: Any,
    reason: String
  ) : TrackedObjectReachability
}
