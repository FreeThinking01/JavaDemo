package com.bupt.JavaBasic.JavaBasic;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-02-21 22:01
 * @description: 获取指定位置在文本文件第几行
 **/
public class getCharAtLine {
    public static void main(String[] args) {
        String str = "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef long int ptrdiff_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef long unsigned int size_t;\n" +
                "typedef int wchar_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef unsigned char __u_char;\n" +
                "typedef unsigned short int __u_short;\n" +
                "typedef unsigned int __u_int;\n" +
                "typedef unsigned long int __u_long;\n" +
                "\n" +
                "\n" +
                "typedef signed char __int8_t;\n" +
                "typedef unsigned char __uint8_t;\n" +
                "typedef signed short int __int16_t;\n" +
                "typedef unsigned short int __uint16_t;\n" +
                "typedef signed int __int32_t;\n" +
                "typedef unsigned int __uint32_t;\n" +
                "\n" +
                "typedef signed long int __int64_t;\n" +
                "typedef unsigned long int __uint64_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef long int __quad_t;\n" +
                "typedef unsigned long int __u_quad_t;\n" +
                "\n" +
                "\n" +
                "typedef unsigned long int __dev_t;\n" +
                "typedef unsigned int __uid_t;\n" +
                "typedef unsigned int __gid_t;\n" +
                "typedef unsigned long int __ino_t;\n" +
                "typedef unsigned long int __ino64_t;\n" +
                "typedef unsigned int __mode_t;\n" +
                "typedef unsigned long int __nlink_t;\n" +
                "typedef long int __off_t;\n" +
                "typedef long int __off64_t;\n" +
                "typedef int __pid_t;\n" +
                "typedef struct { int __val[2]; } __fsid_t;\n" +
                "typedef long int __clock_t;\n" +
                "typedef unsigned long int __rlim_t;\n" +
                "typedef unsigned long int __rlim64_t;\n" +
                "typedef unsigned int __id_t;\n" +
                "typedef long int __time_t;\n" +
                "typedef unsigned int __useconds_t;\n" +
                "typedef long int __suseconds_t;\n" +
                "\n" +
                "typedef int __daddr_t;\n" +
                "typedef int __key_t;\n" +
                "\n" +
                "\n" +
                "typedef int __clockid_t;\n" +
                "\n" +
                "\n" +
                "typedef void * __timer_t;\n" +
                "\n" +
                "\n" +
                "typedef long int __blksize_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef long int __blkcnt_t;\n" +
                "typedef long int __blkcnt64_t;\n" +
                "\n" +
                "\n" +
                "typedef unsigned long int __fsblkcnt_t;\n" +
                "typedef unsigned long int __fsblkcnt64_t;\n" +
                "\n" +
                "\n" +
                "typedef unsigned long int __fsfilcnt_t;\n" +
                "typedef unsigned long int __fsfilcnt64_t;\n" +
                "\n" +
                "\n" +
                "typedef long int __fsword_t;\n" +
                "\n" +
                "typedef long int __ssize_t;\n" +
                "\n" +
                "\n" +
                "typedef long int __syscall_slong_t;\n" +
                "\n" +
                "typedef unsigned long int __syscall_ulong_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef __off64_t __loff_t;\n" +
                "typedef __quad_t *__qaddr_t;\n" +
                "typedef char *__caddr_t;\n" +
                "\n" +
                "\n" +
                "typedef long int __intptr_t;\n" +
                "\n" +
                "\n" +
                "typedef unsigned int __socklen_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "struct _IO_FILE;\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef struct _IO_FILE FILE;\n" +
                "typedef struct _IO_FILE __FILE;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef struct\n" +
                "{\n" +
                "  int __count;\n" +
                "  union\n" +
                "  {\n" +
                "\n" +
                "    unsigned int __wch;\n" +
                "\n" +
                "\n" +
                "\n" +
                "    char __wchb[4];\n" +
                "  } __value;\n" +
                "} __mbstate_t;\n" +
                "typedef struct\n" +
                "{\n" +
                "  __off_t __pos;\n" +
                "  __mbstate_t __state;\n" +
                "} _G_fpos_t;\n" +
                "typedef struct\n" +
                "{\n" +
                "  __off64_t __pos;\n" +
                "  __mbstate_t __state;\n" +
                "} _G_fpos64_t;\n" +
                "typedef va_list;\n" +
                "typedef __gnuc_va_list;\n" +
                "struct _IO_jump_t; struct _IO_FILE;\n" +
                "typedef void _IO_lock_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "struct _IO_marker {\n" +
                "  struct _IO_marker *_next;\n" +
                "  struct _IO_FILE *_sbuf;\n" +
                "\n" +
                "\n" +
                "\n" +
                "  int _pos;\n" +
                "};\n" +
                "\n" +
                "\n" +
                "enum __codecvt_result\n" +
                "{\n" +
                "  __codecvt_ok,\n" +
                "  __codecvt_partial,\n" +
                "  __codecvt_error,\n" +
                "  __codecvt_noconv\n" +
                "};\n" +
                "struct _IO_FILE {\n" +
                "  int _flags;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  char* _IO_read_ptr;\n" +
                "  char* _IO_read_end;\n" +
                "  char* _IO_read_base;\n" +
                "  char* _IO_write_base;\n" +
                "  char* _IO_write_ptr;\n" +
                "  char* _IO_write_end;\n" +
                "  char* _IO_buf_base;\n" +
                "  char* _IO_buf_end;\n" +
                "\n" +
                "  char *_IO_save_base;\n" +
                "  char *_IO_backup_base;\n" +
                "  char *_IO_save_end;\n" +
                "\n" +
                "  struct _IO_marker *_markers;\n" +
                "\n" +
                "  struct _IO_FILE *_chain;\n" +
                "\n" +
                "  int _fileno;\n" +
                "\n" +
                "\n" +
                "\n" +
                "  int _flags2;\n" +
                "\n" +
                "  __off_t _old_offset;\n" +
                "\n" +
                "\n" +
                "\n" +
                "  unsigned short _cur_column;\n" +
                "  signed char _vtable_offset;\n" +
                "  char _shortbuf[1];\n" +
                "\n" +
                "\n" +
                "\n" +
                "  _IO_lock_t *_lock;\n" +
                "  __off64_t _offset;\n" +
                "  void *__pad1;\n" +
                "  void *__pad2;\n" +
                "  void *__pad3;\n" +
                "  void *__pad4;\n" +
                "  size_t __pad5;\n" +
                "\n" +
                "  int _mode;\n" +
                "\n" +
                "  char _unused2[15 * sizeof (int) - 4 * sizeof (void *) - sizeof (size_t)];\n" +
                "\n" +
                "};\n" +
                "\n" +
                "\n" +
                "typedef struct _IO_FILE _IO_FILE;\n" +
                "\n" +
                "\n" +
                "struct _IO_FILE_plus;\n" +
                "\n" +
                "extern struct _IO_FILE_plus _IO_2_1_stdin_;\n" +
                "extern struct _IO_FILE_plus _IO_2_1_stdout_;\n" +
                "extern struct _IO_FILE_plus _IO_2_1_stderr_;\n" +
                "typedef __ssize_t __io_read_fn (void *__cookie, char *__buf, size_t __nbytes);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef __ssize_t __io_write_fn (void *__cookie, const char *__buf,\n" +
                "     size_t __n);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef int __io_seek_fn (void *__cookie, __off64_t *__pos, int __w);\n" +
                "\n" +
                "\n" +
                "typedef int __io_close_fn (void *__cookie);\n" +
                "extern int __underflow (_IO_FILE *);\n" +
                "extern int __uflow (_IO_FILE *);\n" +
                "extern int __overflow (_IO_FILE *, int);\n" +
                "extern int _IO_getc (_IO_FILE *__fp);\n" +
                "extern int _IO_putc (int __c, _IO_FILE *__fp);\n" +
                "extern int _IO_feof (_IO_FILE *__fp) ;\n" +
                "extern int _IO_ferror (_IO_FILE *__fp) ;\n" +
                "\n" +
                "extern int _IO_peekc_locked (_IO_FILE *__fp);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern void _IO_flockfile (_IO_FILE *) ;\n" +
                "extern void _IO_funlockfile (_IO_FILE *) ;\n" +
                "extern int _IO_ftrylockfile (_IO_FILE *) ;\n" +
                "extern int _IO_vfscanf (_IO_FILE * , const char * ,\n" +
                "   __gnuc_va_list, int *);\n" +
                "extern int _IO_vfprintf (_IO_FILE *, const char *,\n" +
                "    __gnuc_va_list);\n" +
                "extern __ssize_t _IO_padn (_IO_FILE *, int, __ssize_t);\n" +
                "extern size_t _IO_sgetn (_IO_FILE *, void *, size_t);\n" +
                "\n" +
                "extern __off64_t _IO_seekoff (_IO_FILE *, __off64_t, int, int);\n" +
                "extern __off64_t _IO_seekpos (_IO_FILE *, __off64_t, int);\n" +
                "\n" +
                "extern void _IO_free_backup_area (_IO_FILE *) ;\n" +
                "typedef _G_fpos_t fpos_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern struct _IO_FILE *stdin;\n" +
                "extern struct _IO_FILE *stdout;\n" +
                "extern struct _IO_FILE *stderr;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int remove (const char *__filename) ;\n" +
                "\n" +
                "extern int rename (const char *__old, const char *__new) ;\n" +
                "extern FILE *tmpfile (void) ;\n" +
                "extern char *tmpnam (char *__s) ;\n" +
                "extern int fclose (FILE *__stream);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int fflush (FILE *__stream);\n" +
                "extern FILE *fopen (const char * __filename,\n" +
                "      const char * __modes) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern FILE *freopen (const char * __filename,\n" +
                "        const char * __modes,\n" +
                "        FILE * __stream) ;\n" +
                "extern void setbuf (FILE * __stream, char * __buf) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int setvbuf (FILE * __stream, char * __buf,\n" +
                "      int __modes, size_t __n) ;\n" +
                "extern int fprintf (FILE * __stream,\n" +
                "      const char * __format, ...);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int printf (const char * __format, ...);\n" +
                "\n" +
                "extern int sprintf (char * __s,\n" +
                "      const char * __format, ...) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int vfprintf (FILE * __s, const char * __format,\n" +
                "       __gnuc_va_list __arg);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int vprintf (const char * __format, __gnuc_va_list __arg);\n" +
                "\n" +
                "extern int vsprintf (char * __s, const char * __format,\n" +
                "       __gnuc_va_list __arg) ;\n" +
                "extern int fscanf (FILE * __stream,\n" +
                "     const char * __format, ...) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int scanf (const char * __format, ...) ;\n" +
                "\n" +
                "extern int sscanf (const char * __s,\n" +
                "     const char * __format, ...) ;\n" +
                "extern int fgetc (FILE *__stream);\n" +
                "extern int getc (FILE *__stream);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int getchar (void);\n" +
                "extern int fputc (int __c, FILE *__stream);\n" +
                "extern int putc (int __c, FILE *__stream);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int putchar (int __c);\n" +
                "extern char *fgets (char * __s, int __n, FILE * __stream)\n" +
                "          ;\n" +
                "extern char *gets (char *__s) ;\n" +
                "extern int fputs (const char * __s, FILE * __stream);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int puts (const char *__s);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int ungetc (int __c, FILE *__stream);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern size_t fread (void * __ptr, size_t __size,\n" +
                "       size_t __n, FILE * __stream) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern size_t fwrite (const void * __ptr, size_t __size,\n" +
                "        size_t __n, FILE * __s);\n" +
                "extern int fseek (FILE *__stream, long int __off, int __whence);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern long int ftell (FILE *__stream) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern void rewind (FILE *__stream);\n" +
                "extern int fgetpos (FILE * __stream, fpos_t * __pos);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int fsetpos (FILE *__stream, const fpos_t *__pos);\n" +
                "extern void clearerr (FILE *__stream) ;\n" +
                "\n" +
                "extern int feof (FILE *__stream) ;\n" +
                "\n" +
                "extern int ferror (FILE *__stream) ;\n" +
                "extern void perror (const char *__s);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef struct\n" +
                "  {\n" +
                "    int quot;\n" +
                "    int rem;\n" +
                "  } div_t;\n" +
                "\n" +
                "\n" +
                "\n" +
                "typedef struct\n" +
                "  {\n" +
                "    long int quot;\n" +
                "    long int rem;\n" +
                "  } ldiv_t;\n" +
                "extern size_t __ctype_get_mb_cur_max (void) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern double atof (const char *__nptr)\n" +
                "                                                     ;\n" +
                "\n" +
                "extern int atoi (const char *__nptr)\n" +
                "                                                     ;\n" +
                "\n" +
                "extern long int atol (const char *__nptr)\n" +
                "                                                     ;\n" +
                "extern double strtod (const char * __nptr,\n" +
                "        char ** __endptr)\n" +
                "                            ;\n" +
                "extern long int strtol (const char * __nptr,\n" +
                "   char ** __endptr, int __base)\n" +
                "                            ;\n" +
                "\n" +
                "extern unsigned long int strtoul (const char * __nptr,\n" +
                "      char ** __endptr, int __base)\n" +
                "                            ;\n" +
                "extern int rand (void) ;\n" +
                "\n" +
                "extern void srand (unsigned int __seed) ;\n" +
                "extern void *malloc (size_t __size) ;\n" +
                "\n" +
                "extern void *calloc (size_t __nmemb, size_t __size)\n" +
                "                                       ;\n" +
                "extern void *realloc (void *__ptr, size_t __size)\n" +
                "                                             ;\n" +
                "\n" +
                "extern void free (void *__ptr) ;\n" +
                "extern void abort (void) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern int atexit (void (*__func) (void)) ;\n" +
                "extern void exit (int __status) ;\n" +
                "extern char *getenv (const char *__name) ;\n" +
                "extern int system (const char *__command) ;\n" +
                "typedef int (*__compar_fn_t) (const void *, const void *);\n" +
                "extern void *bsearch (const void *__key, const void *__base,\n" +
                "        size_t __nmemb, size_t __size, __compar_fn_t __compar)\n" +
                "                                ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern void qsort (void *__base, size_t __nmemb, size_t __size,\n" +
                "     __compar_fn_t __compar) ;\n" +
                "extern int abs (int __x) ;\n" +
                "extern long int labs (long int __x) ;\n" +
                "extern div_t div (int __numer, int __denom)\n" +
                "                                              ;\n" +
                "extern ldiv_t ldiv (long int __numer, long int __denom)\n" +
                "                                              ;\n" +
                "extern int mblen (const char *__s, size_t __n) ;\n" +
                "\n" +
                "\n" +
                "extern int mbtowc (wchar_t * __pwc,\n" +
                "     const char * __s, size_t __n) ;\n" +
                "\n" +
                "\n" +
                "extern int wctomb (char *__s, wchar_t __wchar) ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "extern size_t mbstowcs (wchar_t * __pwcs,\n" +
                "   const char * __s, size_t __n) ;\n" +
                "\n" +
                "extern size_t wcstombs (char * __s,\n" +
                "   const wchar_t * __pwcs, size_t __n)\n" +
                "            ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "_Bool is_leap_year(int year)\n" +
                "{\n" +
                " return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));\n" +
                "}\n" +
                "\n" +
                "\n" +
                "_Bool is_valid_date(int year, int month, int day)\n" +
                "{\n" +
                " if(day > 0)\n" +
                " {\n" +
                "  switch(month)\n" +
                "  {\n" +
                "  case 1: return day <= 31;\n" +
                "  case 2:\n" +
                "  {\n" +
                "   if(is_leap_year(year))\n" +
                "   {\n" +
                "    return day <= 29;\n" +
                "   }\n" +
                "   else\n" +
                "   {\n" +
                "    return day <= 28;\n" +
                "   }\n" +
                "  }\n" +
                "  case 3: return day <= 31;\n" +
                "  case 4: return day <= 30;\n" +
                "  case 5: return day <= 31;\n" +
                "  case 6: return day <= 30;\n" +
                "  case 7: return day <= 31;\n" +
                "  case 8: return day <= 31;\n" +
                "  case 9: return day <= 30;\n" +
                "  case 10: return day <= 31;\n" +
                "  case 11: return day <= 30;\n" +
                "  case 12: return day <= 31;\n" +
                "  default: return 0;\n" +
                "  }\n" +
                " }\n" +
                " else\n" +
                " {\n" +
                "  return 0;\n" +
                " }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "int count_date(int year, int month, int day)\n" +
                "{\n" +
                " int counter;\n" +
                " switch(month)\n" +
                " {\n" +
                " case 1: counter=0; break;\n" +
                "    case 2: counter=31; break;\n" +
                "    case 3: counter=59; break;\n" +
                "    case 4: counter=90; break;\n" +
                "    case 5: counter=120; break;\n" +
                "    case 6: counter=151; break;\n" +
                "    case 7: counter=181; break;\n" +
                "    case 8: counter=212; break;\n" +
                "    case 9: counter=243; break;\n" +
                "    case 10: counter=273; break;\n" +
                "    case 11: counter=304; break;\n" +
                "    case 12:\n" +
                " default: counter=334; break;\n" +
                " }\n" +
                "\n" +
                " counter = counter + day;\n" +
                " if(is_leap_year(year) && month > 2)\n" +
                " {\n" +
                "  counter++;\n" +
                " }\n" +
                "\n" +
                " return counter;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "int main(int argc, char *argv[]) {\n" +
                "    int day, month,year, counter;\n" +
                "    if(argc > 3)\n" +
                "    {\n" +
                "        year = atoi(argv[1]);\n" +
                "        month = atoi(argv[2]);\n" +
                "        day = atoi(argv[3]);\n" +
                "        if(is_valid_date(year, month, day))\n" +
                "        {\n" +
                "         counter = count_date(year, month, day);\n" +
                "         fprintf(stdout, \"%d-%d is the %dth day in %d.\\n\", month, day, counter, year);\n" +
                "        }\n" +
                "        else\n" +
                "        {\n" +
                "         fprintf(stdout, \"%d-%d-%d is not valid date.\\n\", year, month, day);\n" +
                "        }\n" +
                "        return 0;\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "     fprintf(stderr, \"Usage: a.exe year month day\\n\");\n" +
                "     return 1;\n" +
                "    }\n" +
                "}";
        int location = 10666;
        int line = 1;
        for(int i = 0; i < location; i++){
            if(str.charAt(i) == '\n'){
                line++;
            }
        }
        System.out.println(line);
    }
}
