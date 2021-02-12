// coroutines

// basically we perform small operations on main thread


// for long operations (n/w,file download,image loading,db queries)

// instead of main thread
// we can create worker or background thread

// Background Thread1

// Coroutine 1
// File Upload

// Coroutine 2
// Network Operation

// Coroutine 3
// File Download

// Coroutine 4
// Image Loading

// coroutines are light weight threads which can run in parallel